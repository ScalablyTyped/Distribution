package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod.AuthFlag
import typings.stellarBase.mod.SignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetOptions[T /* <: SignerOptions */] extends BaseOptions {
  var clearFlags: js.UndefOr[AuthFlag] = js.native
  var highThreshold: js.UndefOr[Double | String] = js.native
  var homeDomain: js.UndefOr[String] = js.native
  var inflationDest: js.UndefOr[String] = js.native
  var lowThreshold: js.UndefOr[Double | String] = js.native
  var masterWeight: js.UndefOr[Double | String] = js.native
  var medThreshold: js.UndefOr[Double | String] = js.native
  var setFlags: js.UndefOr[AuthFlag] = js.native
  var signer: js.UndefOr[T] = js.native
}

object SetOptions {
  @scala.inline
  def apply[/* <: typings.stellarBase.mod.SignerOptions */ T](): SetOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetOptions[T]]
  }
  @scala.inline
  implicit class SetOptionsOps[Self <: SetOptions[_], /* <: typings.stellarBase.mod.SignerOptions */ T] (val x: Self with SetOptions[T]) extends AnyVal {
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
    def setClearFlags(value: AuthFlag): Self = this.set("clearFlags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearFlags: Self = this.set("clearFlags", js.undefined)
    @scala.inline
    def setHighThreshold(value: Double | String): Self = this.set("highThreshold", value.asInstanceOf[js.Any])
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
    def setLowThreshold(value: Double | String): Self = this.set("lowThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowThreshold: Self = this.set("lowThreshold", js.undefined)
    @scala.inline
    def setMasterWeight(value: Double | String): Self = this.set("masterWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterWeight: Self = this.set("masterWeight", js.undefined)
    @scala.inline
    def setMedThreshold(value: Double | String): Self = this.set("medThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedThreshold: Self = this.set("medThreshold", js.undefined)
    @scala.inline
    def setSetFlags(value: AuthFlag): Self = this.set("setFlags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetFlags: Self = this.set("setFlags", js.undefined)
    @scala.inline
    def setSigner(value: T): Self = this.set("signer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSigner: Self = this.set("signer", js.undefined)
  }
  
}

