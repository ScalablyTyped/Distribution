package typings.sharepoint.SPNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.TimeZone")
@js.native
class TimeZone () extends ClientObject {
  def get_description(): String = js.native
  def get_id(): Double = js.native
  def get_information(): TimeZoneInformation = js.native
  def localTimeToUTC(date: Date): DateTimeResult = js.native
  def utcToLocalTime(date: Date): DateTimeResult = js.native
}

