package typings.semanticUiAccordion.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-accordion.SemanticUI.AccordionSettings._Impl, 'easing'> */
@js.native
trait PickImpleasing extends js.Object {
  var easing: String = js.native
}

object PickImpleasing {
  @scala.inline
  def apply(easing: String): PickImpleasing = {
    val __obj = js.Dynamic.literal(easing = easing.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpleasing]
  }
  @scala.inline
  implicit class PickImpleasingOps[Self <: PickImpleasing] (val x: Self) extends AnyVal {
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
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
  }
  
}

