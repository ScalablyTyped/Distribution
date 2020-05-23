package typings.scryptAsync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var N: js.UndefOr[Double] = js.undefined
  var dkLen: Double
  var encoding: js.UndefOr[String] = js.undefined
  var interruptStep: js.UndefOr[Double] = js.undefined
  var logN: js.UndefOr[Double] = js.undefined
  var p: Double
  var r: Double
}

object Options {
  @scala.inline
  def apply(
    dkLen: Double,
    p: Double,
    r: Double,
    N: js.UndefOr[Double] = js.undefined,
    encoding: String = null,
    interruptStep: js.UndefOr[Double] = js.undefined,
    logN: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(dkLen = dkLen.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    if (!js.isUndefined(N)) __obj.updateDynamic("N")(N.get.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(interruptStep)) __obj.updateDynamic("interruptStep")(interruptStep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(logN)) __obj.updateDynamic("logN")(logN.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

