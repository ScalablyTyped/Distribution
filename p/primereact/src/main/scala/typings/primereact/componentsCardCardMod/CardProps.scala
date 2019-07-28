package typings.primereact.componentsCardCardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var footer: js.UndefOr[js.Any] = js.undefined
  var header: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var subTitle: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object CardProps {
  @scala.inline
  def apply(
    className: String = null,
    footer: js.Any = null,
    header: js.Any = null,
    id: String = null,
    style: js.Object = null,
    subTitle: String = null,
    title: String = null
  ): CardProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (header != null) __obj.updateDynamic("header")(header)
    if (id != null) __obj.updateDynamic("id")(id)
    if (style != null) __obj.updateDynamic("style")(style)
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[CardProps]
  }
}

