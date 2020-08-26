package typings.semanticUiProgress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.ErrorSettings._Impl, 'nonNumeric'> */
@js.native
trait PickImplnonNumeric extends js.Object {
  var nonNumeric: String = js.native
}

object PickImplnonNumeric {
  @scala.inline
  def apply(nonNumeric: String): PickImplnonNumeric = {
    val __obj = js.Dynamic.literal(nonNumeric = nonNumeric.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnonNumeric]
  }
  @scala.inline
  implicit class PickImplnonNumericOps[Self <: PickImplnonNumeric] (val x: Self) extends AnyVal {
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
    def setNonNumeric(value: String): Self = this.set("nonNumeric", value.asInstanceOf[js.Any])
  }
  
}

