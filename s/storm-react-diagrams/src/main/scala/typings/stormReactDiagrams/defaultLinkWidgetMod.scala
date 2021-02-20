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
import scala.scalajs.js.`|`
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
    @scala.inline
    def defaultProps_=(x: DefaultLinkProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DefaultLinkProps extends BaseWidgetProps {
    
    var color: js.UndefOr[String] = js.native
    
    var diagramEngine: DiagramEngine = js.native
    
    var link: DefaultLinkModel = js.native
    
    var pointAdded: js.UndefOr[js.Function2[/* point */ PointModel, /* event */ MouseEvent, _]] = js.native
    
    var smooth: js.UndefOr[Boolean] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object DefaultLinkProps {
    
    @scala.inline
    def apply(diagramEngine: DiagramEngine, link: DefaultLinkModel): DefaultLinkProps = {
      val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultLinkProps]
    }
    
    @scala.inline
    implicit class DefaultLinkPropsMutableBuilder[Self <: DefaultLinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDiagramEngine(value: DiagramEngine): Self = StObject.set(x, "diagramEngine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: DefaultLinkModel): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointAdded(value: (/* point */ PointModel, /* event */ MouseEvent) => _): Self = StObject.set(x, "pointAdded", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointAddedUndefined: Self = StObject.set(x, "pointAdded", js.undefined)
      
      @scala.inline
      def setSmooth(value: Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait DefaultLinkState extends StObject {
    
    var selected: Boolean = js.native
  }
  object DefaultLinkState {
    
    @scala.inline
    def apply(selected: Boolean): DefaultLinkState = {
      val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultLinkState]
    }
    
    @scala.inline
    implicit class DefaultLinkStateMutableBuilder[Self <: DefaultLinkState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
