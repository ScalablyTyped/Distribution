package typings
package primereactLib.componentsAccordionAccordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionProps extends js.Object {
  var activeIndex: js.UndefOr[js.Any] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  var onTabChange: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_Index, scala.Unit]] = js.undefined
  var onTabClose: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_Index, scala.Unit]] = js.undefined
  var onTabOpen: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_Index, scala.Unit]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object AccordionProps {
  @scala.inline
  def apply(
    activeIndex: js.Any = null,
    className: java.lang.String = null,
    id: java.lang.String = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    onTabChange: /* e */ primereactLib.Anon_Index => scala.Unit = null,
    onTabClose: /* e */ primereactLib.Anon_Index => scala.Unit = null,
    onTabOpen: /* e */ primereactLib.Anon_Index => scala.Unit = null,
    style: js.Object = null
  ): AccordionProps = {
    val __obj = js.Dynamic.literal()
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex)
    if (className != null) __obj.updateDynamic("className")(className)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(js.Any.fromFunction1(onTabChange))
    if (onTabClose != null) __obj.updateDynamic("onTabClose")(js.Any.fromFunction1(onTabClose))
    if (onTabOpen != null) __obj.updateDynamic("onTabOpen")(js.Any.fromFunction1(onTabOpen))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[AccordionProps]
  }
}

