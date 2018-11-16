package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.TimeZone")
@js.native
class TimeZone () extends ClientObject {
  def get_description(): java.lang.String = js.native
  def get_id(): scala.Double = js.native
  def get_information(): TimeZoneInformation = js.native
  def localTimeToUTC(date: stdLib.Date): DateTimeResult = js.native
  def utcToLocalTime(date: stdLib.Date): DateTimeResult = js.native
}

