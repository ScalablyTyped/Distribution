package typings.pulumiAws.acceleratorMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.globalaccelerator.AcceleratorAttributes
import typings.pulumiAws.inputMod.globalaccelerator.AcceleratorIpSet
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceleratorState extends js.Object {
  /**
    * The attributes of the accelerator. Fields documented below.
    */
  val attributes: js.UndefOr[Input[AcceleratorAttributes]] = js.native
  /**
    * The DNS name of the accelerator. For example, `a5d53ff5ee6bca4ce.awsglobalaccelerator.com`.
    * * `hostedZoneId` --  The Global Accelerator Route 53 zone ID that can be used to
    * route an [Alias Resource Record Set][1] to the Global Accelerator. This attribute
    * is simply an alias for the zone ID `Z2BJ6XQ5FK7U4H`.
    */
  val dnsName: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates whether the accelerator is enabled. The value is true or false. The default value is true.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  val hostedZoneId: js.UndefOr[Input[String]] = js.native
  /**
    * The value for the address type must be `IPV4`.
    */
  val ipAddressType: js.UndefOr[Input[String]] = js.native
  /**
    * IP address set associated with the accelerator.
    */
  val ipSets: js.UndefOr[Input[js.Array[Input[AcceleratorIpSet]]]] = js.native
  /**
    * The name of the accelerator.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object AcceleratorState {
  @scala.inline
  def apply(
    attributes: Input[AcceleratorAttributes] = null,
    dnsName: Input[String] = null,
    enabled: Input[Boolean] = null,
    hostedZoneId: Input[String] = null,
    ipAddressType: Input[String] = null,
    ipSets: Input[js.Array[Input[AcceleratorIpSet]]] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): AcceleratorState = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (dnsName != null) __obj.updateDynamic("dnsName")(dnsName.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (hostedZoneId != null) __obj.updateDynamic("hostedZoneId")(hostedZoneId.asInstanceOf[js.Any])
    if (ipAddressType != null) __obj.updateDynamic("ipAddressType")(ipAddressType.asInstanceOf[js.Any])
    if (ipSets != null) __obj.updateDynamic("ipSets")(ipSets.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceleratorState]
  }
}

