package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cidr extends js.Object {
  var cidr: js.UndefOr[java.lang.String] = js.undefined
  var securityGroupId: java.lang.String
  var securityGroupName: java.lang.String
  var securityGroupOwnerId: java.lang.String
}

object Anon_Cidr {
  @scala.inline
  def apply(
    securityGroupId: java.lang.String,
    securityGroupName: java.lang.String,
    securityGroupOwnerId: java.lang.String,
    cidr: java.lang.String = null
  ): Anon_Cidr = {
    val __obj = js.Dynamic.literal(securityGroupId = securityGroupId, securityGroupName = securityGroupName, securityGroupOwnerId = securityGroupOwnerId)
    if (cidr != null) __obj.updateDynamic("cidr")(cidr)
    __obj.asInstanceOf[Anon_Cidr]
  }
}

