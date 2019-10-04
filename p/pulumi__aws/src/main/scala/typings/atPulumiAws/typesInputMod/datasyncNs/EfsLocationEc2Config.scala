package typings.atPulumiAws.typesInputMod.datasyncNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EfsLocationEc2Config extends js.Object {
  /**
    * List of Amazon Resource Names (ARNs) of the EC2 Security Groups that are associated with the EFS Mount Target.
    */
  var securityGroupArns: Input[js.Array[Input[String]]]
  /**
    * Amazon Resource Name (ARN) of the EC2 Subnet that is associated with the EFS Mount Target.
    */
  var subnetArn: Input[String]
}

object EfsLocationEc2Config {
  @scala.inline
  def apply(securityGroupArns: Input[js.Array[Input[String]]], subnetArn: Input[String]): EfsLocationEc2Config = {
    val __obj = js.Dynamic.literal(securityGroupArns = securityGroupArns.asInstanceOf[js.Any], subnetArn = subnetArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EfsLocationEc2Config]
  }
}

