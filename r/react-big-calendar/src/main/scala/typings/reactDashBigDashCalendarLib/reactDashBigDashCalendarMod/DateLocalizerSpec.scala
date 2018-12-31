package typings
package reactDashBigDashCalendarLib.reactDashBigDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateLocalizerSpec extends js.Object {
  var formats: Formats
  var propType: js.UndefOr[propDashTypesLib.propDashTypesMod.Validator[_]] = js.undefined
  def firstOfWeek(culture: Culture): scala.Double
  def format(value: FormatInput, format: java.lang.String, culture: Culture): java.lang.String
}

