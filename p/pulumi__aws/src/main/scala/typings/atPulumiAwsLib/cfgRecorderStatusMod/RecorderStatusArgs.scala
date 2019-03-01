package typings
package atPulumiAwsLib.cfgRecorderStatusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecorderStatusArgs extends js.Object {
  /**
    * Whether the configuration recorder should be enabled or disabled.
    */
  val isEnabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean]
  /**
    * The name of the recorder
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object RecorderStatusArgs {
  @scala.inline
  def apply(
    isEnabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): RecorderStatusArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isEnabled")(isEnabled.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecorderStatusArgs]
  }
}

