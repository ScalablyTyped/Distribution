package typings
package prismDashReactDashRendererLib.prismDashReactDashRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineOutputProps
  extends /* otherProps */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var className: java.lang.String
  var key: js.UndefOr[reactLib.reactMod.Key] = js.undefined
  var style: js.UndefOr[StyleObj] = js.undefined
}

object LineOutputProps {
  @scala.inline
  def apply(
    className: java.lang.String,
    StringDictionary: /* otherProps */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    key: reactLib.reactMod.Key = null,
    style: StyleObj = null
  ): LineOutputProps = {
    val __obj = js.Dynamic.literal(className = className)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[LineOutputProps]
  }
}

