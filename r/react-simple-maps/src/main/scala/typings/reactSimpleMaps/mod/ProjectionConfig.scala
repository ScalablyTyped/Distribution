package typings.reactSimpleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectionConfig extends js.Object {
  var center: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var parallels: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var rotate: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.native
  var scale: js.UndefOr[Double] = js.native
}

object ProjectionConfig {
  @scala.inline
  def apply(): ProjectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectionConfig]
  }
  @scala.inline
  implicit class ProjectionConfigOps[Self <: ProjectionConfig] (val x: Self) extends AnyVal {
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
    def setCenter(value: js.Tuple2[Double, Double]): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setParallels(value: js.Tuple2[Double, Double]): Self = this.set("parallels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParallels: Self = this.set("parallels", js.undefined)
    @scala.inline
    def setRotate(value: js.Tuple3[Double, Double, Double]): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
  
}

