package typings.semanticUiAccordion.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-accordion.SemanticUI.AccordionSettings._Impl, 'animateChildren'> */
@js.native
trait PickImplanimateChildren extends js.Object {
  var animateChildren: Boolean = js.native
}

object PickImplanimateChildren {
  @scala.inline
  def apply(animateChildren: Boolean): PickImplanimateChildren = {
    val __obj = js.Dynamic.literal(animateChildren = animateChildren.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplanimateChildren]
  }
  @scala.inline
  implicit class PickImplanimateChildrenOps[Self <: PickImplanimateChildren] (val x: Self) extends AnyVal {
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
    def setAnimateChildren(value: Boolean): Self = this.set("animateChildren", value.asInstanceOf[js.Any])
  }
  
}

