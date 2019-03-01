package typings
package atPulumiAwsLib.ec2EipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EipState extends js.Object {
  val allocationId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A user specified primary or secondary private IP address to
    * associate with the Elastic IP address. If no private IP address is specified,
    * the Elastic IP address is associated with the primary private IP address.
    */
  val associateWithPrivateIp: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val associationId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val domain: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * EC2 instance ID.
    */
  val instance: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Network interface ID to associate with.
    */
  val networkInterface: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Contains the private IP address (if in VPC).
    */
  val privateIp: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Contains the public IP address.
    */
  val publicIp: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * EC2 IPv4 address pool identifier or `amazon`. This option is only available for VPC EIPs.
    */
  val publicIpv4Pool: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * Boolean if the EIP is in a VPC or not.
    */
  val vpc: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object EipState {
  @scala.inline
  def apply(
    allocationId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    associateWithPrivateIp: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    associationId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    domain: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    instance: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    networkInterface: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    privateIp: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    publicIp: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    publicIpv4Pool: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    vpc: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): EipState = {
    val __obj = js.Dynamic.literal()
    if (allocationId != null) __obj.updateDynamic("allocationId")(allocationId.asInstanceOf[js.Any])
    if (associateWithPrivateIp != null) __obj.updateDynamic("associateWithPrivateIp")(associateWithPrivateIp.asInstanceOf[js.Any])
    if (associationId != null) __obj.updateDynamic("associationId")(associationId.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (networkInterface != null) __obj.updateDynamic("networkInterface")(networkInterface.asInstanceOf[js.Any])
    if (privateIp != null) __obj.updateDynamic("privateIp")(privateIp.asInstanceOf[js.Any])
    if (publicIp != null) __obj.updateDynamic("publicIp")(publicIp.asInstanceOf[js.Any])
    if (publicIpv4Pool != null) __obj.updateDynamic("publicIpv4Pool")(publicIpv4Pool.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpc != null) __obj.updateDynamic("vpc")(vpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[EipState]
  }
}

