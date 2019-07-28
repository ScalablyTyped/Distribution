package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SecurityGroupArnsSubnetArn extends js.Object {
  var securityGroupArns: Input[js.Array[Input[String]]]
  var subnetArn: Input[String]
}

object Anon_SecurityGroupArnsSubnetArn {
  @scala.inline
  def apply(securityGroupArns: Input[js.Array[Input[String]]], subnetArn: Input[String]): Anon_SecurityGroupArnsSubnetArn = {
    val __obj = js.Dynamic.literal(securityGroupArns = securityGroupArns.asInstanceOf[js.Any], subnetArn = subnetArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_SecurityGroupArnsSubnetArn]
  }
}

