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
    iter: Int | Double = null,
    ks: Int | Double = null,
    mode: String = null,
    ts: Int | Double = null,
    v: Int | Double = null
  ): SjclCipherParams = {
    val __obj = js.Dynamic.literal()
    if (adata != null) __obj.updateDynamic("adata")(adata.asInstanceOf[js.Any])
    if (cipher != null) __obj.updateDynamic("cipher")(cipher.asInstanceOf[js.Any])
    if (iter != null) __obj.updateDynamic("iter")(iter.asInstanceOf[js.Any])
    if (ks != null) __obj.updateDynamic("ks")(ks.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (ts != null) __obj.updateDynamic("ts")(ts.asInstanceOf[js.Any])
    if (v != null) __obj.updateDynamic("v")(v.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclCipherParams]
  }
}

