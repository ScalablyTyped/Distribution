package typings.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLRedrawOptions extends js.Object {
  var height: Double = js.native
  var width: Double = js.native
  def project(lnglat: js.Array[Double]): js.Array[Double] = js.native
  def unproject(xy: js.Array[Double]): js.Array[Double] = js.native
}

object HTMLRedrawOptions {
  @scala.inline
  def apply(
    height: Double,
    project: js.Array[Double] => js.Array[Double],
    unproject: js.Array[Double] => js.Array[Double],
    width: Double
  ): HTMLRedrawOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], project = js.Any.fromFunction1(project), unproject = js.Any.fromFunction1(unproject), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLRedrawOptions]
  }
  @scala.inline
  implicit class HTMLRedrawOptionsOps[Self <: HTMLRedrawOptions] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setProject(value: js.Array[Double] => js.Array[Double]): Self = this.set("project", js.Any.fromFunction1(value))
    @scala.inline
    def setUnproject(value: js.Array[Double] => js.Array[Double]): Self = this.set("unproject", js.Any.fromFunction1(value))
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

