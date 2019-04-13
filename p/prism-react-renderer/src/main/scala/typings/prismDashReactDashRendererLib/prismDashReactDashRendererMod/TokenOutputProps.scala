package typings
package prismDashReactDashRendererLib.prismDashReactDashRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenOutputProps
  extends /* otherProp */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var children: java.lang.String
  var className: java.lang.String
  var key: js.UndefOr[reactLib.reactMod.Key] = js.undefined
  var style: js.UndefOr[StyleObj] = js.undefined
}

object TokenOutputProps {
  @scala.inline
  def apply(
    children: java.lang.String,
    className: java.lang.String,
    StringDictionary: /* otherProp */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    key: reactLib.reactMod.Key = null,
    style: StyleObj = null
  ): TokenOutputProps = {
    val __obj = js.Dynamic.literal(children = children, className = className)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TokenOutputProps]
  }
}

