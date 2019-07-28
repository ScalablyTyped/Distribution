package typings.prismDashReactDashRenderer.prismDashReactDashRendererMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenOutputProps
  extends /* otherProp */ StringDictionary[js.Any] {
  var children: String
  var className: String
  var key: js.UndefOr[Key] = js.undefined
  var style: js.UndefOr[StyleObj] = js.undefined
}

object TokenOutputProps {
  @scala.inline
  def apply(
    children: String,
    className: String,
    StringDictionary: /* otherProp */ StringDictionary[js.Any] = null,
    key: Key = null,
    style: StyleObj = null
  ): TokenOutputProps = {
    val __obj = js.Dynamic.literal(children = children, className = className)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TokenOutputProps]
  }
}

