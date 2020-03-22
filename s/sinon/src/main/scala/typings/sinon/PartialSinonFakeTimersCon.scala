package typings.sinon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<sinon.sinon.SinonFakeTimersConfig> */
trait PartialSinonFakeTimersCon extends js.Object {
  var now: js.UndefOr[Double | Date] = js.undefined
  var shouldAdvanceTime: js.UndefOr[Boolean] = js.undefined
  var toFake: js.UndefOr[js.Array[String]] = js.undefined
}

object PartialSinonFakeTimersCon {
  @scala.inline
  def apply(
    now: Double | Date = null,
    shouldAdvanceTime: js.UndefOr[Boolean] = js.undefined,
    toFake: js.Array[String] = null
  ): PartialSinonFakeTimersCon = {
    val __obj = js.Dynamic.literal()
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldAdvanceTime)) __obj.updateDynamic("shouldAdvanceTime")(shouldAdvanceTime.asInstanceOf[js.Any])
    if (toFake != null) __obj.updateDynamic("toFake")(toFake.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSinonFakeTimersCon]
  }
}

