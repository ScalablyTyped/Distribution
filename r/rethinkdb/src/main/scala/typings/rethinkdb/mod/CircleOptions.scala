package typings.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CircleOptions extends DistanceOptions {
  /**
    * If `true` (the default) the circle is filled, creating a polygon; if `false` the circle is unfilled (creating a line).
    */
  var fill: js.UndefOr[Boolean] = js.native
  /**
    * The number of vertices in the polygon or line. Defaults to 32.
    */
  var numVertices: js.UndefOr[Double] = js.native
}

object CircleOptions {
  @scala.inline
  def apply(): CircleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircleOptions]
  }
  @scala.inline
  implicit class CircleOptionsOps[Self <: CircleOptions] (val x: Self) extends AnyVal {
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
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setNumVertices(value: Double): Self = this.set("numVertices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumVertices: Self = this.set("numVertices", js.undefined)
  }
  
}

