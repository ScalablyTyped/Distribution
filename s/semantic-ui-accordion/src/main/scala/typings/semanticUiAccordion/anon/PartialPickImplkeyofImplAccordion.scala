package typings.semanticUiAccordion.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-accordion.SemanticUI.Accordion.SelectorSettings._Impl, keyof semantic-ui-accordion.SemanticUI.Accordion.SelectorSettings._Impl>> */
trait PartialPickImplkeyofImplAccordion extends js.Object {
  var accordion: js.UndefOr[String] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var trigger: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplAccordion {
  @scala.inline
  def apply(accordion: String = null, content: String = null, title: String = null, trigger: String = null): PartialPickImplkeyofImplAccordion = {
    val __obj = js.Dynamic.literal()
    if (accordion != null) __obj.updateDynamic("accordion")(accordion.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplAccordion]
  }
}

