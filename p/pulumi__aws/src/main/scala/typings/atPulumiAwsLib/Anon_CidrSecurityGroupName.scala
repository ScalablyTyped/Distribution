package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CidrSecurityGroupName extends js.Object {
  var cidr: js.UndefOr[java.lang.String] = js.undefined
  var securityGroupName: java.lang.String
  var securityGroupOwnerId: java.lang.String
}

object Anon_CidrSecurityGroupName {
  @scala.inline
  def apply(
    securityGroupName: java.lang.String,
    securityGroupOwnerId: java.lang.String,
    cidr: java.lang.String = null
  ): Anon_CidrSecurityGroupName = {
    val __obj = js.Dynamic.literal(securityGroupName = securityGroupName, securityGroupOwnerId = securityGroupOwnerId)
    if (cidr != null) __obj.updateDynamic("cidr")(cidr)
    __obj.asInstanceOf[Anon_CidrSecurityGroupName]
  }
}

