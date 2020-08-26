package typings.pulumiAws.getAccountAliasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccountAliasResult extends js.Object {
  /**
    * The alias associated with the AWS account.
    */
  val accountAlias: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
}

object GetAccountAliasResult {
  @scala.inline
  def apply(accountAlias: String, id: String): GetAccountAliasResult = {
    val __obj = js.Dynamic.literal(accountAlias = accountAlias.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccountAliasResult]
  }
  @scala.inline
  implicit class GetAccountAliasResultOps[Self <: GetAccountAliasResult] (val x: Self) extends AnyVal {
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
    def setAccountAlias(value: String): Self = this.set("accountAlias", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
  }
  
}

