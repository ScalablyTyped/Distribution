package typings
package reactDashDatesLib.reactDashDatesMod.ReactDatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// defaultPhrases.js
trait CalendarDayPhrases extends js.Object {
  def chooseAvailableDate(date: java.lang.String): java.lang.String
  def dateIsSelected(date: java.lang.String): java.lang.String
  def dateIsUnavailable(date: java.lang.String): java.lang.String
}

object CalendarDayPhrases {
  @scala.inline
  def apply(
    chooseAvailableDate: java.lang.String => java.lang.String,
    dateIsSelected: java.lang.String => java.lang.String,
    dateIsUnavailable: java.lang.String => java.lang.String
  ): CalendarDayPhrases = {
    val __obj = js.Dynamic.literal(chooseAvailableDate = js.Any.fromFunction1(chooseAvailableDate), dateIsSelected = js.Any.fromFunction1(dateIsSelected), dateIsUnavailable = js.Any.fromFunction1(dateIsUnavailable))
  
    __obj.asInstanceOf[CalendarDayPhrases]
  }
}

