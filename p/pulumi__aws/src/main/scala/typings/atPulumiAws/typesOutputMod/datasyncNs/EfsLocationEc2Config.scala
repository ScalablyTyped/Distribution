package typings.atPulumiAws.typesOutputMod.datasyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EfsLocationEc2Config extends js.Object {
  /**
    * List of Amazon Resource Names (ARNs) of the EC2 Security Groups that are associated with the EFS Mount Target.
    */
  var securityGroupArns: js.Array[String]
  /**
    * Amazon Resource Name (ARN) of the EC2 Subnet that is associated with the EFS Mount Target.
    */
  var subnetArn: String
}

object EfsLocationEc2Config {
  @scala.inline
  def apply(securityGroupArns: js.Array[String], subnetArn: String): EfsLocationEc2Config = {
    val __obj = js.Dynamic.literal(securityGroupArns = securityGroupArns, subnetArn = subnetArn)
  
    __obj.asInstanceOf[EfsLocationEc2Config]
  }
}

