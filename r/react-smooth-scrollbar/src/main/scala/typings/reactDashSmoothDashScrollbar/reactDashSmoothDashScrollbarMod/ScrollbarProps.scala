package typings.reactDashSmoothDashScrollbar.reactDashSmoothDashScrollbarMod

import typings.react.reactMod.CSSProperties
import typings.smoothDashScrollbar.interfacesScrollbarMod.ScrollStatus
import typings.smoothDashScrollbar.smoothDashScrollbarMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof smooth-scrollbar.smooth-scrollbar/interfaces/scrollbar.ScrollbarOptions ]:? smooth-scrollbar.smooth-scrollbar/interfaces/scrollbar.ScrollbarOptions[P]} */ trait ScrollbarProps extends js.Object {
  /**
    * Keep scrollbar tracks visible whether it's scrolling or not
    * @default false
    */
  var alwaysShowTracks: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional class name
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Pipe to scrollbar.addListener()
    */
  var onScroll: js.UndefOr[js.Function2[/* status */ ScrollStatus, /* scrollbarInstance */ default, Unit]] = js.undefined
  /**
    * Optional style
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object ScrollbarProps {
  @scala.inline
  def apply(
    alwaysShowTracks: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    onScroll: (/* status */ ScrollStatus, /* scrollbarInstance */ default) => Unit = null,
    style: CSSProperties = null
  ): ScrollbarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShowTracks)) __obj.updateDynamic("alwaysShowTracks")(alwaysShowTracks.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction2(onScroll))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollbarProps]
  }
}

