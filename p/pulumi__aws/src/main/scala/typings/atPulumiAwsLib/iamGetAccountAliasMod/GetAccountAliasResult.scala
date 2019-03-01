package typings
package atPulumiAwsLib.iamGetAccountAliasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccountAliasResult extends js.Object {
  /**
    * The alias associated with the AWS account.
    */
  val accountAlias: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
}

object GetAccountAliasResult {
  @scala.inline
  def apply(accountAlias: java.lang.String, id: java.lang.String): GetAccountAliasResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accountAlias")(accountAlias)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[GetAccountAliasResult]
  }
}

