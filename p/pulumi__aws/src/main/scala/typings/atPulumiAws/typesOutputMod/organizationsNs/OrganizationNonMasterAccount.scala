package typings.atPulumiAws.typesOutputMod.organizationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationNonMasterAccount extends js.Object {
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

object OrganizationNonMasterAccount {
  @scala.inline
  def apply(arn: String, email: String, id: String, name: String): OrganizationNonMasterAccount = {
    val __obj = js.Dynamic.literal(arn = arn, email = email, id = id, name = name)
  
    __obj.asInstanceOf[OrganizationNonMasterAccount]
  }
}

