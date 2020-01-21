package typings.pulumiAws.encryptionByDefaultMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionByDefaultState extends js.Object {
  /**
    * Whether or not default EBS encryption is enabled. Valid values are `true` or `false`. Defaults to `true`.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
}

object EncryptionByDefaultState {
  @scala.inline
  def apply(enabled: Input[Boolean] = null): EncryptionByDefaultState = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionByDefaultState]
  }
}

