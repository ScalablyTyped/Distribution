package typings.atPulumiAws.typesOutputMod.organizations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOrganizationNonMasterAccount extends js.Object {
  /**
    * ARN of the root
    */
  var arn: String
  /**
    * Email of the account
    */
  var email: String
  /**
    * Identifier of the root
    */
  var id: String
  /**
    * The name of the policy type
    */
  var name: String
}

object GetOrganizationNonMasterAccount {
  @scala.inline
  def apply(arn: String, email: String, id: String, name: String): GetOrganizationNonMasterAccount = {
    val __obj = js.Dynamic.literal(arn = arn, email = email, id = id, name = name)
  
    __obj.asInstanceOf[GetOrganizationNonMasterAccount]
  }
}

