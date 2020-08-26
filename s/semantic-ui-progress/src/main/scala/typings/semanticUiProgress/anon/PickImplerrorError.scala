package typings.semanticUiProgress.anon

import typings.semanticUiProgress.semanticUiProgressBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.TextSettings._Impl, 'error'> */
@js.native
trait PickImplerrorError extends js.Object {
  var error: `false` | String = js.native
}

object PickImplerrorError {
  @scala.inline
  def apply(error: `false` | String): PickImplerrorError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplerrorError]
  }
  @scala.inline
  implicit class PickImplerrorErrorOps[Self <: PickImplerrorError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setError(value: `false` | String): Self = this.set("error", value.asInstanceOf[js.Any])
  }
  
}

