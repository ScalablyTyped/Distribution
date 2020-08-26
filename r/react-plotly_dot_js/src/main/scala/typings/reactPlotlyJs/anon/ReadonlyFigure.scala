package typings.reactPlotlyJs.anon

import typings.plotlyJs.mod.Data
import typings.plotlyJs.mod.Frame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<react-plotly.js.react-plotly.js.Figure> */
@js.native
trait ReadonlyFigure extends js.Object {
  val data: js.Array[Data] = js.native
  val frames: js.UndefOr[js.Array[Frame] | Null] = js.native
  val layout: PartialLayout = js.native
}

object ReadonlyFigure {
  @scala.inline
  def apply(data: js.Array[Data], layout: PartialLayout): ReadonlyFigure = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyFigure]
  }
  @scala.inline
  implicit class ReadonlyFigureOps[Self <: ReadonlyFigure] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: Data*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[Data]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayout(value: PartialLayout): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def setFramesVarargs(value: Frame*): Self = this.set("frames", js.Array(value :_*))
    @scala.inline
    def setFrames(value: js.Array[Frame]): Self = this.set("frames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrames: Self = this.set("frames", js.undefined)
    @scala.inline
    def setFramesNull: Self = this.set("frames", null)
  }
  
}

