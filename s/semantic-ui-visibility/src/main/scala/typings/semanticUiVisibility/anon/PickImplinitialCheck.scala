package typings.semanticUiVisibility.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'initialCheck'> */
@js.native
trait PickImplinitialCheck extends js.Object {
  var initialCheck: Boolean = js.native
}

object PickImplinitialCheck {
  @scala.inline
  def apply(initialCheck: Boolean): PickImplinitialCheck = {
    val __obj = js.Dynamic.literal(initialCheck = initialCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplinitialCheck]
  }
  @scala.inline
  implicit class PickImplinitialCheckOps[Self <: PickImplinitialCheck] (val x: Self) extends AnyVal {
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
    def setInitialCheck(value: Boolean): Self = this.set("initialCheck", value.asInstanceOf[js.Any])
  }
  
}

