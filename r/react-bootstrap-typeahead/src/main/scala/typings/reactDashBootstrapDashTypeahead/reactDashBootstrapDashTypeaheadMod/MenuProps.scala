package typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.LegacyRef
import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var emptyLabel: js.UndefOr[String] = js.undefined
  var id: String
  var innerRef: js.UndefOr[LegacyRef[HTMLUListElement]] = js.undefined
  var maxHeight: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(
    id: String,
    className: String = null,
    emptyLabel: String = null,
    innerRef: LegacyRef[HTMLUListElement] = null,
    maxHeight: String = null,
    style: CSSProperties = null,
    text: String = null
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

