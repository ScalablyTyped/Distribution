package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ARTNodeMixin extends js.Object {
  var opacity: js.UndefOr[Double] = js.native
  var originX: js.UndefOr[Double] = js.native
  var originY: js.UndefOr[Double] = js.native
  var scale: js.UndefOr[Double] = js.native
  var scaleX: js.UndefOr[Double] = js.native
  var scaleY: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var x: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
}

object ARTNodeMixin {
  @scala.inline
  def apply(): ARTNodeMixin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ARTNodeMixin]
  }
  @scala.inline
  implicit class ARTNodeMixinOps[Self <: ARTNodeMixin] (val x: Self) extends AnyVal {
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
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setOriginX(value: Double): Self = this.set("originX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginX: Self = this.set("originX", js.undefined)
    @scala.inline
    def setOriginY(value: Double): Self = this.set("originY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginY: Self = this.set("originY", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setScaleX(value: Double): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleX: Self = this.set("scaleX", js.undefined)
    @scala.inline
    def setScaleY(value: Double): Self = this.set("scaleY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleY: Self = this.set("scaleY", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

