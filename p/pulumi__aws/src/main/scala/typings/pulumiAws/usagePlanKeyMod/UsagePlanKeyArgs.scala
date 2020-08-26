package typings.pulumiAws.usagePlanKeyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsagePlanKeyArgs extends js.Object {
  /**
    * The identifier of the API key resource.
    */
  val keyId: Input[String] = js.native
  /**
    * The type of the API key resource. Currently, the valid key type is API_KEY.
    */
  val keyType: Input[String] = js.native
  /**
    * The Id of the usage plan resource representing to associate the key to.
    */
  val usagePlanId: Input[String] = js.native
}

object UsagePlanKeyArgs {
  @scala.inline
  def apply(keyId: Input[String], keyType: Input[String], usagePlanId: Input[String]): UsagePlanKeyArgs = {
    val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any], keyType = keyType.asInstanceOf[js.Any], usagePlanId = usagePlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsagePlanKeyArgs]
  }
  @scala.inline
  implicit class UsagePlanKeyArgsOps[Self <: UsagePlanKeyArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKeyId(value: Input[String]): Self = this.set("keyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyType(value: Input[String]): Self = this.set("keyType", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsagePlanId(value: Input[String]): Self = this.set("usagePlanId", value.asInstanceOf[js.Any])
  }
  
}

