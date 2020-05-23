package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ________________________________________________________________________
trait SjclCipherParams extends js.Object {
  var adata: js.UndefOr[String] = js.undefined
  var cipher: js.UndefOr[String] = js.undefined
  var iter: js.UndefOr[Double] = js.undefined
  var ks: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var ts: js.UndefOr[Double] = js.undefined
  var v: js.UndefOr[Double] = js.undefined
}

object SjclCipherParams {
  @scala.inline
  def apply(
    adata: String = null,
    cipher: String = null,
    iter: js.UndefOr[Double] = js.undefined,
    ks: js.UndefOr[Double] = js.undefined,
    mode: String = null,
    ts: js.UndefOr[Double] = js.undefined,
    v: js.UndefOr[Double] = js.undefined
  ): SjclCipherParams = {
    val __obj = js.Dynamic.literal()
    if (adata != null) __obj.updateDynamic("adata")(adata.asInstanceOf[js.Any])
    if (cipher != null) __obj.updateDynamic("cipher")(cipher.asInstanceOf[js.Any])
    if (!js.isUndefined(iter)) __obj.updateDynamic("iter")(iter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ks)) __obj.updateDynamic("ks")(ks.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(ts)) __obj.updateDynamic("ts")(ts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(v)) __obj.updateDynamic("v")(v.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclCipherParams]
  }
}

