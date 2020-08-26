package typings.pulumiAws.peeringConnectionOptionsMod

import typings.pulumiAws.inputMod.ec2.PeeringConnectionOptionsAccepter
import typings.pulumiAws.inputMod.ec2.PeeringConnectionOptionsRequester
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeeringConnectionOptionsArgs extends js.Object {
  /**
    * An optional configuration block that allows for [VPC Peering Connection]
    * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that accepts
    * the peering connection (a maximum of one).
    */
  val accepter: js.UndefOr[Input[PeeringConnectionOptionsAccepter]] = js.native
  /**
    * A optional configuration block that allows for [VPC Peering Connection]
    * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that requests
    * the peering connection (a maximum of one).
    */
  val requester: js.UndefOr[Input[PeeringConnectionOptionsRequester]] = js.native
  /**
    * The ID of the requester VPC peering connection.
    */
  val vpcPeeringConnectionId: Input[String] = js.native
}

object PeeringConnectionOptionsArgs {
  @scala.inline
  def apply(vpcPeeringConnectionId: Input[String]): PeeringConnectionOptionsArgs = {
    val __obj = js.Dynamic.literal(vpcPeeringConnectionId = vpcPeeringConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeeringConnectionOptionsArgs]
  }
  @scala.inline
  implicit class PeeringConnectionOptionsArgsOps[Self <: PeeringConnectionOptionsArgs] (val x: Self) extends AnyVal {
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
    def setVpcPeeringConnectionId(value: Input[String]): Self = this.set("vpcPeeringConnectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccepter(value: Input[PeeringConnectionOptionsAccepter]): Self = this.set("accepter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccepter: Self = this.set("accepter", js.undefined)
    @scala.inline
    def setRequester(value: Input[PeeringConnectionOptionsRequester]): Self = this.set("requester", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequester: Self = this.set("requester", js.undefined)
  }
  
}

