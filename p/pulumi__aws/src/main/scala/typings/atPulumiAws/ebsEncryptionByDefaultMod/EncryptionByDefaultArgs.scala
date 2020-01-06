package typings.atPulumiAws.ebsEncryptionByDefaultMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionByDefaultArgs extends js.Object {
  /**
    * Whether or not default EBS encryption is enabled. Valid values are `true` or `false`. Defaults to `true`.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
}

object EncryptionByDefaultArgs {
  @scala.inline
  def apply(enabled: Input[Boolean] = null): EncryptionByDefaultArgs = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionByDefaultArgs]
  }
}

