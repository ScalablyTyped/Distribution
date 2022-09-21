package typings.reactCanvasDraw

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.reactCanvasDraw.anon.Max
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-canvas-draw", JSImport.Default)
  @js.native
  open class default () extends CanvasDraw
  
  @js.native
  trait CanvasDraw
    extends Component[CanvasDrawProps, js.Object, Any] {
    
    /**
      * Clears the canvas completely.
      */
    def clear(): Unit = js.native
    
    /**
      * Returns the drawing's save-data as a stringified object.
      */
    def getSaveData(): String = js.native
    
    /**
      * Loads a previously saved drawing using the saveData string, as well as an optional boolean
      * flag to load it immediately, instead of live-drawing it.
      */
    def loadSaveData(saveData: String): Unit = js.native
    def loadSaveData(saveData: String, immediate: Boolean): Unit = js.native
    
    /**
      * Removes the latest change to the drawing. This includes everything drawn since the last MouseDown event.
      */
    def undo(): Unit = js.native
  }
  
  trait CanvasDrawProps extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var brushColor: js.UndefOr[String] = js.undefined
    
    var brushRadius: js.UndefOr[Double] = js.undefined
    
    var canvasHeight: js.UndefOr[Double | String] = js.undefined
    
    var canvasWidth: js.UndefOr[Double | String] = js.undefined
    
    var catenaryColor: js.UndefOr[String] = js.undefined
    
    var clampLinesToDocument: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var enablePanAndZoom: js.UndefOr[Boolean] = js.undefined
    
    var gridColor: js.UndefOr[String] = js.undefined
    
    var gridLineWidth: js.UndefOr[Double] = js.undefined
    
    var gridSizeX: js.UndefOr[Double] = js.undefined
    
    var gridSizeY: js.UndefOr[Double] = js.undefined
    
    var hideGrid: js.UndefOr[Boolean] = js.undefined
    
    var hideGridX: js.UndefOr[Boolean] = js.undefined
    
    var hideGridY: js.UndefOr[Boolean] = js.undefined
    
    var hideInterface: js.UndefOr[Boolean] = js.undefined
    
    var imgSrc: js.UndefOr[String] = js.undefined
    
    var immediateLoading: js.UndefOr[Boolean] = js.undefined
    
    var lazyRadius: js.UndefOr[Double] = js.undefined
    
    var loadTimeOffset: js.UndefOr[Double] = js.undefined
    
    var mouseZoomFactor: js.UndefOr[Double] = js.undefined
    
    var onChange: js.UndefOr[(js.Function1[/* canvas */ CanvasDraw, Unit]) | Null] = js.undefined
    
    var saveData: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var zoomExtents: js.UndefOr[Max] = js.undefined
  }
  object CanvasDrawProps {
    
    inline def apply(): CanvasDrawProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CanvasDrawProps]
    }
    
    extension [Self <: CanvasDrawProps](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBrushColor(value: String): Self = StObject.set(x, "brushColor", value.asInstanceOf[js.Any])
      
      inline def setBrushColorUndefined: Self = StObject.set(x, "brushColor", js.undefined)
      
      inline def setBrushRadius(value: Double): Self = StObject.set(x, "brushRadius", value.asInstanceOf[js.Any])
      
      inline def setBrushRadiusUndefined: Self = StObject.set(x, "brushRadius", js.undefined)
      
      inline def setCanvasHeight(value: Double | String): Self = StObject.set(x, "canvasHeight", value.asInstanceOf[js.Any])
      
      inline def setCanvasHeightUndefined: Self = StObject.set(x, "canvasHeight", js.undefined)
      
      inline def setCanvasWidth(value: Double | String): Self = StObject.set(x, "canvasWidth", value.asInstanceOf[js.Any])
      
      inline def setCanvasWidthUndefined: Self = StObject.set(x, "canvasWidth", js.undefined)
      
      inline def setCatenaryColor(value: String): Self = StObject.set(x, "catenaryColor", value.asInstanceOf[js.Any])
      
      inline def setCatenaryColorUndefined: Self = StObject.set(x, "catenaryColor", js.undefined)
      
      inline def setClampLinesToDocument(value: Boolean): Self = StObject.set(x, "clampLinesToDocument", value.asInstanceOf[js.Any])
      
      inline def setClampLinesToDocumentUndefined: Self = StObject.set(x, "clampLinesToDocument", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEnablePanAndZoom(value: Boolean): Self = StObject.set(x, "enablePanAndZoom", value.asInstanceOf[js.Any])
      
      inline def setEnablePanAndZoomUndefined: Self = StObject.set(x, "enablePanAndZoom", js.undefined)
      
      inline def setGridColor(value: String): Self = StObject.set(x, "gridColor", value.asInstanceOf[js.Any])
      
      inline def setGridColorUndefined: Self = StObject.set(x, "gridColor", js.undefined)
      
      inline def setGridLineWidth(value: Double): Self = StObject.set(x, "gridLineWidth", value.asInstanceOf[js.Any])
      
      inline def setGridLineWidthUndefined: Self = StObject.set(x, "gridLineWidth", js.undefined)
      
      inline def setGridSizeX(value: Double): Self = StObject.set(x, "gridSizeX", value.asInstanceOf[js.Any])
      
      inline def setGridSizeXUndefined: Self = StObject.set(x, "gridSizeX", js.undefined)
      
      inline def setGridSizeY(value: Double): Self = StObject.set(x, "gridSizeY", value.asInstanceOf[js.Any])
      
      inline def setGridSizeYUndefined: Self = StObject.set(x, "gridSizeY", js.undefined)
      
      inline def setHideGrid(value: Boolean): Self = StObject.set(x, "hideGrid", value.asInstanceOf[js.Any])
      
      inline def setHideGridUndefined: Self = StObject.set(x, "hideGrid", js.undefined)
      
      inline def setHideGridX(value: Boolean): Self = StObject.set(x, "hideGridX", value.asInstanceOf[js.Any])
      
      inline def setHideGridXUndefined: Self = StObject.set(x, "hideGridX", js.undefined)
      
      inline def setHideGridY(value: Boolean): Self = StObject.set(x, "hideGridY", value.asInstanceOf[js.Any])
      
      inline def setHideGridYUndefined: Self = StObject.set(x, "hideGridY", js.undefined)
      
      inline def setHideInterface(value: Boolean): Self = StObject.set(x, "hideInterface", value.asInstanceOf[js.Any])
      
      inline def setHideInterfaceUndefined: Self = StObject.set(x, "hideInterface", js.undefined)
      
      inline def setImgSrc(value: String): Self = StObject.set(x, "imgSrc", value.asInstanceOf[js.Any])
      
      inline def setImgSrcUndefined: Self = StObject.set(x, "imgSrc", js.undefined)
      
      inline def setImmediateLoading(value: Boolean): Self = StObject.set(x, "immediateLoading", value.asInstanceOf[js.Any])
      
      inline def setImmediateLoadingUndefined: Self = StObject.set(x, "immediateLoading", js.undefined)
      
      inline def setLazyRadius(value: Double): Self = StObject.set(x, "lazyRadius", value.asInstanceOf[js.Any])
      
      inline def setLazyRadiusUndefined: Self = StObject.set(x, "lazyRadius", js.undefined)
      
      inline def setLoadTimeOffset(value: Double): Self = StObject.set(x, "loadTimeOffset", value.asInstanceOf[js.Any])
      
      inline def setLoadTimeOffsetUndefined: Self = StObject.set(x, "loadTimeOffset", js.undefined)
      
      inline def setMouseZoomFactor(value: Double): Self = StObject.set(x, "mouseZoomFactor", value.asInstanceOf[js.Any])
      
      inline def setMouseZoomFactorUndefined: Self = StObject.set(x, "mouseZoomFactor", js.undefined)
      
      inline def setOnChange(value: /* canvas */ CanvasDraw => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeNull: Self = StObject.set(x, "onChange", null)
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setSaveData(value: String): Self = StObject.set(x, "saveData", value.asInstanceOf[js.Any])
      
      inline def setSaveDataUndefined: Self = StObject.set(x, "saveData", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setZoomExtents(value: Max): Self = StObject.set(x, "zoomExtents", value.asInstanceOf[js.Any])
      
      inline def setZoomExtentsUndefined: Self = StObject.set(x, "zoomExtents", js.undefined)
    }
  }
}
