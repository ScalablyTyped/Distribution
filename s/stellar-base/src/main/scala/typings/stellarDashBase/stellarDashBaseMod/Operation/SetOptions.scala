package typings.stellarDashBase.stellarDashBaseMod.Operation

import typings.stellarDashBase.stellarDashBaseMod.AuthFlag
import typings.stellarDashBase.stellarDashBaseMod.Signer.Ed25519PublicKey
import typings.stellarDashBase.stellarDashBaseMod.Signer.PreAuthTx
import typings.stellarDashBase.stellarDashBaseMod.Signer.Sha256Hash
import typings.stellarDashBase.stellarDashBaseMod.SignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetOptions[T /* <: SignerOptions */]
  extends BaseOperation[typings.stellarDashBase.stellarDashBaseMod.OperationType.SetOptions] {
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

object SetOptions {
  @scala.inline
  def apply[T /* <: SignerOptions */](
    signer: PreAuthTx | Sha256Hash | Ed25519PublicKey,
    `type`: typings.stellarDashBase.stellarDashBaseMod.OperationType.SetOptions,
    clearFlags: AuthFlag = null,
    highThreshold: Int | Double = null,
    homeDomain: String = null,
    inflationDest: String = null,
    lowThreshold: Int | Double = null,
    masterWeight: Int | Double = null,
    medThreshold: Int | Double = null,
    setFlags: AuthFlag = null,
    source: String = null
  ): SetOptions[T] = {
    val __obj = js.Dynamic.literal(signer = signer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (clearFlags != null) __obj.updateDynamic("clearFlags")(clearFlags.asInstanceOf[js.Any])
    if (highThreshold != null) __obj.updateDynamic("highThreshold")(highThreshold.asInstanceOf[js.Any])
    if (homeDomain != null) __obj.updateDynamic("homeDomain")(homeDomain)
    if (inflationDest != null) __obj.updateDynamic("inflationDest")(inflationDest)
    if (lowThreshold != null) __obj.updateDynamic("lowThreshold")(lowThreshold.asInstanceOf[js.Any])
    if (masterWeight != null) __obj.updateDynamic("masterWeight")(masterWeight.asInstanceOf[js.Any])
    if (medThreshold != null) __obj.updateDynamic("medThreshold")(medThreshold.asInstanceOf[js.Any])
    if (setFlags != null) __obj.updateDynamic("setFlags")(setFlags.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[SetOptions[T]]
  }
}

@JSImport("stellar-base", "Operation.setOptions")
@js.native
object setOptions extends js.Object {
  def apply[T /* <: SignerOptions */](options: typings.stellarDashBase.stellarDashBaseMod.OperationOptions.SetOptions[T]): typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[SetOptions[T]] = js.native
}

