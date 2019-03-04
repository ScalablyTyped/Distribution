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
    chooseAvailableDate: js.Function1[java.lang.String, java.lang.String],
    dateIsSelected: js.Function1[java.lang.String, java.lang.String],
    dateIsUnavailable: js.Function1[java.lang.String, java.lang.String]
  ): CalendarDayPhrases = {
    val __obj = js.Dynamic.literal(chooseAvailableDate = chooseAvailableDate, dateIsSelected = dateIsSelected, dateIsUnavailable = dateIsUnavailable)
  
    __obj.asInstanceOf[CalendarDayPhrases]
  }
}

