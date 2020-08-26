package typings.semanticUiAccordion.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-accordion.SemanticUI.AccordionSettings._Impl, 'exclusive'> */
@js.native
trait PickImplexclusive extends js.Object {
  var exclusive: Boolean = js.native
}

object PickImplexclusive {
  @scala.inline
  def apply(exclusive: Boolean): PickImplexclusive = {
    val __obj = js.Dynamic.literal(exclusive = exclusive.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplexclusive]
  }
  @scala.inline
  implicit class PickImplexclusiveOps[Self <: PickImplexclusive] (val x: Self) extends AnyVal {
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
    def setExclusive(value: Boolean): Self = this.set("exclusive", value.asInstanceOf[js.Any])
  }
  
}

