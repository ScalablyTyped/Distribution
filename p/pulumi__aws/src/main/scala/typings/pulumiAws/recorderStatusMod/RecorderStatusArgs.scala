package typings.pulumiAws.recorderStatusMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecorderStatusArgs extends js.Object {
  /**
    * Whether the configuration recorder should be enabled or disabled.
    */
  val isEnabled: Input[Boolean] = js.native
  /**
    * The name of the recorder
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object RecorderStatusArgs {
  @scala.inline
  def apply(isEnabled: Input[Boolean], name: Input[String] = null): RecorderStatusArgs = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecorderStatusArgs]
  }
}

