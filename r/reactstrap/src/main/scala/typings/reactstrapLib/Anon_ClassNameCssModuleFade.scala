package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassNameCssModuleFade extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var fade: js.UndefOr[scala.Boolean] = js.undefined
  var innerRef: js.UndefOr[reactLib.reactMod.ReactNs.Ref[stdLib.HTMLElement]] = js.undefined
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var transition: js.UndefOr[reactstrapLib.libFadeMod.FadeProps[js.Object]] = js.undefined
}

object Anon_ClassNameCssModuleFade {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    fade: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.ReactNs.Ref[stdLib.HTMLElement] = null,
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    tag: reactLib.reactMod.ReactNs.ReactType[_] = null,
    transition: reactstrapLib.libFadeMod.FadeProps[js.Object] = null
  ): Anon_ClassNameCssModuleFade = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(fade)) __obj.updateDynamic("fade")(fade)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition)
    __obj.asInstanceOf[Anon_ClassNameCssModuleFade]
  }
}

