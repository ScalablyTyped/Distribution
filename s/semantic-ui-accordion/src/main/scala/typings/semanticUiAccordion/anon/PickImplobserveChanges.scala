package typings.semanticUiAccordion.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-accordion.SemanticUI.AccordionSettings._Impl, 'observeChanges'> */
@js.native
trait PickImplobserveChanges extends js.Object {
  var observeChanges: Boolean = js.native
}

object PickImplobserveChanges {
  @scala.inline
  def apply(observeChanges: Boolean): PickImplobserveChanges = {
    val __obj = js.Dynamic.literal(observeChanges = observeChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplobserveChanges]
  }
  @scala.inline
  implicit class PickImplobserveChangesOps[Self <: PickImplobserveChanges] (val x: Self) extends AnyVal {
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
    def setObserveChanges(value: Boolean): Self = this.set("observeChanges", value.asInstanceOf[js.Any])
  }
  
}

