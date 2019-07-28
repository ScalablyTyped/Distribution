package typings.reactstrap.libTooltipMod

import org.scalablytyped.runtime.StringDictionary
import typings.popperDotJs.popperDotJsMod.Modifiers
import typings.popperDotJs.popperDotJsMod.Placement
import typings.react.reactMod.HTMLAttributes
import typings.reactstrap.Anon_Hide
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UncontrolledTooltipProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var autohide: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var delay: js.UndefOr[Double | Anon_Hide] = js.undefined
  var fade: js.UndefOr[Boolean] = js.undefined
  var flip: js.UndefOr[Boolean] = js.undefined
  var innerClassName: js.UndefOr[String] = js.undefined
  var modifiers: js.UndefOr[Modifiers] = js.undefined
  var placement: js.UndefOr[Placement] = js.undefined
  var target: String | HTMLElement
}

object UncontrolledTooltipProps {
  @scala.inline
  def apply(
    target: String | HTMLElement,
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    autohide: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    container: String | HTMLElement = null,
    cssModule: CSSModule = null,
    delay: Double | Anon_Hide = null,
    fade: js.UndefOr[Boolean] = js.undefined,
    flip: js.UndefOr[Boolean] = js.undefined,
    innerClassName: String = null,
    modifiers: Modifiers = null,
    placement: Placement = null
  ): UncontrolledTooltipProps = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(autohide)) __obj.updateDynamic("autohide")(autohide)
    if (className != null) __obj.updateDynamic("className")(className)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(fade)) __obj.updateDynamic("fade")(fade)
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip)
    if (innerClassName != null) __obj.updateDynamic("innerClassName")(innerClassName)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    __obj.asInstanceOf[UncontrolledTooltipProps]
  }
}

