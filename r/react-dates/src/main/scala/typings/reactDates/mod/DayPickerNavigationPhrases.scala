package typings.reactDates.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// defaultPhrases.js
@js.native
trait DayPickerNavigationPhrases extends js.Object {
  var jumpToNextMonth: js.UndefOr[String] = js.native
  var jumpToPrevMonth: js.UndefOr[String] = js.native
}

object DayPickerNavigationPhrases {
  @scala.inline
  def apply(): DayPickerNavigationPhrases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayPickerNavigationPhrases]
  }
  @scala.inline
  implicit class DayPickerNavigationPhrasesOps[Self <: DayPickerNavigationPhrases] (val x: Self) extends AnyVal {
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
    def setJumpToNextMonth(value: String): Self = this.set("jumpToNextMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJumpToNextMonth: Self = this.set("jumpToNextMonth", js.undefined)
    @scala.inline
    def setJumpToPrevMonth(value: String): Self = this.set("jumpToPrevMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJumpToPrevMonth: Self = this.set("jumpToPrevMonth", js.undefined)
  }
  
}

