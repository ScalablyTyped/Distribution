package typings.stormReactDiagrams

import typings.stormReactDiagrams.baseWidgetMod.BaseWidget
import typings.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typings.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typings.stormReactDiagrams.nodeModelMod.NodeModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeWidgetMod {
  
  @JSImport("storm-react-diagrams/dist/src/widgets/NodeWidget", "NodeWidget")
  @js.native
  open class NodeWidget protected () extends BaseWidget[NodeProps, NodeState] {
    def this(props: NodeProps) = this()
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MNodeWidget(): Boolean = js.native
  }
  
  trait NodeProps
    extends StObject
       with BaseWidgetProps {
    
    var children: js.UndefOr[Any] = js.undefined
    
    var diagramEngine: DiagramEngine
    
    var node: NodeModel
  }
  object NodeProps {
    
    inline def apply(diagramEngine: DiagramEngine, node: NodeModel): NodeProps = {
      val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeProps]
    }
    
    extension [Self <: NodeProps](x: Self) {
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDiagramEngine(value: DiagramEngine): Self = StObject.set(x, "diagramEngine", value.asInstanceOf[js.Any])
      
      inline def setNode(value: NodeModel): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeState extends StObject
}
