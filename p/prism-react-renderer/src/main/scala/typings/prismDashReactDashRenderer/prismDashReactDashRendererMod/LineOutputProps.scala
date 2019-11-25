package typings.prismDashReactDashRenderer.prismDashReactDashRendererMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineOutputProps
  extends /* otherProps */ StringDictionary[js.Any] {
  var className: String
  var key: js.UndefOr[Key] = js.undefined
  var style: js.UndefOr[StyleObj] = js.undefined
}

object LineOutputProps {
  @scala.inline
  def apply(
    className: String,
    StringDictionary: /* otherProps */ StringDictionary[js.Any] = null,
    key: Key = null,
    style: StyleObj = null
  ): LineOutputProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineOutputProps]
  }
}

