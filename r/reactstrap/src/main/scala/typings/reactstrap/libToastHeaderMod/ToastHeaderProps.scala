package typings.reactstrap.libToastHeaderMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.NativeMouseEvent
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactNode
import typings.react.reactMod.ReactType
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastHeaderProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var charCode: js.UndefOr[String | Double] = js.undefined
  var close: js.UndefOr[ReactNode] = js.undefined
  var closeAriaLabel: js.UndefOr[String] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var icon: js.UndefOr[String | ReactNode] = js.undefined
  var tag: js.UndefOr[String | ReactType[_]] = js.undefined
  var toggle: js.UndefOr[MouseEventHandler[_]] = js.undefined
  var wrapTag: js.UndefOr[String | ReactType[_]] = js.undefined
}

object ToastHeaderProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    charCode: String | Double = null,
    className: String = null,
    close: ReactNode = null,
    closeAriaLabel: String = null,
    cssModule: CSSModule = null,
    icon: String | ReactNode = null,
    tag: String | ReactType[_] = null,
    toggle: MouseEvent[_, NativeMouseEvent] => Unit = null,
    wrapTag: String | ReactType[_] = null
  ): ToastHeaderProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (charCode != null) __obj.updateDynamic("charCode")(charCode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (closeAriaLabel != null) __obj.updateDynamic("closeAriaLabel")(closeAriaLabel)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction1(toggle))
    if (wrapTag != null) __obj.updateDynamic("wrapTag")(wrapTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastHeaderProps]
  }
}

