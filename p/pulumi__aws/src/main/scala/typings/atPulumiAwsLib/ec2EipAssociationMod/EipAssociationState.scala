package typings
package atPulumiAwsLib.ec2EipAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EipAssociationState extends js.Object {
  /**
    * The allocation ID. This is required for EC2-VPC.
    */
  val allocationId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Whether to allow an Elastic IP to
    * be re-associated. Defaults to `true` in VPC.
    */
  val allowReassociation: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The ID of the instance. This is required for
    * EC2-Classic. For EC2-VPC, you can specify either the instance ID or the
    * network interface ID, but not both. The operation fails if you specify an
    * instance ID unless exactly one network interface is attached.
    */
  val instanceId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the network interface. If the
    * instance has more than one network interface, you must specify a network
    * interface ID.
    */
  val networkInterfaceId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The primary or secondary private IP address
    * to associate with the Elastic IP address. If no private IP address is
    * specified, the Elastic IP address is associated with the primary private IP
    * address.
    */
  val privateIpAddress: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The Elastic IP address. This is required for EC2-Classic.
    */
  val publicIp: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

