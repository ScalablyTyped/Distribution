package typings.stormReactDiagrams

import typings.stormReactDiagrams.baseWidgetMod.BaseWidget
import typings.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typings.stormReactDiagrams.nodeModelMod.NodeModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portWidgetMod {
  
  @JSImport("storm-react-diagrams/dist/src/widgets/PortWidget", "PortWidget")
  @js.native
  class PortWidget protected () extends BaseWidget[PortProps, PortState] {
    def this(props: PortProps) = this()
  }
  
  @js.native
  trait PortProps extends BaseWidgetProps {
    
    var name: String = js.native
    
    var node: NodeModel = js.native
  }
  object PortProps {
    
    @scala.inline
    def apply(name: String, node: NodeModel): PortProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[PortProps]
    }
    
    @scala.inline
    implicit class PortPropsMutableBuilder[Self <: PortProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: NodeModel): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PortState extends StObject {
    
    var selected: Boolean = js.native
  }
  object PortState {
    
    @scala.inline
    def apply(selected: Boolean): PortState = {
      val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[PortState]
    }
    
    @scala.inline
    implicit class PortStateMutableBuilder[Self <: PortState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
