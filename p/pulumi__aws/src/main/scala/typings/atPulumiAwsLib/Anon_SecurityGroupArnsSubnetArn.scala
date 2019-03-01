package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SecurityGroupArnsSubnetArn extends js.Object {
  var securityGroupArns: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  var subnetArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_SecurityGroupArnsSubnetArn {
  @scala.inline
  def apply(
    securityGroupArns: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    subnetArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_SecurityGroupArnsSubnetArn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("securityGroupArns")(securityGroupArns.asInstanceOf[js.Any])
    __obj.updateDynamic("subnetArn")(subnetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SecurityGroupArnsSubnetArn]
  }
}

