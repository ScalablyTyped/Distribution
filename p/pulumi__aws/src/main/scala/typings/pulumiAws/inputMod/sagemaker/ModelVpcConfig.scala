package typings.pulumiAws.inputMod.sagemaker

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelVpcConfig extends js.Object {
  var securityGroupIds: Input[js.Array[Input[String]]] = js.native
  var subnets: Input[js.Array[Input[String]]] = js.native
}

object ModelVpcConfig {
  @scala.inline
  def apply(securityGroupIds: Input[js.Array[Input[String]]], subnets: Input[js.Array[Input[String]]]): ModelVpcConfig = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelVpcConfig]
  }
  @scala.inline
  implicit class ModelVpcConfigOps[Self <: ModelVpcConfig] (val x: Self) extends AnyVal {
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
    def setSecurityGroupIdsVarargs(value: Input[String]*): Self = this.set("securityGroupIds", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubnetsVarargs(value: Input[String]*): Self = this.set("subnets", js.Array(value :_*))
    @scala.inline
    def setSubnets(value: Input[js.Array[Input[String]]]): Self = this.set("subnets", value.asInstanceOf[js.Any])
  }
  
}

