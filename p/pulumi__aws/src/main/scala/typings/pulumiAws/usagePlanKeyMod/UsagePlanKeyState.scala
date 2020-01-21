package typings.pulumiAws.usagePlanKeyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsagePlanKeyState extends js.Object {
  /**
    * The identifier of the API key resource.
    */
  val keyId: js.UndefOr[Input[String]] = js.native
  /**
    * The type of the API key resource. Currently, the valid key type is API_KEY.
    */
  val keyType: js.UndefOr[Input[String]] = js.native
  /**
    * The name of a usage plan key.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The Id of the usage plan resource representing to associate the key to.
    */
  val usagePlanId: js.UndefOr[Input[String]] = js.native
  /**
    * The value of a usage plan key.
    */
  val value: js.UndefOr[Input[String]] = js.native
}

object UsagePlanKeyState {
  @scala.inline
  def apply(
    keyId: Input[String] = null,
    keyType: Input[String] = null,
    name: Input[String] = null,
    usagePlanId: Input[String] = null,
    value: Input[String] = null
  ): UsagePlanKeyState = {
    val __obj = js.Dynamic.literal()
    if (keyId != null) __obj.updateDynamic("keyId")(keyId.asInstanceOf[js.Any])
    if (keyType != null) __obj.updateDynamic("keyType")(keyType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (usagePlanId != null) __obj.updateDynamic("usagePlanId")(usagePlanId.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsagePlanKeyState]
  }
}

