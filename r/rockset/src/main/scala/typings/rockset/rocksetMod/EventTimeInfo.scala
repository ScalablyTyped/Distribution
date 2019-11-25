package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTimeInfo extends js.Object {
  // name of the field containing event time
  var field: String
  // format of time field, can be one of: milliseconds_since_epoch, seconds_since_epoch
  var format: js.UndefOr[String] = js.undefined
  // default time zone, in standard IANA format
  var time_zone: js.UndefOr[String] = js.undefined
}

object EventTimeInfo {
  @scala.inline
  def apply(field: String, format: String = null, time_zone: String = null): EventTimeInfo = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (time_zone != null) __obj.updateDynamic("time_zone")(time_zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTimeInfo]
  }
}

