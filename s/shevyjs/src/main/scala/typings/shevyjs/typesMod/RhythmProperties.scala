package typings.shevyjs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RhythmProperties extends js.Object {
  var fontSize: String = js.native
  var lineHeight: Double = js.native
  var marginBottom: String = js.native
}

object RhythmProperties {
  @scala.inline
  def apply(fontSize: String, lineHeight: Double, marginBottom: String): RhythmProperties = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], marginBottom = marginBottom.asInstanceOf[js.Any])
    __obj.asInstanceOf[RhythmProperties]
  }
  @scala.inline
  implicit class RhythmPropertiesOps[Self <: RhythmProperties] (val x: Self) extends AnyVal {
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
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarginBottom(value: String): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
  }
  
}

