package typings.shevyjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<shevyjs.shevyjs/types.RhythmProperties, std.Exclude<keyof shevyjs.shevyjs/types.RhythmProperties, 'marginBottom'>> */
@js.native
trait PickRhythmPropertiesExclu extends js.Object {
  var fontSize: String = js.native
  var lineHeight: Double = js.native
}

object PickRhythmPropertiesExclu {
  @scala.inline
  def apply(fontSize: String, lineHeight: Double): PickRhythmPropertiesExclu = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickRhythmPropertiesExclu]
  }
  @scala.inline
  implicit class PickRhythmPropertiesExcluOps[Self <: PickRhythmPropertiesExclu] (val x: Self) extends AnyVal {
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
  }
  
}

