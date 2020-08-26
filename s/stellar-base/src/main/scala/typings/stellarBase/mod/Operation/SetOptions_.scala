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

@js.native
trait SetOptions_[T /* <: SignerOptions */] extends BaseOperation[SetOptions] {
  var clearFlags: js.UndefOr[AuthFlag] = js.native
  var highThreshold: js.UndefOr[Double] = js.native
  var homeDomain: js.UndefOr[String] = js.native
  var inflationDest: js.UndefOr[String] = js.native
  var lowThreshold: js.UndefOr[Double] = js.native
  var masterWeight: js.UndefOr[Double] = js.native
  var medThreshold: js.UndefOr[Double] = js.native
  var setFlags: js.UndefOr[AuthFlag] = js.native
  var signer: PreAuthTx | Sha256Hash | Ed25519PublicKey = js.native
}

object SetOptions_ {
  @scala.inline
  def apply[/* <: typings.stellarBase.mod.SignerOptions */ T](signer: PreAuthTx | Sha256Hash | Ed25519PublicKey, `type`: SetOptions): SetOptions_[T] = {
    val __obj = js.Dynamic.literal(signer = signer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOptions_[T]]
  }
  @scala.inline
  implicit class SetOptions_Ops[Self <: SetOptions_[_], /* <: typings.stellarBase.mod.SignerOptions */ T] (val x: Self with SetOptions_[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSigner(value: PreAuthTx | Sha256Hash | Ed25519PublicKey): Self = this.set("signer", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearFlags(value: AuthFlag): Self = this.set("clearFlags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearFlags: Self = this.set("clearFlags", js.undefined)
    @scala.inline
    def setHighThreshold(value: Double): Self = this.set("highThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighThreshold: Self = this.set("highThreshold", js.undefined)
    @scala.inline
    def setHomeDomain(value: String): Self = this.set("homeDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomeDomain: Self = this.set("homeDomain", js.undefined)
    @scala.inline
    def setInflationDest(value: String): Self = this.set("inflationDest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInflationDest: Self = this.set("inflationDest", js.undefined)
    @scala.inline
    def setLowThreshold(value: Double): Self = this.set("lowThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowThreshold: Self = this.set("lowThreshold", js.undefined)
    @scala.inline
    def setMasterWeight(value: Double): Self = this.set("masterWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterWeight: Self = this.set("masterWeight", js.undefined)
    @scala.inline
    def setMedThreshold(value: Double): Self = this.set("medThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedThreshold: Self = this.set("medThreshold", js.undefined)
    @scala.inline
    def setSetFlags(value: AuthFlag): Self = this.set("setFlags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetFlags: Self = this.set("setFlags", js.undefined)
  }
  
}

