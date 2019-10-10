package typings.reactstrap.libModalHeaderMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.NativeMouseEvent
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactType
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalHeaderProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var tag: js.UndefOr[String | ReactType[_]] = js.undefined
  var toggle: js.UndefOr[MouseEventHandler[_]] = js.undefined
  var wrapTag: js.UndefOr[String | ReactType[_]] = js.undefined
}

object ModalHeaderProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    className: String = null,
    cssModule: CSSModule = null,
    tag: String | ReactType[_] = null,
    toggle: MouseEvent[_, NativeMouseEvent] => Unit = null,
    wrapTag: String | ReactType[_] = null
  ): ModalHeaderProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction1(toggle))
    if (wrapTag != null) __obj.updateDynamic("wrapTag")(wrapTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalHeaderProps]
  }
}

