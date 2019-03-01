package typings
package reactDashDatesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date extends js.Object {
  var date: reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj
}

object Anon_Date {
  @scala.inline
  def apply(date: reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj): Anon_Date = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("date")(date)
    __obj.asInstanceOf[Anon_Date]
  }
}

