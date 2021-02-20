package typings.reactCanvasDraw

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-canvas-draw", JSImport.Default)
  @js.native
  class default () extends CanvasDraw
  
  @js.native
  trait CanvasDraw
    extends Component[CanvasDrawProps, js.Object, js.Any] {
    
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
  
  @js.native
  trait CanvasDrawProps extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var brushColor: js.UndefOr[String] = js.native
    
    var brushRadius: js.UndefOr[Double] = js.native
    
    var canvasHeight: js.UndefOr[Double | String] = js.native
    
    var canvasWidth: js.UndefOr[Double | String] = js.native
    
    var catenaryColor: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var gridColor: js.UndefOr[String] = js.native
    
    var hideGrid: js.UndefOr[Boolean] = js.native
    
    var hideInterface: js.UndefOr[Boolean] = js.native
    
    var imgSrc: js.UndefOr[String] = js.native
    
    var immediateLoading: js.UndefOr[Boolean] = js.native
    
    var lazyRadius: js.UndefOr[Double] = js.native
    
    var loadTimeOffset: js.UndefOr[Double] = js.native
    
    var onChange: js.UndefOr[(js.Function1[/* canvas */ CanvasDraw, Unit]) | Null] = js.native
    
    var saveData: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object CanvasDrawProps {
    
    @scala.inline
    def apply(): CanvasDrawProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CanvasDrawProps]
    }
    
    @scala.inline
    implicit class CanvasDrawPropsMutableBuilder[Self <: CanvasDrawProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBrushColor(value: String): Self = StObject.set(x, "brushColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrushColorUndefined: Self = StObject.set(x, "brushColor", js.undefined)
      
      @scala.inline
      def setBrushRadius(value: Double): Self = StObject.set(x, "brushRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrushRadiusUndefined: Self = StObject.set(x, "brushRadius", js.undefined)
      
      @scala.inline
      def setCanvasHeight(value: Double | String): Self = StObject.set(x, "canvasHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanvasHeightUndefined: Self = StObject.set(x, "canvasHeight", js.undefined)
      
      @scala.inline
      def setCanvasWidth(value: Double | String): Self = StObject.set(x, "canvasWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanvasWidthUndefined: Self = StObject.set(x, "canvasWidth", js.undefined)
      
      @scala.inline
      def setCatenaryColor(value: String): Self = StObject.set(x, "catenaryColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCatenaryColorUndefined: Self = StObject.set(x, "catenaryColor", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setGridColor(value: String): Self = StObject.set(x, "gridColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridColorUndefined: Self = StObject.set(x, "gridColor", js.undefined)
      
      @scala.inline
      def setHideGrid(value: Boolean): Self = StObject.set(x, "hideGrid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideGridUndefined: Self = StObject.set(x, "hideGrid", js.undefined)
      
      @scala.inline
      def setHideInterface(value: Boolean): Self = StObject.set(x, "hideInterface", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideInterfaceUndefined: Self = StObject.set(x, "hideInterface", js.undefined)
      
      @scala.inline
      def setImgSrc(value: String): Self = StObject.set(x, "imgSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgSrcUndefined: Self = StObject.set(x, "imgSrc", js.undefined)
      
      @scala.inline
      def setImmediateLoading(value: Boolean): Self = StObject.set(x, "immediateLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImmediateLoadingUndefined: Self = StObject.set(x, "immediateLoading", js.undefined)
      
      @scala.inline
      def setLazyRadius(value: Double): Self = StObject.set(x, "lazyRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyRadiusUndefined: Self = StObject.set(x, "lazyRadius", js.undefined)
      
      @scala.inline
      def setLoadTimeOffset(value: Double): Self = StObject.set(x, "loadTimeOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadTimeOffsetUndefined: Self = StObject.set(x, "loadTimeOffset", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* canvas */ CanvasDraw => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeNull: Self = StObject.set(x, "onChange", null)
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setSaveData(value: String): Self = StObject.set(x, "saveData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveDataUndefined: Self = StObject.set(x, "saveData", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
