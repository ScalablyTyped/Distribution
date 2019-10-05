package typings.atPulumiAws.typesOutputMod.pinpoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppQuietTime extends js.Object {
  /**
    * The default end time for quiet time in ISO 8601 format. Required if `start` is set
    */
  var end: js.UndefOr[String] = js.undefined
  /**
    * The default start time for quiet time in ISO 8601 format. Required if `end` is set
    */
  var start: js.UndefOr[String] = js.undefined
}

object AppQuietTime {
  @scala.inline
  def apply(end: String = null, start: String = null): AppQuietTime = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[AppQuietTime]
  }
}

