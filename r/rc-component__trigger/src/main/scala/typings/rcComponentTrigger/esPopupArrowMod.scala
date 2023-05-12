package typings.rcComponentTrigger

import typings.rcComponentTrigger.esInterfaceMod.AlignType
import typings.rcComponentTrigger.esInterfaceMod.ArrowPos
import typings.rcComponentTrigger.esInterfaceMod.ArrowTypeOuter
import typings.react.mod.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPopupArrowMod {
  
  @JSImport("@rc-component/trigger/es/Popup/Arrow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ArrowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ArrowProps extends StObject {
    
    var align: AlignType
    
    var arrow: ArrowTypeOuter
    
    var arrowPos: ArrowPos
    
    var prefixCls: String
  }
  object ArrowProps {
    
    inline def apply(align: AlignType, arrow: ArrowTypeOuter, arrowPos: ArrowPos, prefixCls: String): ArrowProps = {
      val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], arrow = arrow.asInstanceOf[js.Any], arrowPos = arrowPos.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrowProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArrowProps] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setArrow(value: ArrowTypeOuter): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setArrowPos(value: ArrowPos): Self = StObject.set(x, "arrowPos", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
}
