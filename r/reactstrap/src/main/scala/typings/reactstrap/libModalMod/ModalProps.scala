package typings.reactstrap.libModalMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactNode
import typings.reactstrap.libFadeMod.FadeProps
import typings.reactstrap.reactstrapMod.CSSModule
import typings.reactstrap.reactstrapStrings.static
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var backdrop: js.UndefOr[Boolean | static] = js.undefined
  var backdropClassName: js.UndefOr[String] = js.undefined
  var backdropTransition: js.UndefOr[FadeProps] = js.undefined
  var centered: js.UndefOr[Boolean] = js.undefined
  var contentClassName: js.UndefOr[String] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var external: js.UndefOr[ReactNode] = js.undefined
  var fade: js.UndefOr[Boolean] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var labelledBy: js.UndefOr[String] = js.undefined
  var modalClassName: js.UndefOr[String] = js.undefined
  var modalTransition: js.UndefOr[FadeProps] = js.undefined
  var onClosed: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onEnter: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onExit: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOpened: js.UndefOr[js.Function0[Unit]] = js.undefined
  var returnFocusAfterClose: js.UndefOr[Boolean] = js.undefined
  var scrollable: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var toggle: js.UndefOr[js.Function0[Unit]] = js.undefined
  var unmountOnClose: js.UndefOr[Boolean] = js.undefined
  var wrapClassName: js.UndefOr[String] = js.undefined
  var zIndex: js.UndefOr[Double | String] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    backdrop: Boolean | static = null,
    backdropClassName: String = null,
    backdropTransition: FadeProps = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    contentClassName: String = null,
    cssModule: CSSModule = null,
    external: ReactNode = null,
    fade: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    labelledBy: String = null,
    modalClassName: String = null,
    modalTransition: FadeProps = null,
    onClosed: () => Unit = null,
    onEnter: () => Unit = null,
    onExit: () => Unit = null,
    onOpened: () => Unit = null,
    returnFocusAfterClose: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    scrollable: js.UndefOr[Boolean] = js.undefined,
    size: String = null,
    toggle: () => Unit = null,
    unmountOnClose: js.UndefOr[Boolean] = js.undefined,
    wrapClassName: String = null,
    zIndex: Double | String = null
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

