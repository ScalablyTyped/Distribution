package typings.atPulumiAws.iamGetAccountAliasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccountAliasResult extends js.Object {
  /**
    * The alias associated with the AWS account.
    */
  val accountAlias: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
}

object GetAccountAliasResult {
  @scala.inline
  def apply(accountAlias: String, id: String): GetAccountAliasResult = {
    val __obj = js.Dynamic.literal(accountAlias = accountAlias, id = id)
  
    __obj.asInstanceOf[GetAccountAliasResult]
  }
}

