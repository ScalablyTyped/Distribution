package typings.reactstrap.libToastMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactType
import typings.react.reactMod.Ref
import typings.reactstrap.libFadeMod.FadeProps
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var fade: js.UndefOr[Boolean] = js.undefined
  var innerRef: js.UndefOr[Ref[HTMLElement]] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var tag: js.UndefOr[String | ReactType[_]] = js.undefined
  var transition: js.UndefOr[FadeProps] = js.undefined
}

object ToastProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    className: String = null,
    cssModule: CSSModule = null,
    fade: js.UndefOr[Boolean] = js.undefined,
    innerRef: Ref[HTMLElement] = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    tag: String | ReactType[_] = null,
    transition: FadeProps = null
  ): ToastProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(fade)) __obj.updateDynamic("fade")(fade)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition)
    __obj.asInstanceOf[ToastProps]
  }
}

