package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutAnimationProperties extends js.Object {
  var opacity: String = js.native
  var scaleXY: String = js.native
}

object LayoutAnimationProperties {
  @scala.inline
  def apply(opacity: String, scaleXY: String): LayoutAnimationProperties = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any], scaleXY = scaleXY.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutAnimationProperties]
  }
  @scala.inline
  implicit class LayoutAnimationPropertiesOps[Self <: LayoutAnimationProperties] (val x: Self) extends AnyVal {
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
    def setOpacity(value: String): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleXY(value: String): Self = this.set("scaleXY", value.asInstanceOf[js.Any])
  }
  
}

