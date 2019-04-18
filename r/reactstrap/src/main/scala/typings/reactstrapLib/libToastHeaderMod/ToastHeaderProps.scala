package typings
package reactstrapLib.libToastHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastHeaderProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var charCode: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var close: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var closeAriaLabel: js.UndefOr[java.lang.String] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var icon: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNode] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  var toggle: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var wrapTag: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
}

object ToastHeaderProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    charCode: java.lang.String | scala.Double = null,
    className: java.lang.String = null,
    close: reactLib.reactMod.ReactNode = null,
    closeAriaLabel: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    icon: java.lang.String | reactLib.reactMod.ReactNode = null,
    tag: reactLib.reactMod.ReactType[_] = null,
    toggle: () => scala.Unit = null,
    wrapTag: reactLib.reactMod.ReactType[_] = null
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
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction0(toggle))
    if (wrapTag != null) __obj.updateDynamic("wrapTag")(wrapTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastHeaderProps]
  }
}

