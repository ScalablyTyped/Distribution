package typings.pulumiAws.outputMod.rds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityGroupIngress extends js.Object {
  /**
    * The CIDR block to accept
    */
  var cidr: js.UndefOr[String] = js.native
  /**
    * The ID of the security group to authorize
    */
  var securityGroupId: String = js.native
  /**
    * The name of the security group to authorize
    */
  var securityGroupName: String = js.native
  /**
    * The owner Id of the security group provided
    * by `securityGroupName`.
    */
  var securityGroupOwnerId: String = js.native
}

object SecurityGroupIngress {
  @scala.inline
  def apply(
    securityGroupId: String,
    securityGroupName: String,
    securityGroupOwnerId: String,
    cidr: String = null
  ): SecurityGroupIngress = {
    val __obj = js.Dynamic.literal(securityGroupId = securityGroupId.asInstanceOf[js.Any], securityGroupName = securityGroupName.asInstanceOf[js.Any], securityGroupOwnerId = securityGroupOwnerId.asInstanceOf[js.Any])
    if (cidr != null) __obj.updateDynamic("cidr")(cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGroupIngress]
  }
}

