package typings.reactstrap.libFadeMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactType
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FadeProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var baseClass: js.UndefOr[String] = js.undefined
  var baseClassIn: js.UndefOr[String] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var in: js.UndefOr[Boolean] = js.undefined
  var onEnter: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLeave: js.UndefOr[js.Function0[Unit]] = js.undefined
  var tag: js.UndefOr[ReactType[_]] = js.undefined
  var transitionAppear: js.UndefOr[Boolean] = js.undefined
  var transitionAppearTimeout: js.UndefOr[Double] = js.undefined
  var transitionEnter: js.UndefOr[Boolean] = js.undefined
  var transitionEnterTimeout: js.UndefOr[Double] = js.undefined
  var transitionLeave: js.UndefOr[Boolean] = js.undefined
  var transitionLeaveTimeout: js.UndefOr[Double] = js.undefined
}

object FadeProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    baseClass: String = null,
    baseClassIn: String = null,
    className: String = null,
    cssModule: CSSModule = null,
    in: js.UndefOr[Boolean] = js.undefined,
    onEnter: () => Unit = null,
    onLeave: () => Unit = null,
    tag: ReactType[_] = null,
    transitionAppear: js.UndefOr[Boolean] = js.undefined,
    transitionAppearTimeout: Int | Double = null,
    transitionEnter: js.UndefOr[Boolean] = js.undefined,
    transitionEnterTimeout: Int | Double = null,
    transitionLeave: js.UndefOr[Boolean] = js.undefined,
    transitionLeaveTimeout: Int | Double = null
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

