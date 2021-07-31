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
  class NodeWidget protected () extends BaseWidget[NodeProps, NodeState] {
    def this(props: NodeProps) = this()
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MNodeWidget(): Boolean = js.native
  }
  
  trait NodeProps
    extends StObject
       with BaseWidgetProps {
    
    var children: js.UndefOr[js.Any] = js.undefined
    
    var diagramEngine: DiagramEngine
    
    var node: NodeModel
  }
  object NodeProps {
    
    @scala.inline
    def apply(diagramEngine: DiagramEngine, node: NodeModel): NodeProps = {
      val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeProps]
    }
    
    @scala.inline
    implicit class NodePropsMutableBuilder[Self <: NodeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDiagramEngine(value: DiagramEngine): Self = StObject.set(x, "diagramEngine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: NodeModel): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeState extends StObject
}
