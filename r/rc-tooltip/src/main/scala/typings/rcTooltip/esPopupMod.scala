package typings.rcTooltip

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPopupMod {
  
  @JSImport("rc-tooltip/es/Popup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ContentProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ContentProps extends StObject {
    
    var arrowContent: js.UndefOr[ReactNode] = js.undefined
    
    var children: js.Function0[ReactNode] | ReactNode
    
    var className: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var overlayInnerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var showArrow: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ContentProps {
    
    inline def apply(): ContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentProps]
    }
    
    extension [Self <: ContentProps](x: Self) {
      
      inline def setArrowContent(value: ReactNode): Self = StObject.set(x, "arrowContent", value.asInstanceOf[js.Any])
      
      inline def setArrowContentUndefined: Self = StObject.set(x, "arrowContent", js.undefined)
      
      inline def setChildren(value: js.Function0[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction0(value: () => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction0(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOverlayInnerStyle(value: CSSProperties): Self = StObject.set(x, "overlayInnerStyle", value.asInstanceOf[js.Any])
      
      inline def setOverlayInnerStyleUndefined: Self = StObject.set(x, "overlayInnerStyle", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
      
      inline def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
