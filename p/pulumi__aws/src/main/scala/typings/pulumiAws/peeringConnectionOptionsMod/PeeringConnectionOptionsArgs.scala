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
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options to be set for the VPC that accepts
    * the peering connection (a maximum of one).
    */
  val accepter: js.UndefOr[Input[PeeringConnectionOptionsAccepter]] = js.native
  /**
    * A optional configuration block that allows for [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options to be set for the VPC that requests
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
  def apply(
    vpcPeeringConnectionId: Input[String],
    accepter: Input[PeeringConnectionOptionsAccepter] = null,
    requester: Input[PeeringConnectionOptionsRequester] = null
  ): PeeringConnectionOptionsArgs = {
    val __obj = js.Dynamic.literal(vpcPeeringConnectionId = vpcPeeringConnectionId.asInstanceOf[js.Any])
    if (accepter != null) __obj.updateDynamic("accepter")(accepter.asInstanceOf[js.Any])
    if (requester != null) __obj.updateDynamic("requester")(requester.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeeringConnectionOptionsArgs]
  }
}

