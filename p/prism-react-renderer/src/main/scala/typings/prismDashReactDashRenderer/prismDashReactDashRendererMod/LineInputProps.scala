package typings.prismDashReactDashRenderer.prismDashReactDashRendererMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineInputProps
  extends /* otherProp */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var line: js.Array[Token]
  var style: js.UndefOr[StyleObj] = js.undefined
}

object LineInputProps {
  @scala.inline
  def apply(
    line: js.Array[Token],
    StringDictionary: /* otherProp */ StringDictionary[js.Any] = null,
    className: String = null,
    key: Key = null,
    style: StyleObj = null
  ): LineInputProps = {
    val __obj = js.Dynamic.literal(line = line)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[LineInputProps]
  }
}

