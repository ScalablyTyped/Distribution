package typings.pulumiAws.egressOnlyInternetGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EgressOnlyInternetGatewayArgs extends js.Object {
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The VPC ID to create in.
    */
  val vpcId: Input[String] = js.native
}

object EgressOnlyInternetGatewayArgs {
  @scala.inline
  def apply(vpcId: Input[String]): EgressOnlyInternetGatewayArgs = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EgressOnlyInternetGatewayArgs]
  }
  @scala.inline
  implicit class EgressOnlyInternetGatewayArgsOps[Self <: EgressOnlyInternetGatewayArgs] (val x: Self) extends AnyVal {
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
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

