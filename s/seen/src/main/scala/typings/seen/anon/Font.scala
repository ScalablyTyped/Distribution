package typings.seen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Font extends js.Object {
  var fill: js.UndefOr[String] = js.native
  var font: String = js.native
  var `text-anchor`: js.UndefOr[String] = js.native
}

object Font {
  @scala.inline
  def apply(font: String): Font = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
  @scala.inline
  implicit class FontOps[Self <: Font] (val x: Self) extends AnyVal {
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
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def `setText-anchor`(value: String): Self = this.set("text-anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-anchor`: Self = this.set("text-anchor", js.undefined)
  }
  
}

