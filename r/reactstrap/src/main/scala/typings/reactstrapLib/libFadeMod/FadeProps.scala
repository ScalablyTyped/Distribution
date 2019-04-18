package typings
package reactstrapLib.libFadeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FadeProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var baseClass: js.UndefOr[java.lang.String] = js.undefined
  var baseClassIn: js.UndefOr[java.lang.String] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var in: js.UndefOr[scala.Boolean] = js.undefined
  var onEnter: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onLeave: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  var transitionAppear: js.UndefOr[scala.Boolean] = js.undefined
  var transitionAppearTimeout: js.UndefOr[scala.Double] = js.undefined
  var transitionEnter: js.UndefOr[scala.Boolean] = js.undefined
  var transitionEnterTimeout: js.UndefOr[scala.Double] = js.undefined
  var transitionLeave: js.UndefOr[scala.Boolean] = js.undefined
  var transitionLeaveTimeout: js.UndefOr[scala.Double] = js.undefined
}

object FadeProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    baseClass: java.lang.String = null,
    baseClassIn: java.lang.String = null,
    className: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    in: js.UndefOr[scala.Boolean] = js.undefined,
    onEnter: () => scala.Unit = null,
    onLeave: () => scala.Unit = null,
    tag: reactLib.reactMod.ReactType[_] = null,
    transitionAppear: js.UndefOr[scala.Boolean] = js.undefined,
    transitionAppearTimeout: scala.Int | scala.Double = null,
    transitionEnter: js.UndefOr[scala.Boolean] = js.undefined,
    transitionEnterTimeout: scala.Int | scala.Double = null,
    transitionLeave: js.UndefOr[scala.Boolean] = js.undefined,
    transitionLeaveTimeout: scala.Int | scala.Double = null
  ): FadeProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass)
    if (baseClassIn != null) __obj.updateDynamic("baseClassIn")(baseClassIn)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(in)) __obj.updateDynamic("in")(in)
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction0(onEnter))
    if (onLeave != null) __obj.updateDynamic("onLeave")(js.Any.fromFunction0(onLeave))
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionAppear)) __obj.updateDynamic("transitionAppear")(transitionAppear)
    if (transitionAppearTimeout != null) __obj.updateDynamic("transitionAppearTimeout")(transitionAppearTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionEnter)) __obj.updateDynamic("transitionEnter")(transitionEnter)
    if (transitionEnterTimeout != null) __obj.updateDynamic("transitionEnterTimeout")(transitionEnterTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionLeave)) __obj.updateDynamic("transitionLeave")(transitionLeave)
    if (transitionLeaveTimeout != null) __obj.updateDynamic("transitionLeaveTimeout")(transitionLeaveTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[FadeProps]
  }
}

