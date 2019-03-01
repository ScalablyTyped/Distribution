package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompletedError extends js.Object {
  var completed: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var error: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var progressing: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var warning: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_CompletedError {
  @scala.inline
  def apply(
    completed: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    error: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    progressing: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    warning: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_CompletedError = {
    val __obj = js.Dynamic.literal()
    if (completed != null) __obj.updateDynamic("completed")(completed.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (progressing != null) __obj.updateDynamic("progressing")(progressing.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CompletedError]
  }
}

