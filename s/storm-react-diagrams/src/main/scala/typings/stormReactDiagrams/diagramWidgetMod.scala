package typings.stormReactDiagrams

import typings.react.mod.global.JSX.Element
import typings.std.KeyboardEvent
import typings.stormReactDiagrams.baseActionMod.BaseAction
import typings.stormReactDiagrams.baseWidgetMod.BaseWidget
import typings.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typings.stormReactDiagrams.diagramEngineMod.DiagramEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    inline def defaultProps_=(x: DiagramProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait DiagramProps
    extends StObject
       with BaseWidgetProps {
    
    var actionStartedFiring: js.UndefOr[js.Function1[/* action */ BaseAction, Boolean]] = js.undefined
    
    var actionStillFiring: js.UndefOr[js.Function1[/* action */ BaseAction, Unit]] = js.undefined
    
    var actionStoppedFiring: js.UndefOr[js.Function1[/* action */ BaseAction, Unit]] = js.undefined
    
    var allowCanvasTranslation: js.UndefOr[Boolean] = js.undefined
    
    var allowCanvasZoom: js.UndefOr[Boolean] = js.undefined
    
    var allowLooseLinks: js.UndefOr[Boolean] = js.undefined
    
    var deleteKeys: js.UndefOr[js.Array[Double]] = js.undefined
    
    var diagramEngine: DiagramEngine
    
    var inverseZoom: js.UndefOr[Boolean] = js.undefined
    
    var maxNumberPointsPerLink: js.UndefOr[Double] = js.undefined
    
    var smartRouting: js.UndefOr[Boolean] = js.undefined
  }
  object DiagramProps {
    
    inline def apply(diagramEngine: DiagramEngine): DiagramProps = {
      val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiagramProps]
    }
    
    extension [Self <: DiagramProps](x: Self) {
      
      inline def setActionStartedFiring(value: /* action */ BaseAction => Boolean): Self = StObject.set(x, "actionStartedFiring", js.Any.fromFunction1(value))
      
      inline def setActionStartedFiringUndefined: Self = StObject.set(x, "actionStartedFiring", js.undefined)
      
      inline def setActionStillFiring(value: /* action */ BaseAction => Unit): Self = StObject.set(x, "actionStillFiring", js.Any.fromFunction1(value))
      
      inline def setActionStillFiringUndefined: Self = StObject.set(x, "actionStillFiring", js.undefined)
      
      inline def setActionStoppedFiring(value: /* action */ BaseAction => Unit): Self = StObject.set(x, "actionStoppedFiring", js.Any.fromFunction1(value))
      
      inline def setActionStoppedFiringUndefined: Self = StObject.set(x, "actionStoppedFiring", js.undefined)
      
      inline def setAllowCanvasTranslation(value: Boolean): Self = StObject.set(x, "allowCanvasTranslation", value.asInstanceOf[js.Any])
      
      inline def setAllowCanvasTranslationUndefined: Self = StObject.set(x, "allowCanvasTranslation", js.undefined)
      
      inline def setAllowCanvasZoom(value: Boolean): Self = StObject.set(x, "allowCanvasZoom", value.asInstanceOf[js.Any])
      
      inline def setAllowCanvasZoomUndefined: Self = StObject.set(x, "allowCanvasZoom", js.undefined)
      
      inline def setAllowLooseLinks(value: Boolean): Self = StObject.set(x, "allowLooseLinks", value.asInstanceOf[js.Any])
      
      inline def setAllowLooseLinksUndefined: Self = StObject.set(x, "allowLooseLinks", js.undefined)
      
      inline def setDeleteKeys(value: js.Array[Double]): Self = StObject.set(x, "deleteKeys", value.asInstanceOf[js.Any])
      
      inline def setDeleteKeysUndefined: Self = StObject.set(x, "deleteKeys", js.undefined)
      
      inline def setDeleteKeysVarargs(value: Double*): Self = StObject.set(x, "deleteKeys", js.Array(value :_*))
      
      inline def setDiagramEngine(value: DiagramEngine): Self = StObject.set(x, "diagramEngine", value.asInstanceOf[js.Any])
      
      inline def setInverseZoom(value: Boolean): Self = StObject.set(x, "inverseZoom", value.asInstanceOf[js.Any])
      
      inline def setInverseZoomUndefined: Self = StObject.set(x, "inverseZoom", js.undefined)
      
      inline def setMaxNumberPointsPerLink(value: Double): Self = StObject.set(x, "maxNumberPointsPerLink", value.asInstanceOf[js.Any])
      
      inline def setMaxNumberPointsPerLinkUndefined: Self = StObject.set(x, "maxNumberPointsPerLink", js.undefined)
      
      inline def setSmartRouting(value: Boolean): Self = StObject.set(x, "smartRouting", value.asInstanceOf[js.Any])
      
      inline def setSmartRoutingUndefined: Self = StObject.set(x, "smartRouting", js.undefined)
    }
  }
  
  trait DiagramState extends StObject {
    
    var action: BaseAction | Null
    
    var diagramEngineListener: js.Any
    
    var document: js.Any
    
    var renderedNodes: Boolean
    
    var wasMoved: Boolean
    
    var windowListener: js.Any
  }
  object DiagramState {
    
    inline def apply(
      diagramEngineListener: js.Any,
      document: js.Any,
      renderedNodes: Boolean,
      wasMoved: Boolean,
      windowListener: js.Any
    ): DiagramState = {
      val __obj = js.Dynamic.literal(diagramEngineListener = diagramEngineListener.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], renderedNodes = renderedNodes.asInstanceOf[js.Any], wasMoved = wasMoved.asInstanceOf[js.Any], windowListener = windowListener.asInstanceOf[js.Any], action = null)
      __obj.asInstanceOf[DiagramState]
    }
    
    extension [Self <: DiagramState](x: Self) {
      
      inline def setAction(value: BaseAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionNull: Self = StObject.set(x, "action", null)
      
      inline def setDiagramEngineListener(value: js.Any): Self = StObject.set(x, "diagramEngineListener", value.asInstanceOf[js.Any])
      
      inline def setDocument(value: js.Any): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setRenderedNodes(value: Boolean): Self = StObject.set(x, "renderedNodes", value.asInstanceOf[js.Any])
      
      inline def setWasMoved(value: Boolean): Self = StObject.set(x, "wasMoved", value.asInstanceOf[js.Any])
      
      inline def setWindowListener(value: js.Any): Self = StObject.set(x, "windowListener", value.asInstanceOf[js.Any])
    }
  }
}
