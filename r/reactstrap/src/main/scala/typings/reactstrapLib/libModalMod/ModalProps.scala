package typings
package reactstrapLib.libModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var backdrop: js.UndefOr[scala.Boolean | reactstrapLib.reactstrapLibStrings.static] = js.undefined
  var backdropClassName: js.UndefOr[java.lang.String] = js.undefined
  var backdropTransition: js.UndefOr[reactstrapLib.libFadeMod.FadeProps] = js.undefined
  var centered: js.UndefOr[scala.Boolean] = js.undefined
  var contentClassName: js.UndefOr[java.lang.String] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var external: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var fade: js.UndefOr[scala.Boolean] = js.undefined
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  var labelledBy: js.UndefOr[java.lang.String] = js.undefined
  var modalClassName: js.UndefOr[java.lang.String] = js.undefined
  var modalTransition: js.UndefOr[reactstrapLib.libFadeMod.FadeProps] = js.undefined
  var onClosed: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onEnter: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onExit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onOpened: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var returnFocusAfterClose: js.UndefOr[scala.Boolean] = js.undefined
  var scrollable: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var toggle: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var unmountOnClose: js.UndefOr[scala.Boolean] = js.undefined
  var wrapClassName: js.UndefOr[java.lang.String] = js.undefined
  var zIndex: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    backdrop: scala.Boolean | reactstrapLib.reactstrapLibStrings.static = null,
    backdropClassName: java.lang.String = null,
    backdropTransition: reactstrapLib.libFadeMod.FadeProps = null,
    centered: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    contentClassName: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    external: reactLib.reactMod.ReactNode = null,
    fade: js.UndefOr[scala.Boolean] = js.undefined,
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    keyboard: js.UndefOr[scala.Boolean] = js.undefined,
    labelledBy: java.lang.String = null,
    modalClassName: java.lang.String = null,
    modalTransition: reactstrapLib.libFadeMod.FadeProps = null,
    onClosed: () => scala.Unit = null,
    onEnter: () => scala.Unit = null,
    onExit: () => scala.Unit = null,
    onOpened: () => scala.Unit = null,
    returnFocusAfterClose: js.UndefOr[scala.Boolean] = js.undefined,
    role: java.lang.String = null,
    scrollable: js.UndefOr[scala.Boolean] = js.undefined,
    size: java.lang.String = null,
    toggle: () => scala.Unit = null,
    unmountOnClose: js.UndefOr[scala.Boolean] = js.undefined,
    wrapClassName: java.lang.String = null,
    zIndex: scala.Double | java.lang.String = null
  ): ModalProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (backdrop != null) __obj.updateDynamic("backdrop")(backdrop.asInstanceOf[js.Any])
    if (backdropClassName != null) __obj.updateDynamic("backdropClassName")(backdropClassName)
    if (backdropTransition != null) __obj.updateDynamic("backdropTransition")(backdropTransition)
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (className != null) __obj.updateDynamic("className")(className)
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (external != null) __obj.updateDynamic("external")(external.asInstanceOf[js.Any])
    if (!js.isUndefined(fade)) __obj.updateDynamic("fade")(fade)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (labelledBy != null) __obj.updateDynamic("labelledBy")(labelledBy)
    if (modalClassName != null) __obj.updateDynamic("modalClassName")(modalClassName)
    if (modalTransition != null) __obj.updateDynamic("modalTransition")(modalTransition)
    if (onClosed != null) __obj.updateDynamic("onClosed")(js.Any.fromFunction0(onClosed))
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction0(onEnter))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction0(onExit))
    if (onOpened != null) __obj.updateDynamic("onOpened")(js.Any.fromFunction0(onOpened))
    if (!js.isUndefined(returnFocusAfterClose)) __obj.updateDynamic("returnFocusAfterClose")(returnFocusAfterClose)
    if (role != null) __obj.updateDynamic("role")(role)
    if (!js.isUndefined(scrollable)) __obj.updateDynamic("scrollable")(scrollable)
    if (size != null) __obj.updateDynamic("size")(size)
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction0(toggle))
    if (!js.isUndefined(unmountOnClose)) __obj.updateDynamic("unmountOnClose")(unmountOnClose)
    if (wrapClassName != null) __obj.updateDynamic("wrapClassName")(wrapClassName)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProps]
  }
}

