package typings.reactPlotlyJs.anon

import typings.plotlyJs.mod.Data
import typings.plotlyJs.mod.Frame
import typings.plotlyJs.mod.PlotlyHTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<plotly.js.plotly.js.LegendClickEvent> */
@js.native
trait ReadonlyLegendClickEvent extends js.Object {
  val config: typings.plotlyJs.anon.PartialConfig = js.native
  val curveNumber: Double = js.native
  val data: js.Array[Data] = js.native
  val event: MouseEvent = js.native
  val expandedIndex: Double = js.native
  val frames: js.Array[Frame] = js.native
  val fullData: js.Array[Data] = js.native
  val fullLayout: typings.plotlyJs.anon.PartialLayout = js.native
  val layout: typings.plotlyJs.anon.PartialLayout = js.native
  val node: PlotlyHTMLElement = js.native
}

object ReadonlyLegendClickEvent {
  @scala.inline
  def apply(
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
  @scala.inline
  implicit class ReadonlyLegendClickEventOps[Self <: ReadonlyLegendClickEvent] (val x: Self) extends AnyVal {
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
    def setConfig(value: typings.plotlyJs.anon.PartialConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurveNumber(value: Double): Self = this.set("curveNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataVarargs(value: Data*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[Data]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: MouseEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandedIndex(value: Double): Self = this.set("expandedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setFramesVarargs(value: Frame*): Self = this.set("frames", js.Array(value :_*))
    @scala.inline
    def setFrames(value: js.Array[Frame]): Self = this.set("frames", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullDataVarargs(value: Data*): Self = this.set("fullData", js.Array(value :_*))
    @scala.inline
    def setFullData(value: js.Array[Data]): Self = this.set("fullData", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullLayout(value: typings.plotlyJs.anon.PartialLayout): Self = this.set("fullLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayout(value: typings.plotlyJs.anon.PartialLayout): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: PlotlyHTMLElement): Self = this.set("node", value.asInstanceOf[js.Any])
  }
  
}

