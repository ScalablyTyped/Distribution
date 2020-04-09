package typings.pulumiAws.acceleratorMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.globalaccelerator.AcceleratorAttributes
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceleratorArgs extends js.Object {
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
    * The name of the accelerator.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object AcceleratorArgs {
  @scala.inline
  def apply(
    attributes: Input[AcceleratorAttributes] = null,
    enabled: Input[Boolean] = null,
    ipAddressType: Input[String] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): AcceleratorArgs = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (ipAddressType != null) __obj.updateDynamic("ipAddressType")(ipAddressType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceleratorArgs]
  }
}

