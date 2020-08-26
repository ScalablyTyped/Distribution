package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.OperationType.AllowTrust
import typings.stellarBase.mod.TrustLineFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowTrust_ extends BaseOperation[AllowTrust] {
  var assetCode: String = js.native
  // this is a boolean or a number so that it can support protocol 12 or 13
  var authorize: js.UndefOr[Boolean | TrustLineFlag] = js.native
  var trustor: String = js.native
}

object AllowTrust_ {
  @scala.inline
  def apply(assetCode: String, trustor: String, `type`: AllowTrust): AllowTrust_ = {
    val __obj = js.Dynamic.literal(assetCode = assetCode.asInstanceOf[js.Any], trustor = trustor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowTrust_]
  }
  @scala.inline
  implicit class AllowTrust_Ops[Self <: AllowTrust_] (val x: Self) extends AnyVal {
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

