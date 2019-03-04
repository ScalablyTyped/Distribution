package typings
package reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var emptyLabel: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var innerRef: js.UndefOr[reactLib.reactMod.ReactNs.LegacyRef[reactLib.HTMLUListElement]] = js.undefined
  var maxHeight: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(
    id: java.lang.String,
    className: java.lang.String = null,
    emptyLabel: java.lang.String = null,
    innerRef: reactLib.reactMod.ReactNs.LegacyRef[reactLib.HTMLUListElement] = null,
    maxHeight: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    text: java.lang.String = null
  ): MenuProps = {
    val __obj = js.Dynamic.literal(id = id)
    if (className != null) __obj.updateDynamic("className")(className)
    if (emptyLabel != null) __obj.updateDynamic("emptyLabel")(emptyLabel)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight)
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[MenuProps]
  }
}

