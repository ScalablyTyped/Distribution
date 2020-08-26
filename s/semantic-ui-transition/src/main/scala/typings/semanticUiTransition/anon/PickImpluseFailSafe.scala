package typings.semanticUiTransition.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.TransitionSettings._Impl, 'useFailSafe'> */
@js.native
trait PickImpluseFailSafe extends js.Object {
  var useFailSafe: Boolean = js.native
}

object PickImpluseFailSafe {
  @scala.inline
  def apply(useFailSafe: Boolean): PickImpluseFailSafe = {
    val __obj = js.Dynamic.literal(useFailSafe = useFailSafe.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpluseFailSafe]
  }
  @scala.inline
  implicit class PickImpluseFailSafeOps[Self <: PickImpluseFailSafe] (val x: Self) extends AnyVal {
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
    def setUseFailSafe(value: Boolean): Self = this.set("useFailSafe", value.asInstanceOf[js.Any])
  }
  
}

