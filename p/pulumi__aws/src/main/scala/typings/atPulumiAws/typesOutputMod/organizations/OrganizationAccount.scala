package typings.atPulumiAws.typesOutputMod.organizations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationAccount extends js.Object {
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
}

object OrganizationAccount {
  @scala.inline
  def apply(arn: String, email: String, id: String, name: String): OrganizationAccount = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OrganizationAccount]
  }
}

