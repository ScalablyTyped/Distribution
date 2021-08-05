package typings.stormReactDiagrams

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.SVGPathElement
import typings.stormReactDiagrams.anon.Path
import typings.stormReactDiagrams.baseWidgetMod.BaseWidget
import typings.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typings.stormReactDiagrams.defaultLinkModelMod.DefaultLinkModel
import typings.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typings.stormReactDiagrams.labelModelMod.LabelModel
import typings.stormReactDiagrams.pathFindingMod.default
import typings.stormReactDiagrams.pointModelMod.PointModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultLinkWidgetMod {
  
  @JSImport("storm-react-diagrams/dist/src/defaults/widgets/DefaultLinkWidget", "DefaultLinkWidget")
  @js.native
  class DefaultLinkWidget protected () extends BaseWidget[DefaultLinkProps, DefaultLinkState] {
    def this(props: DefaultLinkProps) = this()
    
    def addPointToLink(event: MouseEvent, index: Double): Unit = js.native
    
    def calculateAllLabelPosition(): Unit = js.native
    
    def calculateLabelPosition(label: js.Any, index: Double): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MDefaultLinkWidget(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDefaultLinkWidget(): Unit = js.native
    
    def findPathAndRelativePositionToRenderLabel(index: Double): Path = js.native
    
    def generateLabel(label: LabelModel): Element = js.native
    
    def generateLink(path: String, extraProps: js.Any, id: String): Element = js.native
    def generateLink(path: String, extraProps: js.Any, id: Double): Element = js.native
    
    def generatePoint(pointIndex: Double): Element = js.native
    
    /**
      * Smart routing is only applicable when all conditions below are true:
      * - smart routing is set to true on the engine
      * - current link is between two nodes (not between a node and an empty point)
      * - no custom points exist along the line
      */
    def isSmartRoutingApplicable(): Boolean = js.native
    
    var pathFinding: default = js.native
    
    var refLabels: StringDictionary[HTMLElement] = js.native
    
    var refPaths: js.Array[SVGPathElement] = js.native
  }
  /* static members */
  object DefaultLinkWidget {
    
    @JSImport("storm-react-diagrams/dist/src/defaults/widgets/DefaultLinkWidget", "DefaultLinkWidget")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("storm-react-diagrams/dist/src/defaults/widgets/DefaultLinkWidget", "DefaultLinkWidget.defaultProps")
    @js.native
    def defaultProps: DefaultLinkProps = js.native
    inline def defaultProps_=(x: DefaultLinkProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait DefaultLinkProps
    extends StObject
       with BaseWidgetProps {
    
    var color: js.UndefOr[String] = js.undefined
    
    var diagramEngine: DiagramEngine
    
    var link: DefaultLinkModel
    
    var pointAdded: js.UndefOr[js.Function2[/* point */ PointModel, /* event */ MouseEvent, js.Any]] = js.undefined
    
    var smooth: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object DefaultLinkProps {
    
    inline def apply(diagramEngine: DiagramEngine, link: DefaultLinkModel): DefaultLinkProps = {
      val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultLinkProps]
    }
    
    extension [Self <: DefaultLinkProps](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDiagramEngine(value: DiagramEngine): Self = StObject.set(x, "diagramEngine", value.asInstanceOf[js.Any])
      
      inline def setLink(value: DefaultLinkModel): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setPointAdded(value: (/* point */ PointModel, /* event */ MouseEvent) => js.Any): Self = StObject.set(x, "pointAdded", js.Any.fromFunction2(value))
      
      inline def setPointAddedUndefined: Self = StObject.set(x, "pointAdded", js.undefined)
      
      inline def setSmooth(value: Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      inline def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait DefaultLinkState extends StObject {
    
    var selected: Boolean
  }
  object DefaultLinkState {
    
    inline def apply(selected: Boolean): DefaultLinkState = {
      val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultLinkState]
    }
    
    extension [Self <: DefaultLinkState](x: Self) {
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
