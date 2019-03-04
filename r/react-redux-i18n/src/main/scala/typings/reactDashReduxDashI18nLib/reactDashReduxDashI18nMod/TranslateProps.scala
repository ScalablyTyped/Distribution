package typings
package reactDashReduxDashI18nLib.reactDashReduxDashI18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslateProps
  extends /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var dangerousHTML: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var value: java.lang.String
}

object TranslateProps {
  @scala.inline
  def apply(
    value: java.lang.String,
    StringDictionary: /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    dangerousHTML: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    tag: reactLib.reactMod.ReactNs.ReactType[_] = null
  ): TranslateProps = {
    val __obj = js.Dynamic.literal(value = value)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(dangerousHTML)) __obj.updateDynamic("dangerousHTML")(dangerousHTML)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateProps]
  }
}

