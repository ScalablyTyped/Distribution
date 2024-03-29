package typings.primereact

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.HTMLCanvasElement
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chartChartMod {
  
  @JSImport("primereact/chart/chart", "Chart")
  @js.native
  open class Chart protected () extends Component[ChartProps, Any, Any] {
    def this(props: ChartProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ChartProps, context: Any) = this()
    
    /**
      * Used to generate legend.
      * @return {string} Generated legend
      */
    def generateLegend(): String = js.native
    
    /**
      * Used to get base64 image.
      * @return {*} base64 image
      */
    def getBase64Image(): Any = js.native
    
    /**
      * Used to get canvas element.
      * @return {HTMLCanvasElement} Canvas element
      */
    def getCanvas(): HTMLCanvasElement = js.native
    
    /**
      * Used to get chart instance.
      * @return {*} Chart instance
      */
    def getChart(): Any = js.native
    
    /**
      * Used to get container element.
      * @return {HTMLDivElement} Container element
      */
    def getElement(): HTMLDivElement = js.native
    
    /**
      * Redraws the graph.
      */
    def refresh(): Unit = js.native
  }
  
  trait ChartProps extends StObject {
    
    /**
      * ARIA label for the chart canvas. Defaults to options.plugins.title.text if available.
      * @default options.plugins.title.text
      */
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Used to get the child elements of the component.
      * @readonly
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Style class of the element.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Data to display.
      */
    var data: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Height of the chart in non-responsive mode.
      */
    var height: js.UndefOr[String] = js.undefined
    
    /**
      * Unique identifier of the element.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Options to customize the chart.
      */
    var options: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Used to custom plugins of the chart.
      */
    var plugins: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * Inline style of the element.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Type of the chart.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /**
      * Width of the chart in non-responsive mode.
      */
    var width: js.UndefOr[String] = js.undefined
  }
  object ChartProps {
    
    inline def apply(): ChartProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChartProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChartProps] (val x: Self) extends AnyVal {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPlugins(value: js.Array[Any]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: Any*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
