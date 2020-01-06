package typings.atPulumiAws.cfgRecorderStatusMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecorderStatusState extends js.Object {
  /**
    * Whether the configuration recorder should be enabled or disabled.
    */
  val isEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The name of the recorder
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object RecorderStatusState {
  @scala.inline
  def apply(isEnabled: Input[Boolean] = null, name: Input[String] = null): RecorderStatusState = {
    val __obj = js.Dynamic.literal()
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(isEnabled.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecorderStatusState]
  }
}

