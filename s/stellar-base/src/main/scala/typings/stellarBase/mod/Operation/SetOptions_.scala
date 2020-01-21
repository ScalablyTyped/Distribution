package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.AuthFlag
import typings.stellarBase.mod.OperationType.SetOptions
import typings.stellarBase.mod.Signer.Ed25519PublicKey
import typings.stellarBase.mod.Signer.PreAuthTx
import typings.stellarBase.mod.Signer.Sha256Hash
import typings.stellarBase.mod.SignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetOptions_[T /* <: SignerOptions */] extends BaseOperation[SetOptions] {
  var clearFlags: js.UndefOr[AuthFlag] = js.undefined
  var highThreshold: js.UndefOr[Double] = js.undefined
  var homeDomain: js.UndefOr[String] = js.undefined
  var inflationDest: js.UndefOr[String] = js.undefined
  var lowThreshold: js.UndefOr[Double] = js.undefined
  var masterWeight: js.UndefOr[Double] = js.undefined
  var medThreshold: js.UndefOr[Double] = js.undefined
  var setFlags: js.UndefOr[AuthFlag] = js.undefined
  var signer: PreAuthTx | Sha256Hash | Ed25519PublicKey
}

object SetOptions_ {
  @scala.inline
  def apply[T /* <: SignerOptions */](
    signer: PreAuthTx | Sha256Hash | Ed25519PublicKey,
    `type`: SetOptions,
    clearFlags: AuthFlag = null,
    highThreshold: Int | Double = null,
    homeDomain: String = null,
    inflationDest: String = null,
    lowThreshold: Int | Double = null,
    masterWeight: Int | Double = null,
    medThreshold: Int | Double = null,
    setFlags: AuthFlag = null,
    source: String = null
  ): SetOptions_[T] = {
    val __obj = js.Dynamic.literal(signer = signer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (clearFlags != null) __obj.updateDynamic("clearFlags")(clearFlags.asInstanceOf[js.Any])
    if (highThreshold != null) __obj.updateDynamic("highThreshold")(highThreshold.asInstanceOf[js.Any])
    if (homeDomain != null) __obj.updateDynamic("homeDomain")(homeDomain.asInstanceOf[js.Any])
    if (inflationDest != null) __obj.updateDynamic("inflationDest")(inflationDest.asInstanceOf[js.Any])
    if (lowThreshold != null) __obj.updateDynamic("lowThreshold")(lowThreshold.asInstanceOf[js.Any])
    if (masterWeight != null) __obj.updateDynamic("masterWeight")(masterWeight.asInstanceOf[js.Any])
    if (medThreshold != null) __obj.updateDynamic("medThreshold")(medThreshold.asInstanceOf[js.Any])
    if (setFlags != null) __obj.updateDynamic("setFlags")(setFlags.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOptions_[T]]
  }
}

