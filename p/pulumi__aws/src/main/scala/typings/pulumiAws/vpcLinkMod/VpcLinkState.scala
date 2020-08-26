package typings.pulumiAws.vpcLinkMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcLinkState extends js.Object {
  /**
    * The VPC Link ARN.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the VPC Link.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Security group IDs for the VPC Link.
    */
  val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Subnet IDs for the VPC Link.
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A map of tags to assign to the VPC Link.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object VpcLinkState {
  @scala.inline
  def apply(): VpcLinkState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcLinkState]
  }
  @scala.inline
  implicit class VpcLinkStateOps[Self <: VpcLinkState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSecurityGroupIdsVarargs(value: Input[String]*): Self = this.set("securityGroupIds", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("securityGroupIds", js.undefined)
    @scala.inline
    def setSubnetIdsVarargs(value: Input[String]*): Self = this.set("subnetIds", js.Array(value :_*))
    @scala.inline
    def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetIds: Self = this.set("subnetIds", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

