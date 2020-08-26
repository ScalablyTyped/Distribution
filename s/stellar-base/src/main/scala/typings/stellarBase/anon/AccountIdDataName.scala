package typings.stellarBase.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountIdDataName extends js.Object {
  var accountId: typings.stellarBase.xdrMod.xdr.AccountId = js.native
  var dataName: String | Buffer = js.native
}

object AccountIdDataName {
  @scala.inline
  def apply(accountId: typings.stellarBase.xdrMod.xdr.AccountId, dataName: String | Buffer): AccountIdDataName = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], dataName = dataName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountIdDataName]
  }
  @scala.inline
  implicit class AccountIdDataNameOps[Self <: AccountIdDataName] (val x: Self) extends AnyVal {
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
    def setAccountId(value: typings.stellarBase.xdrMod.xdr.AccountId): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataName(value: String | Buffer): Self = this.set("dataName", value.asInstanceOf[js.Any])
  }
  
}

