package typings
package scryptDashAsyncLib.scryptDashAsyncMod.scryptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var N: js.UndefOr[scala.Double] = js.undefined
  var dkLen: scala.Double
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var interruptStep: js.UndefOr[scala.Double] = js.undefined
  var logN: js.UndefOr[scala.Double] = js.undefined
  var p: scala.Double
  var r: scala.Double
}

object Options {
  @scala.inline
  def apply(
    dkLen: scala.Double,
    p: scala.Double,
    r: scala.Double,
    N: scala.Int | scala.Double = null,
    encoding: java.lang.String = null,
    interruptStep: scala.Int | scala.Double = null,
    logN: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dkLen")(dkLen)
    __obj.updateDynamic("p")(p)
    __obj.updateDynamic("r")(r)
    if (N != null) __obj.updateDynamic("N")(N.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (interruptStep != null) __obj.updateDynamic("interruptStep")(interruptStep.asInstanceOf[js.Any])
    if (logN != null) __obj.updateDynamic("logN")(logN.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

