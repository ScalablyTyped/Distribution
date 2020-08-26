package typings.semanticUiAccordion.SemanticUI.Accordion.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-accordion.SemanticUI.Accordion.ErrorSettings._Impl, 'method'> & std.Partial<std.Pick<semantic-ui-accordion.SemanticUI.Accordion.ErrorSettings._Impl, keyof semantic-ui-accordion.SemanticUI.Accordion.ErrorSettings._Impl>> */
@js.native
trait Param extends js.Object {
  var method: String with js.UndefOr[String] = js.native
}

object Param {
  @scala.inline
  def apply(method: String with js.UndefOr[String]): Param = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Param]
  }
  @scala.inline
  implicit class ParamOps[Self <: Param] (val x: Self) extends AnyVal {
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
    def setMethod(value: String with js.UndefOr[String]): Self = this.set("method", value.asInstanceOf[js.Any])
  }
  
}

