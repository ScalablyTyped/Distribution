package typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs

import typings.stellarDashBase.stellarDashBaseMod.AuthFlag
import typings.stellarDashBase.stellarDashBaseMod.SignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetOptions[T /* <: SignerOptions */] extends BaseOptions {
  var clearFlags: js.UndefOr[AuthFlag] = js.undefined
  var highThreshold: js.UndefOr[Double | String] = js.undefined
  var homeDomain: js.UndefOr[String] = js.undefined
  var inflationDest: js.UndefOr[String] = js.undefined
  var lowThreshold: js.UndefOr[Double | String] = js.undefined
  var masterWeight: js.UndefOr[Double | String] = js.undefined
  var medThreshold: js.UndefOr[Double | String] = js.undefined
  var setFlags: js.UndefOr[AuthFlag] = js.undefined
  var signer: js.UndefOr[T] = js.undefined
}

object SetOptions {
  @scala.inline
  def apply[T /* <: SignerOptions */](
    clearFlags: AuthFlag = null,
    highThreshold: Double | String = null,
    homeDomain: String = null,
    inflationDest: String = null,
    lowThreshold: Double | String = null,
    masterWeight: Double | String = null,
    medThreshold: Double | String = null,
    setFlags: AuthFlag = null,
    signer: T = null,
    source: String = null
  ): SetOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (clearFlags != null) __obj.updateDynamic("clearFlags")(clearFlags.asInstanceOf[js.Any])
    if (highThreshold != null) __obj.updateDynamic("highThreshold")(highThreshold.asInstanceOf[js.Any])
    if (homeDomain != null) __obj.updateDynamic("homeDomain")(homeDomain)
    if (inflationDest != null) __obj.updateDynamic("inflationDest")(inflationDest)
    if (lowThreshold != null) __obj.updateDynamic("lowThreshold")(lowThreshold.asInstanceOf[js.Any])
    if (masterWeight != null) __obj.updateDynamic("masterWeight")(masterWeight.asInstanceOf[js.Any])
    if (medThreshold != null) __obj.updateDynamic("medThreshold")(medThreshold.asInstanceOf[js.Any])
    if (setFlags != null) __obj.updateDynamic("setFlags")(setFlags.asInstanceOf[js.Any])
    if (signer != null) __obj.updateDynamic("signer")(signer.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[SetOptions[T]]
  }
}

