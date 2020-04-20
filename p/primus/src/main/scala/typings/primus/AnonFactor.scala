package typings.primus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFactor extends js.Object {
  var factor: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var `reconnect timeout`: js.UndefOr[Double] = js.undefined
  var retries: js.UndefOr[Double] = js.undefined
}

object AnonFactor {
  @scala.inline
  def apply(
    factor: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    `reconnect timeout`: Int | Double = null,
    retries: Int | Double = null
  ): AnonFactor = {
    val __obj = js.Dynamic.literal()
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (`reconnect timeout` != null) __obj.updateDynamic("reconnect timeout")((`reconnect timeout`).asInstanceOf[js.Any])
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFactor]
  }
}

