package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod.TrustLineFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowTrust extends BaseOptions {
  var assetCode: String = js.native
  var authorize: js.UndefOr[Boolean | TrustLineFlag] = js.native
  var trustor: String = js.native
}

object AllowTrust {
  @scala.inline
  def apply(assetCode: String, trustor: String): AllowTrust = {
    val __obj = js.Dynamic.literal(assetCode = assetCode.asInstanceOf[js.Any], trustor = trustor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowTrust]
  }
  @scala.inline
  implicit class AllowTrustOps[Self <: AllowTrust] (val x: Self) extends AnyVal {
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
    def setAssetCode(value: String): Self = this.set("assetCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrustor(value: String): Self = this.set("trustor", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthorize(value: Boolean | TrustLineFlag): Self = this.set("authorize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorize: Self = this.set("authorize", js.undefined)
  }
  
}

