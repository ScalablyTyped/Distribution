package typings.pulumiAws.outputMod.organizations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationNonMasterAccount extends js.Object {
  /**
    * ARN of the root
    */
  var arn: String = js.native
  /**
    * Email of the account
    */
  var email: String = js.native
  /**
    * Identifier of the root
    */
  var id: String = js.native
  /**
    * The name of the policy type
    */
  var name: String = js.native
  /**
    * The status of the policy type as it relates to the associated root
    */
  var status: String = js.native
}

object OrganizationNonMasterAccount {
  @scala.inline
  def apply(arn: String, email: String, id: String, name: String, status: String): OrganizationNonMasterAccount = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationNonMasterAccount]
  }
}

