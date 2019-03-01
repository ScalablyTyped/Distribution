package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ________________________________________________________________________
trait SjclCipherParams extends js.Object {
  var adata: js.UndefOr[java.lang.String] = js.undefined
  var cipher: js.UndefOr[java.lang.String] = js.undefined
  var iter: js.UndefOr[scala.Double] = js.undefined
  var ks: js.UndefOr[scala.Double] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var ts: js.UndefOr[scala.Double] = js.undefined
  var v: js.UndefOr[scala.Double] = js.undefined
}

object SjclCipherParams {
  @scala.inline
  def apply(
    adata: java.lang.String = null,
    cipher: java.lang.String = null,
    iter: scala.Int | scala.Double = null,
    ks: scala.Int | scala.Double = null,
    mode: java.lang.String = null,
    ts: scala.Int | scala.Double = null,
    v: scala.Int | scala.Double = null
  ): SjclCipherParams = {
    val __obj = js.Dynamic.literal()
    if (adata != null) __obj.updateDynamic("adata")(adata)
    if (cipher != null) __obj.updateDynamic("cipher")(cipher)
    if (iter != null) __obj.updateDynamic("iter")(iter.asInstanceOf[js.Any])
    if (ks != null) __obj.updateDynamic("ks")(ks.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (ts != null) __obj.updateDynamic("ts")(ts.asInstanceOf[js.Any])
    if (v != null) __obj.updateDynamic("v")(v.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclCipherParams]
  }
}

