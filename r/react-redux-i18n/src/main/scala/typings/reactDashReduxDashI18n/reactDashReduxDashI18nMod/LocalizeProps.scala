package typings.reactDashReduxDashI18n.reactDashReduxDashI18nMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizeProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var dangerousHTML: js.UndefOr[Boolean] = js.undefined
  var dateFormat: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[js.Object] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tag: js.UndefOr[ReactType[_]] = js.undefined
  var value: String | Double | js.Object
}

object LocalizeProps {
  @scala.inline
  def apply(
    value: String | Double | js.Object,
    className: String = null,
    dangerousHTML: js.UndefOr[Boolean] = js.undefined,
    dateFormat: String = null,
    options: js.Object = null,
    style: CSSProperties = null,
    tag: ReactType[_] = null
  ): LocalizeProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(dangerousHTML)) __obj.updateDynamic("dangerousHTML")(dangerousHTML)
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    if (options != null) __obj.updateDynamic("options")(options)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizeProps]
  }
}

