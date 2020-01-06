package typings.atPulumiAws.globalacceleratorAcceleratorMod

import typings.atPulumiAws.typesInputMod.globalaccelerator.AcceleratorAttributes
import typings.atPulumiAws.typesInputMod.globalaccelerator.AcceleratorIpSet
import typings.atPulumiPulumi.outputMod.Input
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
    * Indicates whether the accelerator is enabled. The value is true or false. The default value is true.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
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
}

object AcceleratorState {
  @scala.inline
  def apply(
    attributes: Input[AcceleratorAttributes] = null,
    enabled: Input[Boolean] = null,
    ipAddressType: Input[String] = null,
    ipSets: Input[js.Array[Input[AcceleratorIpSet]]] = null,
    name: Input[String] = null
  ): AcceleratorState = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (ipAddressType != null) __obj.updateDynamic("ipAddressType")(ipAddressType.asInstanceOf[js.Any])
    if (ipSets != null) __obj.updateDynamic("ipSets")(ipSets.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceleratorState]
  }
}

