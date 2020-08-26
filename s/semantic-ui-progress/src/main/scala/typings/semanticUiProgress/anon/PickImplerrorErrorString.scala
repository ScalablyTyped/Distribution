package typings.semanticUiProgress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.ClassNameSettings._Impl, 'error'> */
@js.native
trait PickImplerrorErrorString extends js.Object {
  var error: String = js.native
}

object PickImplerrorErrorString {
  @scala.inline
  def apply(error: String): PickImplerrorErrorString = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplerrorErrorString]
  }
  @scala.inline
  implicit class PickImplerrorErrorStringOps[Self <: PickImplerrorErrorString] (val x: Self) extends AnyVal {
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
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
  }
  
}

