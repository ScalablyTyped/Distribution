package typings.pulumiAws.inputMod.datasync

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EfsLocationEc2Config extends js.Object {
  /**
    * List of Amazon Resource Names (ARNs) of the EC2 Security Groups that are associated with the EFS Mount Target.
    */
  var securityGroupArns: Input[js.Array[Input[String]]] = js.native
  /**
    * Amazon Resource Name (ARN) of the EC2 Subnet that is associated with the EFS Mount Target.
    */
  var subnetArn: Input[String] = js.native
}

object EfsLocationEc2Config {
  @scala.inline
  def apply(securityGroupArns: Input[js.Array[Input[String]]], subnetArn: Input[String]): EfsLocationEc2Config = {
    val __obj = js.Dynamic.literal(securityGroupArns = securityGroupArns.asInstanceOf[js.Any], subnetArn = subnetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EfsLocationEc2Config]
  }
  @scala.inline
  implicit class EfsLocationEc2ConfigOps[Self <: EfsLocationEc2Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSecurityGroupArnsVarargs(value: Input[String]*): Self = this.set("securityGroupArns", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupArns(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroupArns", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubnetArn(value: Input[String]): Self = this.set("subnetArn", value.asInstanceOf[js.Any])
  }
  
}

