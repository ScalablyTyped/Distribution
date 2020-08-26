package typings.semanticUiTransition.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.Transition.ClassNameSettings._Impl, 'outward'> */
@js.native
trait PickImploutward extends js.Object {
  var outward: String = js.native
}

object PickImploutward {
  @scala.inline
  def apply(outward: String): PickImploutward = {
    val __obj = js.Dynamic.literal(outward = outward.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImploutward]
  }
  @scala.inline
  implicit class PickImploutwardOps[Self <: PickImploutward] (val x: Self) extends AnyVal {
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
    def setOutward(value: String): Self = this.set("outward", value.asInstanceOf[js.Any])
  }
  
}

