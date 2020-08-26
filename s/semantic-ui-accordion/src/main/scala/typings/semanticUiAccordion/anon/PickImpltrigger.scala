package typings.semanticUiAccordion.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-accordion.SemanticUI.Accordion.SelectorSettings._Impl, 'trigger'> */
@js.native
trait PickImpltrigger extends js.Object {
  var trigger: String = js.native
}

object PickImpltrigger {
  @scala.inline
  def apply(trigger: String): PickImpltrigger = {
    val __obj = js.Dynamic.literal(trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltrigger]
  }
  @scala.inline
  implicit class PickImpltriggerOps[Self <: PickImpltrigger] (val x: Self) extends AnyVal {
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
    def setTrigger(value: String): Self = this.set("trigger", value.asInstanceOf[js.Any])
  }
  
}

