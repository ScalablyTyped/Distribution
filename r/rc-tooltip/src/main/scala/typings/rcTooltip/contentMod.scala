package typings.rcTooltip

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentMod {
  
  @JSImport("rc-tooltip/es/Content", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ContentProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ContentProps extends StObject {
    
    var id: String
    
    var overlay: js.Function0[ReactNode] | ReactNode
    
    var overlayInnerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object ContentProps {
    
    inline def apply(id: String): ContentProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentProps]
    }
    
    extension [Self <: ContentProps](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOverlay(value: js.Function0[ReactNode] | ReactNode): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayFunction0(value: () => ReactNode): Self = StObject.set(x, "overlay", js.Any.fromFunction0(value))
      
      inline def setOverlayInnerStyle(value: CSSProperties): Self = StObject.set(x, "overlayInnerStyle", value.asInstanceOf[js.Any])
      
      inline def setOverlayInnerStyleUndefined: Self = StObject.set(x, "overlayInnerStyle", js.undefined)
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
}
