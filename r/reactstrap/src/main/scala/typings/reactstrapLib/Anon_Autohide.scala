package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Autohide extends js.Object {
  var autohide: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var container: js.UndefOr[java.lang.String | reactLib.HTMLElement] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var delay: js.UndefOr[scala.Double | Anon_Hide] = js.undefined
  var innerClassName: js.UndefOr[java.lang.String] = js.undefined
  var modifiers: js.UndefOr[popperDotJsLib.popperDotJsMod.Modifiers] = js.undefined
  var placement: js.UndefOr[popperDotJsLib.popperDotJsMod.Placement] = js.undefined
  var target: java.lang.String | reactLib.HTMLElement
}

object Anon_Autohide {
  @scala.inline
  def apply(
    target: java.lang.String | reactLib.HTMLElement,
    autohide: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    container: java.lang.String | reactLib.HTMLElement = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    delay: scala.Double | Anon_Hide = null,
    innerClassName: java.lang.String = null,
    modifiers: popperDotJsLib.popperDotJsMod.Modifiers = null,
    placement: popperDotJsLib.popperDotJsMod.Placement = null
  ): Anon_Autohide = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (!js.isUndefined(autohide)) __obj.updateDynamic("autohide")(autohide)
    if (className != null) __obj.updateDynamic("className")(className)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (innerClassName != null) __obj.updateDynamic("innerClassName")(innerClassName)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    __obj.asInstanceOf[Anon_Autohide]
  }
}

