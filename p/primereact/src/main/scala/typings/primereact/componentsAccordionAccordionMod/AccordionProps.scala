package typings.primereact.componentsAccordionAccordionMod

import typings.primereact.Anon_Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionProps extends js.Object {
  var activeIndex: js.UndefOr[js.Any] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var onTabChange: js.UndefOr[js.Function1[/* e */ Anon_Index, Unit]] = js.undefined
  var onTabClose: js.UndefOr[js.Function1[/* e */ Anon_Index, Unit]] = js.undefined
  var onTabOpen: js.UndefOr[js.Function1[/* e */ Anon_Index, Unit]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object AccordionProps {
  @scala.inline
  def apply(
    activeIndex: js.Any = null,
    className: String = null,
    id: String = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onTabChange: /* e */ Anon_Index => Unit = null,
    onTabClose: /* e */ Anon_Index => Unit = null,
    onTabOpen: /* e */ Anon_Index => Unit = null,
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

