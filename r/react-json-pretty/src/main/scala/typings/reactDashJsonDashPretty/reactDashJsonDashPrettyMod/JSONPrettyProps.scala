package typings.reactDashJsonDashPretty.reactDashJsonDashPrettyMod

import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLPreElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONPrettyProps extends HTMLAttributes[HTMLPreElement] {
  var json: js.Any
  var replacer: js.UndefOr[js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _]] = js.undefined
  var space: js.UndefOr[Double] = js.undefined
  var themeClassName: js.UndefOr[String] = js.undefined
}

object JSONPrettyProps {
  @scala.inline
  def apply(
    json: js.Any,
    HTMLAttributes: HTMLAttributes[HTMLPreElement] = null,
    replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _] = null,
    space: Int | Double = null,
    themeClassName: String = null
  ): JSONPrettyProps = {
    val __obj = js.Dynamic.literal(json = json)
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (replacer != null) __obj.updateDynamic("replacer")(replacer)
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    if (themeClassName != null) __obj.updateDynamic("themeClassName")(themeClassName)
    __obj.asInstanceOf[JSONPrettyProps]
  }
}

