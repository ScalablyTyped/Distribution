package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassNames extends js.Object {
  var classNames: js.UndefOr[java.lang.String] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var delay: js.UndefOr[Anon_Hide] = js.undefined
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  var navbar: js.UndefOr[scala.Boolean] = js.undefined
  var onClosed: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onEntered: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onEntering: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onExit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onExited: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onExiting: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onOpened: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
}

object Anon_ClassNames {
  @scala.inline
  def apply(
    classNames: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    delay: Anon_Hide = null,
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    navbar: js.UndefOr[scala.Boolean] = js.undefined,
    onClosed: js.Function0[scala.Unit] = null,
    onEntered: js.Function0[scala.Unit] = null,
    onEntering: js.Function0[scala.Unit] = null,
    onExit: js.Function0[scala.Unit] = null,
    onExited: js.Function0[scala.Unit] = null,
    onExiting: js.Function0[scala.Unit] = null,
    onOpened: js.Function0[scala.Unit] = null,
    tag: reactLib.reactMod.ReactNs.ReactType[_] = null
  ): Anon_ClassNames = {
    val __obj = js.Dynamic.literal()
    if (classNames != null) __obj.updateDynamic("classNames")(classNames)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (delay != null) __obj.updateDynamic("delay")(delay)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (!js.isUndefined(navbar)) __obj.updateDynamic("navbar")(navbar)
    if (onClosed != null) __obj.updateDynamic("onClosed")(onClosed)
    if (onEntered != null) __obj.updateDynamic("onEntered")(onEntered)
    if (onEntering != null) __obj.updateDynamic("onEntering")(onEntering)
    if (onExit != null) __obj.updateDynamic("onExit")(onExit)
    if (onExited != null) __obj.updateDynamic("onExited")(onExited)
    if (onExiting != null) __obj.updateDynamic("onExiting")(onExiting)
    if (onOpened != null) __obj.updateDynamic("onOpened")(onOpened)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassNames]
  }
}

