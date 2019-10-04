package typings.atPulumiAws.ec2NetworkInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.ec2Ns.NetworkInterfaceAttachment
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterfaceState extends js.Object {
  /**
    * Block to define the attachment of the ENI. Documented below.
    */
  val attachments: js.UndefOr[Input[js.Array[Input[NetworkInterfaceAttachment]]]] = js.undefined
  /**
    * A description for the network interface.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  val privateDnsName: js.UndefOr[Input[String]] = js.undefined
  val privateIp: js.UndefOr[Input[String]] = js.undefined
  /**
    * List of private IPs to assign to the ENI.
    */
  val privateIps: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Number of secondary private IPs to assign to the ENI. The total number of private IPs will be 1 + private_ips_count, as a primary private IP will be assiged to an ENI by default.
    */
  val privateIpsCount: js.UndefOr[Input[Double]] = js.undefined
  /**
    * List of security group IDs to assign to the ENI.
    */
  val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Whether to enable source destination checking for the ENI. Default true.
    */
  val sourceDestCheck: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Subnet ID to create the ENI in.
    */
  val subnetId: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object NetworkInterfaceState {
  @scala.inline
  def apply(
    attachments: Input[js.Array[Input[NetworkInterfaceAttachment]]] = null,
    description: Input[String] = null,
    privateDnsName: Input[String] = null,
    privateIp: Input[String] = null,
    privateIps: Input[js.Array[Input[String]]] = null,
    privateIpsCount: Input[Double] = null,
    securityGroups: Input[js.Array[Input[String]]] = null,
    sourceDestCheck: Input[Boolean] = null,
    subnetId: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): NetworkInterfaceState = {
    val __obj = js.Dynamic.literal()
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (privateDnsName != null) __obj.updateDynamic("privateDnsName")(privateDnsName.asInstanceOf[js.Any])
    if (privateIp != null) __obj.updateDynamic("privateIp")(privateIp.asInstanceOf[js.Any])
    if (privateIps != null) __obj.updateDynamic("privateIps")(privateIps.asInstanceOf[js.Any])
    if (privateIpsCount != null) __obj.updateDynamic("privateIpsCount")(privateIpsCount.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    if (sourceDestCheck != null) __obj.updateDynamic("sourceDestCheck")(sourceDestCheck.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfaceState]
  }
}

