package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoFocus extends js.Object {
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var backdrop: js.UndefOr[scala.Boolean | reactstrapLib.reactstrapLibStrings.static] = js.undefined
  var backdropClassName: js.UndefOr[java.lang.String] = js.undefined
  var backdropTransition: js.UndefOr[reactstrapLib.libFadeMod.FadeProps[js.Object]] = js.undefined
  var centered: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var contentClassName: js.UndefOr[java.lang.String] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var external: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var fade: js.UndefOr[scala.Boolean] = js.undefined
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  var labelledBy: js.UndefOr[java.lang.String] = js.undefined
  var modalClassName: js.UndefOr[java.lang.String] = js.undefined
  var modalTransition: js.UndefOr[reactstrapLib.libFadeMod.FadeProps[js.Object]] = js.undefined
  var onClosed: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onEnter: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onExit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onOpened: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var toggle: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var wrapClassName: js.UndefOr[java.lang.String] = js.undefined
  var zIndex: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object Anon_AutoFocus {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    backdrop: scala.Boolean | reactstrapLib.reactstrapLibStrings.static = null,
    backdropClassName: java.lang.String = null,
    backdropTransition: reactstrapLib.libFadeMod.FadeProps[js.Object] = null,
    centered: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    contentClassName: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    external: reactLib.reactMod.ReactNs.ReactNode = null,
    fade: js.UndefOr[scala.Boolean] = js.undefined,
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    keyboard: js.UndefOr[scala.Boolean] = js.undefined,
    labelledBy: java.lang.String = null,
    modalClassName: java.lang.String = null,
    modalTransition: reactstrapLib.libFadeMod.FadeProps[js.Object] = null,
    onClosed: js.Function0[scala.Unit] = null,
    onEnter: js.Function0[scala.Unit] = null,
    onExit: js.Function0[scala.Unit] = null,
    onOpened: js.Function0[scala.Unit] = null,
    role: java.lang.String = null,
    size: java.lang.String = null,
    toggle: js.Function0[scala.Unit] = null,
    wrapClassName: java.lang.String = null,
    zIndex: scala.Double | java.lang.String = null
  ): Anon_AutoFocus = {
    val __obj = js.Dynamic.literal()
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
    if (onClosed != null) __obj.updateDynamic("onClosed")(onClosed)
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter)
    if (onExit != null) __obj.updateDynamic("onExit")(onExit)
    if (onOpened != null) __obj.updateDynamic("onOpened")(onOpened)
    if (role != null) __obj.updateDynamic("role")(role)
    if (size != null) __obj.updateDynamic("size")(size)
    if (toggle != null) __obj.updateDynamic("toggle")(toggle)
    if (wrapClassName != null) __obj.updateDynamic("wrapClassName")(wrapClassName)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoFocus]
  }
}

