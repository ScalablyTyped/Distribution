package typings.atPulumiAws.typesOutputMod.organizationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationalUnitAccount extends js.Object {
  /**
    * ARN of the organizational unit
    */
  var arn: String
  /**
    * Email of the account
    */
  var email: String
  /**
    * Identifier of the organization unit
    */
  var id: String
  /**
    * The name for the organizational unit
    */
  var name: String
}

object OrganizationalUnitAccount {
  @scala.inline
  def apply(arn: String, email: String, id: String, name: String): OrganizationalUnitAccount = {
    val __obj = js.Dynamic.literal(arn = arn, email = email, id = id, name = name)
  
    __obj.asInstanceOf[OrganizationalUnitAccount]
  }
}

