package typings.semanticUiAccordion.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-accordion.SemanticUI.Accordion.SelectorSettings._Impl, 'accordion'> */
@js.native
trait PickImplaccordion extends js.Object {
  var accordion: String = js.native
}

object PickImplaccordion {
  @scala.inline
  def apply(accordion: String): PickImplaccordion = {
    val __obj = js.Dynamic.literal(accordion = accordion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplaccordion]
  }
  @scala.inline
  implicit class PickImplaccordionOps[Self <: PickImplaccordion] (val x: Self) extends AnyVal {
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
    def setAccordion(value: String): Self = this.set("accordion", value.asInstanceOf[js.Any])
  }
  
}

