package typings.reactBigCalendar.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TitleOptions
  extends /* propName */ StringDictionary[js.Any] {
  var culture: js.UndefOr[String] = js.native
  var formats: js.Array[DateFormat] = js.native
}

object TitleOptions {
  @scala.inline
  def apply(formats: js.Array[DateFormat]): TitleOptions = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleOptions]
  }
  @scala.inline
  implicit class TitleOptionsOps[Self <: TitleOptions] (val x: Self) extends AnyVal {
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
    def setFormatsVarargs(value: DateFormat*): Self = this.set("formats", js.Array(value :_*))
    @scala.inline
    def setFormats(value: js.Array[DateFormat]): Self = this.set("formats", value.asInstanceOf[js.Any])
    @scala.inline
    def setCulture(value: String): Self = this.set("culture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCulture: Self = this.set("culture", js.undefined)
  }
  
}

