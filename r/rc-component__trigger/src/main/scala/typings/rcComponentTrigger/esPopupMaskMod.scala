package typings.rcComponentTrigger

import typings.rcMotion.esCssmotionMod.CSSMotionProps
import typings.react.mod.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPopupMaskMod {
  
  @JSImport("@rc-component/trigger/es/Popup/Mask", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: MaskProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait MaskProps extends StObject {
    
    var mask: js.UndefOr[Boolean] = js.undefined
    
    var motion: js.UndefOr[CSSMotionProps] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var prefixCls: String
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object MaskProps {
    
    inline def apply(prefixCls: String): MaskProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaskProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaskProps] (val x: Self) extends AnyVal {
      
      inline def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMotion(value: CSSMotionProps): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      inline def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
