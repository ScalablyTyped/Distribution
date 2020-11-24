package typings.seatsio

import typings.seatsio.Seatsio.ChartManager
import typings.seatsio.Seatsio.EventManager
import typings.seatsio.Seatsio.SeatingChart
import typings.seatsio.Seatsio.SeatingChartDesigner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Seatsio_ extends js.Object {
  
  var ChartManager: ChartManager = js.native
  
  var EventManager: EventManager = js.native
  
  var SeatingChart: SeatingChart = js.native
  
  var SeatingChartDesigner: SeatingChartDesigner = js.native
}
object Seatsio_ {
  
  @scala.inline
  def apply(
    ChartManager: ChartManager,
    EventManager: EventManager,
    SeatingChart: SeatingChart,
    SeatingChartDesigner: SeatingChartDesigner
  ): Seatsio_ = {
    val __obj = js.Dynamic.literal(ChartManager = ChartManager.asInstanceOf[js.Any], EventManager = EventManager.asInstanceOf[js.Any], SeatingChart = SeatingChart.asInstanceOf[js.Any], SeatingChartDesigner = SeatingChartDesigner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Seatsio_]
  }
  
  @scala.inline
  implicit class Seatsio_Ops[Self <: Seatsio_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChartManager(value: ChartManager): Self = this.set("ChartManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventManager(value: EventManager): Self = this.set("EventManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeatingChart(value: SeatingChart): Self = this.set("SeatingChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeatingChartDesigner(value: SeatingChartDesigner): Self = this.set("SeatingChartDesigner", value.asInstanceOf[js.Any])
  }
}
