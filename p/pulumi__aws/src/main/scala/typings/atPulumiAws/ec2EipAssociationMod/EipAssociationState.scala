package typings.atPulumiAws.ec2EipAssociationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EipAssociationState extends js.Object {
  /**
    * The allocation ID. This is required for EC2-VPC.
    */
  val allocationId: js.UndefOr[Input[String]] = js.native
  /**
    * Whether to allow an Elastic IP to
    * be re-associated. Defaults to `true` in VPC.
    */
  val allowReassociation: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The ID of the instance. This is required for
    * EC2-Classic. For EC2-VPC, you can specify either the instance ID or the
    * network interface ID, but not both. The operation fails if you specify an
    * instance ID unless exactly one network interface is attached.
    */
  val instanceId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the network interface. If the
    * instance has more than one network interface, you must specify a network
    * interface ID.
    */
  val networkInterfaceId: js.UndefOr[Input[String]] = js.native
  /**
    * The primary or secondary private IP address
    * to associate with the Elastic IP address. If no private IP address is
    * specified, the Elastic IP address is associated with the primary private IP
    * address.
    */
  val privateIpAddress: js.UndefOr[Input[String]] = js.native
  /**
    * The Elastic IP address. This is required for EC2-Classic.
    */
  val publicIp: js.UndefOr[Input[String]] = js.native
}

object EipAssociationState {
  @scala.inline
  def apply(
    allocationId: Input[String] = null,
    allowReassociation: Input[Boolean] = null,
    instanceId: Input[String] = null,
    networkInterfaceId: Input[String] = null,
    privateIpAddress: Input[String] = null,
    publicIp: Input[String] = null
  ): EipAssociationState = {
    val __obj = js.Dynamic.literal()
    if (allocationId != null) __obj.updateDynamic("allocationId")(allocationId.asInstanceOf[js.Any])
    if (allowReassociation != null) __obj.updateDynamic("allowReassociation")(allowReassociation.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (networkInterfaceId != null) __obj.updateDynamic("networkInterfaceId")(networkInterfaceId.asInstanceOf[js.Any])
    if (privateIpAddress != null) __obj.updateDynamic("privateIpAddress")(privateIpAddress.asInstanceOf[js.Any])
    if (publicIp != null) __obj.updateDynamic("publicIp")(publicIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[EipAssociationState]
  }
}

