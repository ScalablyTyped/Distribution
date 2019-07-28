package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CidrSecurityGroupName extends js.Object {
  var cidr: js.UndefOr[String] = js.undefined
  var securityGroupName: String
  var securityGroupOwnerId: String
}

object Anon_CidrSecurityGroupName {
  @scala.inline
  def apply(securityGroupName: String, securityGroupOwnerId: String, cidr: String = null): Anon_CidrSecurityGroupName = {
    val __obj = js.Dynamic.literal(securityGroupName = securityGroupName, securityGroupOwnerId = securityGroupOwnerId)
    if (cidr != null) __obj.updateDynamic("cidr")(cidr)
    __obj.asInstanceOf[Anon_CidrSecurityGroupName]
  }
}

