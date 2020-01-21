package typings.prismReactRenderer.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenInputProps
  extends /* otherProp */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var style: js.UndefOr[StyleObj] = js.undefined
  var token: Token
}

object TokenInputProps {
  @scala.inline
  def apply(
    token: Token,
    StringDictionary: /* otherProp */ StringDictionary[js.Any] = null,
    className: String = null,
    key: Key = null,
    style: StyleObj = null
  ): TokenInputProps = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenInputProps]
  }
}

