package typings.stormReactDiagrams

import typings.stormReactDiagrams.baseWidgetMod.BaseWidget
import typings.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typings.stormReactDiagrams.nodeModelMod.NodeModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portWidgetMod {
  
  @JSImport("storm-react-diagrams/dist/src/widgets/PortWidget", "PortWidget")
  @js.native
  class PortWidget protected () extends BaseWidget[PortProps, PortState] {
    def this(props: PortProps) = this()
  }
  
  trait PortProps
    extends StObject
       with BaseWidgetProps {
    
    var name: String
    
    var node: NodeModel
  }
  object PortProps {
    
    inline def apply(name: String, node: NodeModel): PortProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[PortProps]
    }
    
    extension [Self <: PortProps](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNode(value: NodeModel): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait PortState extends StObject {
    
    var selected: Boolean
  }
  object PortState {
    
    inline def apply(selected: Boolean): PortState = {
      val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[PortState]
    }
    
    extension [Self <: PortState](x: Self) {
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
