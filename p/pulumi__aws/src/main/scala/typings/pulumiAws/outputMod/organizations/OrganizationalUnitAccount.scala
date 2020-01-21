package typings.pulumiAws.outputMod.organizations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationalUnitAccount extends js.Object {
  /**
    * ARN of the organizational unit
    */
  var arn: String = js.native
  /**
    * Email of the account
    */
  var email: String = js.native
  /**
    * Identifier of the organization unit
    */
  var id: String = js.native
  /**
    * The name for the organizational unit
    */
  var name: String = js.native
}

object OrganizationalUnitAccount {
  @scala.inline
  def apply(arn: String, email: String, id: String, name: String): OrganizationalUnitAccount = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OrganizationalUnitAccount]
  }
}

