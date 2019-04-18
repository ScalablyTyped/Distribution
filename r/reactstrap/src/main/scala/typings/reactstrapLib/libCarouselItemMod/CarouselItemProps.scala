package typings
package reactstrapLib.libCarouselItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselItemProps
  extends reactLib.reactMod.HTMLProps[stdLib.HTMLElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var in: js.UndefOr[scala.Boolean] = js.undefined
  var onEnter: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onEntered: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onEntering: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onExit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onExited: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onExiting: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var slide: js.UndefOr[scala.Boolean] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
}

object CarouselItemProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[stdLib.HTMLElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    in: js.UndefOr[scala.Boolean] = js.undefined,
    onEnter: () => scala.Unit = null,
    onEntered: () => scala.Unit = null,
    onEntering: () => scala.Unit = null,
    onExit: () => scala.Unit = null,
    onExited: () => scala.Unit = null,
    onExiting: () => scala.Unit = null,
    slide: js.UndefOr[scala.Boolean] = js.undefined,
    tag: reactLib.reactMod.ReactType[_] = null
  ): CarouselItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(in)) __obj.updateDynamic("in")(in)
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction0(onEnter))
    if (onEntered != null) __obj.updateDynamic("onEntered")(js.Any.fromFunction0(onEntered))
    if (onEntering != null) __obj.updateDynamic("onEntering")(js.Any.fromFunction0(onEntering))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction0(onExit))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction0(onExited))
    if (onExiting != null) __obj.updateDynamic("onExiting")(js.Any.fromFunction0(onExiting))
    if (!js.isUndefined(slide)) __obj.updateDynamic("slide")(slide)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselItemProps]
  }
}

