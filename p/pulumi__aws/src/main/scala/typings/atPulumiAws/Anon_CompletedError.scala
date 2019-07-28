package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompletedError extends js.Object {
  var completed: js.UndefOr[Input[String]] = js.undefined
  var error: js.UndefOr[Input[String]] = js.undefined
  var progressing: js.UndefOr[Input[String]] = js.undefined
  var warning: js.UndefOr[Input[String]] = js.undefined
}

object Anon_CompletedError {
  @scala.inline
  def apply(
    completed: Input[String] = null,
    error: Input[String] = null,
    progressing: Input[String] = null,
    warning: Input[String] = null
  ): Anon_CompletedError = {
    val __obj = js.Dynamic.literal()
    if (completed != null) __obj.updateDynamic("completed")(completed.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (progressing != null) __obj.updateDynamic("progressing")(progressing.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CompletedError]
  }
}

