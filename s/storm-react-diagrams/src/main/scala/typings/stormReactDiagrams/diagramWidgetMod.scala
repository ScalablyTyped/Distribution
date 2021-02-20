package typings.stormReactDiagrams

import typings.react.mod.global.JSX.Element
import typings.std.KeyboardEvent
import typings.stormReactDiagrams.baseActionMod.BaseAction
import typings.stormReactDiagrams.baseWidgetMod.BaseWidget
import typings.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typings.stormReactDiagrams.diagramEngineMod.DiagramEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diagramWidgetMod {
  
  @JSImport("storm-react-diagrams/dist/src/widgets/DiagramWidget", "DiagramWidget")
  @js.native
  class DiagramWidget protected () extends BaseWidget[DiagramProps, DiagramState] {
    def this(props: DiagramProps) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MDiagramWidget(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDiagramWidget(): Unit = js.native
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MDiagramWidget(nextProps: DiagramProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDiagramWidget(): Unit = js.native
    
    @JSName("componentWillUpdate")
    def componentWillUpdate_MDiagramWidget(nextProps: DiagramProps): Unit = js.native
    
    def drawSelectionBox(): Element = js.native
    
    def fireAction(): Unit = js.native
    
    /**
      * Gets a model and element under the mouse cursor
      */
    def getMouseElement(event: js.Any): typings.stormReactDiagrams.anon.Element = js.native
    
    def onKeyUp(event: js.Any): Unit = js.native
    
    def onKeyUpPointer(ev: KeyboardEvent): Unit = js.native
    
    def onMouseMove(event: js.Any): Unit = js.native
    
    def onMouseUp(event: js.Any): Unit = js.native
    
    def startFiringAction(action: BaseAction): Unit = js.native
    
    def stopFiringAction(): Unit = js.native
    def stopFiringAction(shouldSkipEvent: Boolean): Unit = js.native
  }
  /* static members */
  object DiagramWidget {
    
    @JSImport("storm-react-diagrams/dist/src/widgets/DiagramWidget", "DiagramWidget")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("storm-react-diagrams/dist/src/widgets/DiagramWidget", "DiagramWidget.defaultProps")
    @js.native
    def defaultProps: DiagramProps = js.native
    @scala.inline
    def defaultProps_=(x: DiagramProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DiagramProps extends BaseWidgetProps {
    
    var actionStartedFiring: js.UndefOr[js.Function1[/* action */ BaseAction, Boolean]] = js.native
    
    var actionStillFiring: js.UndefOr[js.Function1[/* action */ BaseAction, Unit]] = js.native
    
    var actionStoppedFiring: js.UndefOr[js.Function1[/* action */ BaseAction, Unit]] = js.native
    
    var allowCanvasTranslation: js.UndefOr[Boolean] = js.native
    
    var allowCanvasZoom: js.UndefOr[Boolean] = js.native
    
    var allowLooseLinks: js.UndefOr[Boolean] = js.native
    
    var deleteKeys: js.UndefOr[js.Array[Double]] = js.native
    
    var diagramEngine: DiagramEngine = js.native
    
    var inverseZoom: js.UndefOr[Boolean] = js.native
    
    var maxNumberPointsPerLink: js.UndefOr[Double] = js.native
    
    var smartRouting: js.UndefOr[Boolean] = js.native
  }
  object DiagramProps {
    
    @scala.inline
    def apply(diagramEngine: DiagramEngine): DiagramProps = {
      val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiagramProps]
    }
    
    @scala.inline
    implicit class DiagramPropsMutableBuilder[Self <: DiagramProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionStartedFiring(value: /* action */ BaseAction => Boolean): Self = StObject.set(x, "actionStartedFiring", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionStartedFiringUndefined: Self = StObject.set(x, "actionStartedFiring", js.undefined)
      
      @scala.inline
      def setActionStillFiring(value: /* action */ BaseAction => Unit): Self = StObject.set(x, "actionStillFiring", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionStillFiringUndefined: Self = StObject.set(x, "actionStillFiring", js.undefined)
      
      @scala.inline
      def setActionStoppedFiring(value: /* action */ BaseAction => Unit): Self = StObject.set(x, "actionStoppedFiring", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionStoppedFiringUndefined: Self = StObject.set(x, "actionStoppedFiring", js.undefined)
      
      @scala.inline
      def setAllowCanvasTranslation(value: Boolean): Self = StObject.set(x, "allowCanvasTranslation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowCanvasTranslationUndefined: Self = StObject.set(x, "allowCanvasTranslation", js.undefined)
      
      @scala.inline
      def setAllowCanvasZoom(value: Boolean): Self = StObject.set(x, "allowCanvasZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowCanvasZoomUndefined: Self = StObject.set(x, "allowCanvasZoom", js.undefined)
      
      @scala.inline
      def setAllowLooseLinks(value: Boolean): Self = StObject.set(x, "allowLooseLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowLooseLinksUndefined: Self = StObject.set(x, "allowLooseLinks", js.undefined)
      
      @scala.inline
      def setDeleteKeys(value: js.Array[Double]): Self = StObject.set(x, "deleteKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteKeysUndefined: Self = StObject.set(x, "deleteKeys", js.undefined)
      
      @scala.inline
      def setDeleteKeysVarargs(value: Double*): Self = StObject.set(x, "deleteKeys", js.Array(value :_*))
      
      @scala.inline
      def setDiagramEngine(value: DiagramEngine): Self = StObject.set(x, "diagramEngine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInverseZoom(value: Boolean): Self = StObject.set(x, "inverseZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInverseZoomUndefined: Self = StObject.set(x, "inverseZoom", js.undefined)
      
      @scala.inline
      def setMaxNumberPointsPerLink(value: Double): Self = StObject.set(x, "maxNumberPointsPerLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxNumberPointsPerLinkUndefined: Self = StObject.set(x, "maxNumberPointsPerLink", js.undefined)
      
      @scala.inline
      def setSmartRouting(value: Boolean): Self = StObject.set(x, "smartRouting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmartRoutingUndefined: Self = StObject.set(x, "smartRouting", js.undefined)
    }
  }
  
  @js.native
  trait DiagramState extends StObject {
    
    var action: BaseAction | Null = js.native
    
    var diagramEngineListener: js.Any = js.native
    
    var document: js.Any = js.native
    
    var renderedNodes: Boolean = js.native
    
    var wasMoved: Boolean = js.native
    
    var windowListener: js.Any = js.native
  }
  object DiagramState {
    
    @scala.inline
    def apply(
      diagramEngineListener: js.Any,
      document: js.Any,
      renderedNodes: Boolean,
      wasMoved: Boolean,
      windowListener: js.Any
    ): DiagramState = {
      val __obj = js.Dynamic.literal(diagramEngineListener = diagramEngineListener.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], renderedNodes = renderedNodes.asInstanceOf[js.Any], wasMoved = wasMoved.asInstanceOf[js.Any], windowListener = windowListener.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiagramState]
    }
    
    @scala.inline
    implicit class DiagramStateMutableBuilder[Self <: DiagramState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: BaseAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionNull: Self = StObject.set(x, "action", null)
      
      @scala.inline
      def setDiagramEngineListener(value: js.Any): Self = StObject.set(x, "diagramEngineListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocument(value: js.Any): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderedNodes(value: Boolean): Self = StObject.set(x, "renderedNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWasMoved(value: Boolean): Self = StObject.set(x, "wasMoved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowListener(value: js.Any): Self = StObject.set(x, "windowListener", value.asInstanceOf[js.Any])
    }
  }
}
