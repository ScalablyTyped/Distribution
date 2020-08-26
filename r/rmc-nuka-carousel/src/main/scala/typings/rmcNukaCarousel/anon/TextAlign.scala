package typings.rmcNukaCarousel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextAlign extends js.Object {
  var bottom: Double = js.native
  var position: String = js.native
  var textAlign: String = js.native
  var width: String = js.native
}

object TextAlign {
  @scala.inline
  def apply(bottom: Double, position: String, textAlign: String, width: String): TextAlign = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAlign]
  }
  @scala.inline
  implicit class TextAlignOps[Self <: TextAlign] (val x: Self) extends AnyVal {
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
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextAlign(value: String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

