package typings.atPulumiAws.typesInputMod.redshift

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityGroupIngress extends js.Object {
  /**
    * The CIDR block to accept
    */
  var cidr: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the security group to authorize
    */
  var securityGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * The owner Id of the security group provided
    * by `securityGroupName`.
    */
  var securityGroupOwnerId: js.UndefOr[Input[String]] = js.native
}

object SecurityGroupIngress {
  @scala.inline
  def apply(
    cidr: Input[String] = null,
    securityGroupName: Input[String] = null,
    securityGroupOwnerId: Input[String] = null
  ): SecurityGroupIngress = {
    val __obj = js.Dynamic.literal()
    if (cidr != null) __obj.updateDynamic("cidr")(cidr.asInstanceOf[js.Any])
    if (securityGroupName != null) __obj.updateDynamic("securityGroupName")(securityGroupName.asInstanceOf[js.Any])
    if (securityGroupOwnerId != null) __obj.updateDynamic("securityGroupOwnerId")(securityGroupOwnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGroupIngress]
  }
}

