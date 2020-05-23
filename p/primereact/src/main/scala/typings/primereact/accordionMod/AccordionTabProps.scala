package typings.primereact.accordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionTabProps extends js.Object {
  var contentClassName: js.UndefOr[String] = js.undefined
  var contentStyle: js.UndefOr[js.Object] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var header: js.UndefOr[js.Any] = js.undefined
  var headerClassName: js.UndefOr[String] = js.undefined
  var headerStyle: js.UndefOr[js.Object] = js.undefined
}

object AccordionTabProps {
  @scala.inline
  def apply(
    contentClassName: String = null,
    contentStyle: js.Object = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    header: js.Any = null,
    headerClassName: String = null,
    headerStyle: js.Object = null
  ): AccordionTabProps = {
    val __obj = js.Dynamic.literal()
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headerClassName != null) __obj.updateDynamic("headerClassName")(headerClassName.asInstanceOf[js.Any])
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionTabProps]
  }
}

