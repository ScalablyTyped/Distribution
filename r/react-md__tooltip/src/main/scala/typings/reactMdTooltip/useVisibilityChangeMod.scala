package typings.reactMdTooltip

import typings.reactMdTooltip.useHandlersMod.TooltipInitiated
import typings.reactMdUtils.useModeDetectionMod.UserInteractionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useVisibilityChangeMod {
  
  @JSImport("@react-md/tooltip/types/useVisibilityChange", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useVisiblityChange(hasOnShowOnHideVisibleMode: VisibilityChangeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useVisiblityChange")(hasOnShowOnHideVisibleMode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait VisibilityChangeOptions extends StObject {
    
    var mode: TooltipInitiated
    
    /**
      * An optional function to call after the tooltip becomes visible.
      */
    var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * An optional function to call after the tooltip becomes visible. You will be
      * provided the user interaction mode that caused the tooltip to become
      * visible.
      */
    var onShow: js.UndefOr[js.Function1[/* mode */ UserInteractionMode, Unit]] = js.undefined
    
    var visible: Boolean
  }
  object VisibilityChangeOptions {
    
    inline def apply(visible: Boolean): VisibilityChangeOptions = {
      val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any], mode = null)
      __obj.asInstanceOf[VisibilityChangeOptions]
    }
    
    extension [Self <: VisibilityChangeOptions](x: Self) {
      
      inline def setMode(value: TooltipInitiated): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeNull: Self = StObject.set(x, "mode", null)
      
      inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: /* mode */ UserInteractionMode => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
