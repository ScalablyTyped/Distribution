package typings.rmcNukaCarousel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxSizing extends js.Object {
  var MozBoxSizing: String = js.native
  var boxSizing: String = js.native
  var display: String = js.native
  var height: String = js.native
  var position: String = js.native
  var visibility: String = js.native
  var width: js.UndefOr[String] = js.native
}

object BoxSizing {
  @scala.inline
  def apply(
    MozBoxSizing: String,
    boxSizing: String,
    display: String,
    height: String,
    position: String,
    visibility: String
  ): BoxSizing = {
    val __obj = js.Dynamic.literal(MozBoxSizing = MozBoxSizing.asInstanceOf[js.Any], boxSizing = boxSizing.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxSizing]
  }
  @scala.inline
  implicit class BoxSizingOps[Self <: BoxSizing] (val x: Self) extends AnyVal {
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
    def setMozBoxSizing(value: String): Self = this.set("MozBoxSizing", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoxSizing(value: String): Self = this.set("boxSizing", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplay(value: String): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

