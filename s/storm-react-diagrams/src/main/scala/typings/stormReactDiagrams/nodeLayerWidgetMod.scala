package typings.stormReactDiagrams

import typings.stormReactDiagrams.baseWidgetMod.BaseWidget
import typings.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typings.stormReactDiagrams.diagramEngineMod.DiagramEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeLayerWidgetMod {
  
  @JSImport("storm-react-diagrams/dist/src/widgets/layers/NodeLayerWidget", "NodeLayerWidget")
  @js.native
  class NodeLayerWidget protected () extends BaseWidget[NodeLayerProps, NodeLayerState] {
    def this(props: NodeLayerProps) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MNodeLayerWidget(): Unit = js.native
    
    def updateNodeDimensions(): Unit = js.native
  }
  
  @js.native
  trait NodeLayerProps extends BaseWidgetProps {
    
    var diagramEngine: DiagramEngine = js.native
  }
  object NodeLayerProps {
    
    @scala.inline
    def apply(diagramEngine: DiagramEngine): NodeLayerProps = {
      val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeLayerProps]
    }
    
    @scala.inline
    implicit class NodeLayerPropsMutableBuilder[Self <: NodeLayerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiagramEngine(value: DiagramEngine): Self = StObject.set(x, "diagramEngine", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NodeLayerState extends StObject
}
