package typings.reactDates.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// defaultPhrases.js
trait CalendarDayPhrases extends js.Object {
  def chooseAvailableDate(date: String): String
  def dateIsSelected(date: String): String
  def dateIsUnavailable(date: String): String
}

object CalendarDayPhrases {
  @scala.inline
  def apply(
    chooseAvailableDate: String => String,
    dateIsSelected: String => String,
    dateIsUnavailable: String => String
  ): CalendarDayPhrases = {
    val __obj = js.Dynamic.literal(chooseAvailableDate = js.Any.fromFunction1(chooseAvailableDate), dateIsSelected = js.Any.fromFunction1(dateIsSelected), dateIsUnavailable = js.Any.fromFunction1(dateIsUnavailable))
  
    __obj.asInstanceOf[CalendarDayPhrases]
  }
}

