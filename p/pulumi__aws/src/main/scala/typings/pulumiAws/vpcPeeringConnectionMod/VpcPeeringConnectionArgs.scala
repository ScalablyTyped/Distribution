package typings.pulumiAws.vpcPeeringConnectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.VpcPeeringConnectionAccepter
import typings.pulumiAws.inputMod.ec2.VpcPeeringConnectionRequester
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcPeeringConnectionArgs extends js.Object {
  /**
    * An optional configuration block that allows for [VPC Peering Connection]
    * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that accepts
    * the peering connection (a maximum of one).
    */
  val accepter: js.UndefOr[Input[VpcPeeringConnectionAccepter]] = js.native
  /**
    * Accept the peering (both VPCs need to be in the same AWS account).
    */
  val autoAccept: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The AWS account ID of the owner of the peer VPC.
    * Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
    */
  val peerOwnerId: js.UndefOr[Input[String]] = js.native
  /**
    * The region of the accepter VPC of the [VPC Peering Connection]. `autoAccept` must be `false`,
    * and use the `aws.ec2.VpcPeeringConnectionAccepter` to manage the accepter side.
    */
  val peerRegion: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the VPC with which you are creating the VPC Peering Connection.
    */
  val peerVpcId: Input[String] = js.native
  /**
    * A optional configuration block that allows for [VPC Peering Connection]
    * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that requests
    * the peering connection (a maximum of one).
    */
  val requester: js.UndefOr[Input[VpcPeeringConnectionRequester]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The ID of the requester VPC.
    */
  val vpcId: Input[String] = js.native
}

object VpcPeeringConnectionArgs {
  @scala.inline
  def apply(peerVpcId: Input[String], vpcId: Input[String]): VpcPeeringConnectionArgs = {
    val __obj = js.Dynamic.literal(peerVpcId = peerVpcId.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcPeeringConnectionArgs]
  }
  @scala.inline
  implicit class VpcPeeringConnectionArgsOps[Self <: VpcPeeringConnectionArgs] (val x: Self) extends AnyVal {
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
    def setPeerVpcId(value: Input[String]): Self = this.set("peerVpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccepter(value: Input[VpcPeeringConnectionAccepter]): Self = this.set("accepter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccepter: Self = this.set("accepter", js.undefined)
    @scala.inline
    def setAutoAccept(value: Input[Boolean]): Self = this.set("autoAccept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoAccept: Self = this.set("autoAccept", js.undefined)
    @scala.inline
    def setPeerOwnerId(value: Input[String]): Self = this.set("peerOwnerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerOwnerId: Self = this.set("peerOwnerId", js.undefined)
    @scala.inline
    def setPeerRegion(value: Input[String]): Self = this.set("peerRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerRegion: Self = this.set("peerRegion", js.undefined)
    @scala.inline
    def setRequester(value: Input[VpcPeeringConnectionRequester]): Self = this.set("requester", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequester: Self = this.set("requester", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

