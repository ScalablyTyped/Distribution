package typings.atPulumiAws.typesInputMod.pinpoint

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppQuietTime extends js.Object {
  /**
    * The default end time for quiet time in ISO 8601 format. Required if `start` is set
    */
  var end: js.UndefOr[Input[String]] = js.undefined
  /**
    * The default start time for quiet time in ISO 8601 format. Required if `end` is set
    */
  var start: js.UndefOr[Input[String]] = js.undefined
}

object AppQuietTime {
  @scala.inline
  def apply(end: Input[String] = null, start: Input[String] = null): AppQuietTime = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppQuietTime]
  }
}

