package typings
package reactstrapLib.libSpinnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerProps
  extends reactLib.reactMod.HTMLProps[stdLib.HTMLElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  @JSName("size")
  var size_SpinnerProps: js.UndefOr[js.Any] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
}

object SpinnerProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[stdLib.HTMLElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    color: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    size: js.Any = null,
    tag: reactLib.reactMod.ReactType[_] = null,
    `type`: java.lang.String = null
  ): SpinnerProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (size != null) __obj.updateDynamic("size")(size)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SpinnerProps]
  }
}

