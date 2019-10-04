package typings.atPulumiAws.typesOutputMod.redshiftNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityGroupIngress extends js.Object {
  /**
    * The CIDR block to accept
    */
  var cidr: js.UndefOr[String] = js.undefined
  /**
    * The name of the security group to authorize
    */
  var securityGroupName: String
  /**
    * The owner Id of the security group provided
    * by `securityGroupName`.
    */
  var securityGroupOwnerId: String
}

object SecurityGroupIngress {
  @scala.inline
  def apply(securityGroupName: String, securityGroupOwnerId: String, cidr: String = null): SecurityGroupIngress = {
    val __obj = js.Dynamic.literal(securityGroupName = securityGroupName, securityGroupOwnerId = securityGroupOwnerId)
    if (cidr != null) __obj.updateDynamic("cidr")(cidr)
    __obj.asInstanceOf[SecurityGroupIngress]
  }
}

