package typings.reactNativeElements.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconObject extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var `type`: js.UndefOr[IconType] = js.undefined
}

object IconObject {
  @scala.inline
  def apply(
    color: String = null,
    name: String = null,
    size: js.UndefOr[Double] = js.undefined,
    style: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    `type`: IconType = null
  ): IconObject = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconObject]
  }
}

