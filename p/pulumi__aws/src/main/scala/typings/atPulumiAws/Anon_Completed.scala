package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Completed extends js.Object {
  var completed: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var progressing: js.UndefOr[String] = js.undefined
  var warning: js.UndefOr[String] = js.undefined
}

object Anon_Completed {
  @scala.inline
  def apply(completed: String = null, error: String = null, progressing: String = null, warning: String = null): Anon_Completed = {
    val __obj = js.Dynamic.literal()
    if (completed != null) __obj.updateDynamic("completed")(completed)
    if (error != null) __obj.updateDynamic("error")(error)
    if (progressing != null) __obj.updateDynamic("progressing")(progressing)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[Anon_Completed]
  }
}

