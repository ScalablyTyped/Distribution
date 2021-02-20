package typings.stormReactDiagrams

import typings.std.MouseEvent
import typings.stormReactDiagrams.baseWidgetMod.BaseWidget
import typings.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typings.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typings.stormReactDiagrams.pointModelMod.PointModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkLayerWidgetMod {
  
  @JSImport("storm-react-diagrams/dist/src/widgets/layers/LinkLayerWidget", "LinkLayerWidget")
  @js.native
  class LinkLayerWidget protected () extends BaseWidget[LinkLayerProps, LinkLayerState] {
    def this(props: LinkLayerProps) = this()
  }
  
  @js.native
  trait LinkLayerProps extends BaseWidgetProps {
    
    var diagramEngine: DiagramEngine = js.native
    
    def pointAdded(point: PointModel, event: MouseEvent): js.Any = js.native
  }
  object LinkLayerProps {
    
    @scala.inline
    def apply(diagramEngine: DiagramEngine, pointAdded: (PointModel, MouseEvent) => js.Any): LinkLayerProps = {
      val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], pointAdded = js.Any.fromFunction2(pointAdded))
      __obj.asInstanceOf[LinkLayerProps]
    }
    
    @scala.inline
    implicit class LinkLayerPropsMutableBuilder[Self <: LinkLayerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiagramEngine(value: DiagramEngine): Self = StObject.set(x, "diagramEngine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointAdded(value: (PointModel, MouseEvent) => js.Any): Self = StObject.set(x, "pointAdded", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait LinkLayerState extends StObject
}
