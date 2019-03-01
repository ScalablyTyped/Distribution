package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Completed extends js.Object {
  var completed: js.UndefOr[java.lang.String] = js.undefined
  var error: js.UndefOr[java.lang.String] = js.undefined
  var progressing: js.UndefOr[java.lang.String] = js.undefined
  var warning: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Completed {
  @scala.inline
  def apply(
    completed: java.lang.String = null,
    error: java.lang.String = null,
    progressing: java.lang.String = null,
    warning: java.lang.String = null
  ): Anon_Completed = {
    val __obj = js.Dynamic.literal()
    if (completed != null) __obj.updateDynamic("completed")(completed)
    if (error != null) __obj.updateDynamic("error")(error)
    if (progressing != null) __obj.updateDynamic("progressing")(progressing)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[Anon_Completed]
  }
}

