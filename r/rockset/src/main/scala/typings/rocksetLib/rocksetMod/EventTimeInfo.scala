package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTimeInfo extends js.Object {
  // name of the field containing event time
  var field: java.lang.String
  // format of time field, can be one of: milliseconds_since_epoch, seconds_since_epoch
  var format: js.UndefOr[java.lang.String] = js.undefined
  // default time zone, in standard IANA format
  var time_zone: js.UndefOr[java.lang.String] = js.undefined
}

object EventTimeInfo {
  @scala.inline
  def apply(field: java.lang.String, format: java.lang.String = null, time_zone: java.lang.String = null): EventTimeInfo = {
    val __obj = js.Dynamic.literal(field = field)
    if (format != null) __obj.updateDynamic("format")(format)
    if (time_zone != null) __obj.updateDynamic("time_zone")(time_zone)
    __obj.asInstanceOf[EventTimeInfo]
  }
}

