package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledKmsKeyIdBoolean extends js.Object {
  var enabled: Input[Boolean]
  var kmsKeyId: js.UndefOr[Input[String]] = js.undefined
}

object Anon_EnabledKmsKeyIdBoolean {
  @scala.inline
  def apply(enabled: Input[Boolean], kmsKeyId: Input[String] = null): Anon_EnabledKmsKeyIdBoolean = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EnabledKmsKeyIdBoolean]
  }
}

