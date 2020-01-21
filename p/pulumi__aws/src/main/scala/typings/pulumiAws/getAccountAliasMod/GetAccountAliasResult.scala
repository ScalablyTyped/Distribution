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
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
}

object GetAccountAliasResult {
  @scala.inline
  def apply(accountAlias: String, id: String): GetAccountAliasResult = {
    val __obj = js.Dynamic.literal(accountAlias = accountAlias.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetAccountAliasResult]
  }
}

