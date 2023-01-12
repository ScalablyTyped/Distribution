package typings.stormReactDiagrams

import typings.stormReactDiagrams.distSrcModelsNodeModelMod.NodeModel
import typings.stormReactDiagrams.distSrcWidgetsBaseWidgetMod.BaseWidget
import typings.stormReactDiagrams.distSrcWidgetsBaseWidgetMod.BaseWidgetProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcWidgetsPortWidgetMod {
  
  @JSImport("storm-react-diagrams/dist/src/widgets/PortWidget", "PortWidget")
  @js.native
  open class PortWidget protected () extends BaseWidget[PortProps, PortState] {
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PortProps] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PortState] (val x: Self) extends AnyVal {
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
