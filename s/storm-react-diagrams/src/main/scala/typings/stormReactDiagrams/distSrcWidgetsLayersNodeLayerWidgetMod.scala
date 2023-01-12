package typings.stormReactDiagrams

import typings.stormReactDiagrams.distSrcDiagramEngineMod.DiagramEngine
import typings.stormReactDiagrams.distSrcWidgetsBaseWidgetMod.BaseWidget
import typings.stormReactDiagrams.distSrcWidgetsBaseWidgetMod.BaseWidgetProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcWidgetsLayersNodeLayerWidgetMod {
  
  @JSImport("storm-react-diagrams/dist/src/widgets/layers/NodeLayerWidget", "NodeLayerWidget")
  @js.native
  open class NodeLayerWidget protected () extends BaseWidget[NodeLayerProps, NodeLayerState] {
    def this(props: NodeLayerProps) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MNodeLayerWidget(): Unit = js.native
    
    def updateNodeDimensions(): Unit = js.native
  }
  
  trait NodeLayerProps
    extends StObject
       with BaseWidgetProps {
    
    var diagramEngine: DiagramEngine
  }
  object NodeLayerProps {
    
    inline def apply(diagramEngine: DiagramEngine): NodeLayerProps = {
      val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeLayerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeLayerProps] (val x: Self) extends AnyVal {
      
      inline def setDiagramEngine(value: DiagramEngine): Self = StObject.set(x, "diagramEngine", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeLayerState extends StObject
}
