package typings.reactBigCalendar.mod

import typings.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateLocalizerSpec extends js.Object {
  var formats: Formats = js.native
  var propType: js.UndefOr[Validator[_]] = js.native
  def firstOfWeek(culture: Culture): Double = js.native
  def format(value: FormatInput, format: String, culture: Culture): String = js.native
}

object DateLocalizerSpec {
  @scala.inline
  def apply(firstOfWeek: Culture => Double, format: (FormatInput, String, Culture) => String, formats: Formats): DateLocalizerSpec = {
    val __obj = js.Dynamic.literal(firstOfWeek = js.Any.fromFunction1(firstOfWeek), format = js.Any.fromFunction3(format), formats = formats.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateLocalizerSpec]
  }
  @scala.inline
  implicit class DateLocalizerSpecOps[Self <: DateLocalizerSpec] (val x: Self) extends AnyVal {
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
    def setFirstOfWeek(value: Culture => Double): Self = this.set("firstOfWeek", js.Any.fromFunction1(value))
    @scala.inline
    def setFormat(value: (FormatInput, String, Culture) => String): Self = this.set("format", js.Any.fromFunction3(value))
    @scala.inline
    def setFormats(value: Formats): Self = this.set("formats", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropType(value: Validator[_]): Self = this.set("propType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropType: Self = this.set("propType", js.undefined)
  }
  
}

