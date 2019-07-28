package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cidr extends js.Object {
  var cidr: js.UndefOr[String] = js.undefined
  var securityGroupId: String
  var securityGroupName: String
  var securityGroupOwnerId: String
}

object Anon_Cidr {
  @scala.inline
  def apply(
    securityGroupId: String,
    securityGroupName: String,
    securityGroupOwnerId: String,
    cidr: String = null
  ): Anon_Cidr = {
    val __obj = js.Dynamic.literal(securityGroupId = securityGroupId, securityGroupName = securityGroupName, securityGroupOwnerId = securityGroupOwnerId)
    if (cidr != null) __obj.updateDynamic("cidr")(cidr)
    __obj.asInstanceOf[Anon_Cidr]
  }
}

