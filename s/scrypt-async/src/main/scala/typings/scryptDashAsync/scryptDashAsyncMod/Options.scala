package typings.scryptDashAsync.scryptDashAsyncMod

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
    N: Int | Double = null,
    encoding: String = null,
    interruptStep: Int | Double = null,
    logN: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(dkLen = dkLen.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    if (N != null) __obj.updateDynamic("N")(N.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (interruptStep != null) __obj.updateDynamic("interruptStep")(interruptStep.asInstanceOf[js.Any])
    if (logN != null) __obj.updateDynamic("logN")(logN.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

