package typings
package reactDashReduxDashI18nLib.reactDashReduxDashI18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizeProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var dangerousHTML: js.UndefOr[scala.Boolean] = js.undefined
  var dateFormat: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[js.Object] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  var value: java.lang.String | scala.Double | js.Object
}

object LocalizeProps {
  @scala.inline
  def apply(
    value: java.lang.String | scala.Double | js.Object,
    className: java.lang.String = null,
    dangerousHTML: js.UndefOr[scala.Boolean] = js.undefined,
    dateFormat: java.lang.String = null,
    options: js.Object = null,
    style: reactLib.reactMod.CSSProperties = null,
    tag: reactLib.reactMod.ReactType[_] = null
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

