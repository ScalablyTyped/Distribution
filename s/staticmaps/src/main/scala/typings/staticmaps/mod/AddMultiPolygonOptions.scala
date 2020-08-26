package typings.staticmaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddMultiPolygonOptions extends js.Object {
  var color: js.UndefOr[String] = js.native
  var coords: js.Array[js.Array[js.Tuple2[Double, Double]]] = js.native
  var fill: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object AddMultiPolygonOptions {
  @scala.inline
  def apply(coords: js.Array[js.Array[js.Tuple2[Double, Double]]]): AddMultiPolygonOptions = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddMultiPolygonOptions]
  }
  @scala.inline
  implicit class AddMultiPolygonOptionsOps[Self <: AddMultiPolygonOptions] (val x: Self) extends AnyVal {
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
    def setCoordsVarargs(value: (js.Array[js.Tuple2[Double, Double]])*): Self = this.set("coords", js.Array(value :_*))
    @scala.inline
    def setCoords(value: js.Array[js.Array[js.Tuple2[Double, Double]]]): Self = this.set("coords", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

