package typings.pulumiAws.vpcPeeringConnectionAccepterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.VpcPeeringConnectionAccepterAccepter
import typings.pulumiAws.inputMod.ec2.VpcPeeringConnectionAccepterRequester
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcPeeringConnectionAccepterState extends js.Object {
  /**
    * The status of the VPC Peering Connection request.
    */
  val acceptStatus: js.UndefOr[Input[String]] = js.native
  /**
    * A configuration block that describes [VPC Peering Connection]
    * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the accepter VPC.
    */
  val accepter: js.UndefOr[Input[VpcPeeringConnectionAccepterAccepter]] = js.native
  /**
    * Whether or not to accept the peering request. Defaults to `false`.
    */
  val autoAccept: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The AWS account ID of the owner of the requester VPC.
    */
  val peerOwnerId: js.UndefOr[Input[String]] = js.native
  /**
    * The region of the accepter VPC.
    */
  val peerRegion: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the requester VPC.
    */
  val peerVpcId: js.UndefOr[Input[String]] = js.native
  /**
    * A configuration block that describes [VPC Peering Connection]
    * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the requester VPC.
    */
  val requester: js.UndefOr[Input[VpcPeeringConnectionAccepterRequester]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The ID of the accepter VPC.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
  /**
    * The VPC Peering Connection ID to manage.
    */
  val vpcPeeringConnectionId: js.UndefOr[Input[String]] = js.native
}

object VpcPeeringConnectionAccepterState {
  @scala.inline
  def apply(): VpcPeeringConnectionAccepterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcPeeringConnectionAccepterState]
  }
  @scala.inline
  implicit class VpcPeeringConnectionAccepterStateOps[Self <: VpcPeeringConnectionAccepterState] (val x: Self) extends AnyVal {
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
    def setAcceptStatus(value: Input[String]): Self = this.set("acceptStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptStatus: Self = this.set("acceptStatus", js.undefined)
    @scala.inline
    def setAccepter(value: Input[VpcPeeringConnectionAccepterAccepter]): Self = this.set("accepter", value.asInstanceOf[js.Any])
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
    def setPeerVpcId(value: Input[String]): Self = this.set("peerVpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerVpcId: Self = this.set("peerVpcId", js.undefined)
    @scala.inline
    def setRequester(value: Input[VpcPeeringConnectionAccepterRequester]): Self = this.set("requester", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequester: Self = this.set("requester", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
    @scala.inline
    def setVpcPeeringConnectionId(value: Input[String]): Self = this.set("vpcPeeringConnectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcPeeringConnectionId: Self = this.set("vpcPeeringConnectionId", js.undefined)
  }
  
}

