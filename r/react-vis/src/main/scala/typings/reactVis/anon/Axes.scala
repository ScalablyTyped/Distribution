package typings.reactVis.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Axes extends js.Object {
  var axes: js.UndefOr[CSSProperties] = js.native
  var labels: js.UndefOr[CSSProperties] = js.native
  var polygons: js.UndefOr[CSSProperties] = js.native
}

object Axes {
  @scala.inline
  def apply(): Axes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Axes]
  }
  @scala.inline
  implicit class AxesOps[Self <: Axes] (val x: Self) extends AnyVal {
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
    def setAxes(value: CSSProperties): Self = this.set("axes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxes: Self = this.set("axes", js.undefined)
    @scala.inline
    def setLabels(value: CSSProperties): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setPolygons(value: CSSProperties): Self = this.set("polygons", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolygons: Self = this.set("polygons", js.undefined)
  }
  
}

