package typings
package reactstrapLib.libAlertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UncontrolledAlertProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  var transition: js.UndefOr[reactstrapLib.libFadeMod.FadeProps] = js.undefined
}

object UncontrolledAlertProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    color: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    tag: reactLib.reactMod.ReactType[_] = null,
    transition: reactstrapLib.libFadeMod.FadeProps = null
  ): UncontrolledAlertProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition)
    __obj.asInstanceOf[UncontrolledAlertProps]
  }
}

