package typings.atPulumiAws.ec2EipMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EipState extends js.Object {
  val allocationId: js.UndefOr[Input[String]] = js.undefined
  /**
    * A user specified primary or secondary private IP address to
    * associate with the Elastic IP address. If no private IP address is specified,
    * the Elastic IP address is associated with the primary private IP address.
    */
  val associateWithPrivateIp: js.UndefOr[Input[String]] = js.undefined
  val associationId: js.UndefOr[Input[String]] = js.undefined
  val domain: js.UndefOr[Input[String]] = js.undefined
  /**
    * EC2 instance ID.
    */
  val instance: js.UndefOr[Input[String]] = js.undefined
  /**
    * Network interface ID to associate with.
    */
  val networkInterface: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Private DNS associated with the Elastic IP address (if in VPC).
    */
  val privateDns: js.UndefOr[Input[String]] = js.undefined
  /**
    * Contains the private IP address (if in VPC).
    */
  val privateIp: js.UndefOr[Input[String]] = js.undefined
  /**
    * Public DNS associated with the Elastic IP address.
    */
  val publicDns: js.UndefOr[Input[String]] = js.undefined
  /**
    * Contains the public IP address.
    */
  val publicIp: js.UndefOr[Input[String]] = js.undefined
  /**
    * EC2 IPv4 address pool identifier or `amazon`. This option is only available for VPC EIPs.
    */
  val publicIpv4Pool: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * Boolean if the EIP is in a VPC or not.
    */
  val vpc: js.UndefOr[Input[Boolean]] = js.undefined
}

object EipState {
  @scala.inline
  def apply(
    allocationId: Input[String] = null,
    associateWithPrivateIp: Input[String] = null,
    associationId: Input[String] = null,
    domain: Input[String] = null,
    instance: Input[String] = null,
    networkInterface: Input[String] = null,
    privateDns: Input[String] = null,
    privateIp: Input[String] = null,
    publicDns: Input[String] = null,
    publicIp: Input[String] = null,
    publicIpv4Pool: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    vpc: Input[Boolean] = null
  ): EipState = {
    val __obj = js.Dynamic.literal()
    if (allocationId != null) __obj.updateDynamic("allocationId")(allocationId.asInstanceOf[js.Any])
    if (associateWithPrivateIp != null) __obj.updateDynamic("associateWithPrivateIp")(associateWithPrivateIp.asInstanceOf[js.Any])
    if (associationId != null) __obj.updateDynamic("associationId")(associationId.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (networkInterface != null) __obj.updateDynamic("networkInterface")(networkInterface.asInstanceOf[js.Any])
    if (privateDns != null) __obj.updateDynamic("privateDns")(privateDns.asInstanceOf[js.Any])
    if (privateIp != null) __obj.updateDynamic("privateIp")(privateIp.asInstanceOf[js.Any])
    if (publicDns != null) __obj.updateDynamic("publicDns")(publicDns.asInstanceOf[js.Any])
    if (publicIp != null) __obj.updateDynamic("publicIp")(publicIp.asInstanceOf[js.Any])
    if (publicIpv4Pool != null) __obj.updateDynamic("publicIpv4Pool")(publicIpv4Pool.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpc != null) __obj.updateDynamic("vpc")(vpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[EipState]
  }
}

