package typings
package primereactLib.componentsAccordionAccordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionTabProps extends js.Object {
  var contentClassName: js.UndefOr[java.lang.String] = js.undefined
  var contentStyle: js.UndefOr[js.Object] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var header: js.UndefOr[js.Any] = js.undefined
  var headerClassName: js.UndefOr[java.lang.String] = js.undefined
  var headerStyle: js.UndefOr[js.Object] = js.undefined
}

object AccordionTabProps {
  @scala.inline
  def apply(
    contentClassName: java.lang.String = null,
    contentStyle: js.Object = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    header: js.Any = null,
    headerClassName: java.lang.String = null,
    headerStyle: js.Object = null
  ): AccordionTabProps = {
    val __obj = js.Dynamic.literal()
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName)
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (header != null) __obj.updateDynamic("header")(header)
    if (headerClassName != null) __obj.updateDynamic("headerClassName")(headerClassName)
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle)
    __obj.asInstanceOf[AccordionTabProps]
  }
}

