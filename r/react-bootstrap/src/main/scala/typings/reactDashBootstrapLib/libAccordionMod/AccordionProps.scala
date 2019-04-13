package typings
package reactDashBootstrapLib.libAccordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionProps
  extends reactLib.reactMod.HTMLProps[Accordion] {
  var bsSize: js.UndefOr[reactDashBootstrapLib.reactDashBootstrapMod.Sizes] = js.undefined
  var bsStyle: js.UndefOr[java.lang.String] = js.undefined
  var collapsible: js.UndefOr[scala.Boolean] = js.undefined
  var defaultExpanded: js.UndefOr[scala.Boolean] = js.undefined
  var eventKey: js.UndefOr[js.Any] = js.undefined
  var expanded: js.UndefOr[scala.Boolean] = js.undefined
  var footer: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var header: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object AccordionProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[Accordion] = null,
    bsSize: reactDashBootstrapLib.reactDashBootstrapMod.Sizes = null,
    bsStyle: java.lang.String = null,
    collapsible: js.UndefOr[scala.Boolean] = js.undefined,
    defaultExpanded: js.UndefOr[scala.Boolean] = js.undefined,
    eventKey: js.Any = null,
    expanded: js.UndefOr[scala.Boolean] = js.undefined,
    footer: reactLib.reactMod.ReactNode = null,
    header: reactLib.reactMod.ReactNode = null
  ): AccordionProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
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

