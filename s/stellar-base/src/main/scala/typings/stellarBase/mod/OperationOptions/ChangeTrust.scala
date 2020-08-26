package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeTrust extends BaseOptions {
  var asset: Asset = js.native
  var limit: js.UndefOr[String] = js.native
}

object ChangeTrust {
  @scala.inline
  def apply(asset: Asset): ChangeTrust = {
    val __obj = js.Dynamic.literal(asset = asset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeTrust]
  }
  @scala.inline
  implicit class ChangeTrustOps[Self <: ChangeTrust] (val x: Self) extends AnyVal {
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
    def setAsset(value: Asset): Self = this.set("asset", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimit(value: String): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
  }
  
}

