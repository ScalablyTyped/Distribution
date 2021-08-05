package typings.reactPlotlyJs.anon

import typings.plotlyJs.mod.Data
import typings.plotlyJs.mod.Frame
import typings.plotlyJs.mod.PlotlyHTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<plotly.js.plotly.js.LegendClickEvent> */
trait ReadonlyLegendClickEvent extends StObject {
  
  val config: typings.plotlyJs.anon.PartialConfig
  
  val curveNumber: Double
  
  val data: js.Array[Data]
  
  val event: MouseEvent
  
  val expandedIndex: Double
  
  val frames: js.Array[Frame]
  
  val fullData: js.Array[Data]
  
  val fullLayout: typings.plotlyJs.anon.PartialLayout
  
  val layout: typings.plotlyJs.anon.PartialLayout
  
  val node: PlotlyHTMLElement
}
object ReadonlyLegendClickEvent {
  
  inline def apply(
    config: typings.plotlyJs.anon.PartialConfig,
    curveNumber: Double,
    data: js.Array[Data],
    event: MouseEvent,
    expandedIndex: Double,
    frames: js.Array[Frame],
    fullData: js.Array[Data],
    fullLayout: typings.plotlyJs.anon.PartialLayout,
    layout: typings.plotlyJs.anon.PartialLayout,
    node: PlotlyHTMLElement
  ): ReadonlyLegendClickEvent = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], curveNumber = curveNumber.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], expandedIndex = expandedIndex.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], fullData = fullData.asInstanceOf[js.Any], fullLayout = fullLayout.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyLegendClickEvent]
  }
  
  extension [Self <: ReadonlyLegendClickEvent](x: Self) {
    
    inline def setConfig(value: typings.plotlyJs.anon.PartialConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setCurveNumber(value: Double): Self = StObject.set(x, "curveNumber", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Data*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setEvent(value: MouseEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setExpandedIndex(value: Double): Self = StObject.set(x, "expandedIndex", value.asInstanceOf[js.Any])
    
    inline def setFrames(value: js.Array[Frame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setFramesVarargs(value: Frame*): Self = StObject.set(x, "frames", js.Array(value :_*))
    
    inline def setFullData(value: js.Array[Data]): Self = StObject.set(x, "fullData", value.asInstanceOf[js.Any])
    
    inline def setFullDataVarargs(value: Data*): Self = StObject.set(x, "fullData", js.Array(value :_*))
    
    inline def setFullLayout(value: typings.plotlyJs.anon.PartialLayout): Self = StObject.set(x, "fullLayout", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: typings.plotlyJs.anon.PartialLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setNode(value: PlotlyHTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
