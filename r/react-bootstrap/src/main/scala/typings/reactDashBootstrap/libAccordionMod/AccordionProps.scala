package typings.reactDashBootstrap.libAccordionMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.ReactNode
import typings.reactDashBootstrap.reactDashBootstrapMod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionProps
  extends AllHTMLAttributes[Accordion]
     with ClassAttributes[Accordion] {
  var bsSize: js.UndefOr[Sizes] = js.undefined
  var bsStyle: js.UndefOr[String] = js.undefined
  var collapsible: js.UndefOr[Boolean] = js.undefined
  var defaultExpanded: js.UndefOr[Boolean] = js.undefined
  var eventKey: js.UndefOr[js.Any] = js.undefined
  var expanded: js.UndefOr[Boolean] = js.undefined
  var footer: js.UndefOr[ReactNode] = js.undefined
  var header: js.UndefOr[ReactNode] = js.undefined
}

object AccordionProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Accordion] = null,
    ClassAttributes: ClassAttributes[Accordion] = null,
    bsSize: Sizes = null,
    bsStyle: String = null,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    defaultExpanded: js.UndefOr[Boolean] = js.undefined,
    eventKey: js.Any = null,
    expanded: js.UndefOr[Boolean] = js.undefined,
    footer: ReactNode = null,
    header: ReactNode = null
  ): AccordionProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle)
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    if (!js.isUndefined(defaultExpanded)) __obj.updateDynamic("defaultExpanded")(defaultExpanded)
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey)
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionProps]
  }
}

