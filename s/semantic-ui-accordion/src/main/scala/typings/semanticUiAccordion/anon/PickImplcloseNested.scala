package typings.semanticUiAccordion.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-accordion.SemanticUI.AccordionSettings._Impl, 'closeNested'> */
@js.native
trait PickImplcloseNested extends js.Object {
  var closeNested: Boolean = js.native
}

object PickImplcloseNested {
  @scala.inline
  def apply(closeNested: Boolean): PickImplcloseNested = {
    val __obj = js.Dynamic.literal(closeNested = closeNested.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcloseNested]
  }
  @scala.inline
  implicit class PickImplcloseNestedOps[Self <: PickImplcloseNested] (val x: Self) extends AnyVal {
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
    def setCloseNested(value: Boolean): Self = this.set("closeNested", value.asInstanceOf[js.Any])
  }
  
}

