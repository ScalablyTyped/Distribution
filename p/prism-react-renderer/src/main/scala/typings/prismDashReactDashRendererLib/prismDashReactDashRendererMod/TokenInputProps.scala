package typings
package prismDashReactDashRendererLib.prismDashReactDashRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenInputProps
  extends /* otherProp */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[reactLib.reactMod.Key] = js.undefined
  var style: js.UndefOr[StyleObj] = js.undefined
  var token: Token
}

object TokenInputProps {
  @scala.inline
  def apply(
    token: Token,
    StringDictionary: /* otherProp */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    key: reactLib.reactMod.Key = null,
    style: StyleObj = null
  ): TokenInputProps = {
    val __obj = js.Dynamic.literal(token = token)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TokenInputProps]
  }
}

