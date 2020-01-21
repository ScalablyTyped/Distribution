package typings.sortablejs.pluginsMod

import typings.sortablejs.mod.^
import typings.sortablejs.sortablejsStrings.continue
import typings.std.Event_
import typings.std.HTMLElement
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoScrollOptions extends js.Object {
  /**
    * apply autoscroll to all parent elements, allowing for easier movement.
    */
  var bubbleScroll: js.UndefOr[Boolean] = js.undefined
  /**
    *  Enable the plugin. Can be `HTMLElement`.
    */
  var scroll: js.UndefOr[Boolean | HTMLElement] = js.undefined
  /**
    * if you have custom scrollbar scrollFn may be used for autoscrolling.
    */
  var scrollFn: js.UndefOr[
    js.ThisFunction5[
      /* this */ ^, 
      /* offsetX */ Double, 
      /* offsetY */ Double, 
      /* originalEvent */ Event_, 
      /* touchEvt */ TouchEvent, 
      /* hoverTargetEl */ HTMLElement, 
      continue | Unit
    ]
  ] = js.undefined
  /**
    * `px`, how near the mouse must be to an edge to start scrolling.
    */
  var scrollSensitivity: js.UndefOr[Double] = js.undefined
  /**
    * `px`, speed of the scrolling.`
    */
  var scrollSpeed: js.UndefOr[Double] = js.undefined
}

object AutoScrollOptions {
  @scala.inline
  def apply(
    bubbleScroll: js.UndefOr[Boolean] = js.undefined,
    scroll: Boolean | HTMLElement = null,
    scrollFn: js.ThisFunction5[
      /* this */ ^, 
      /* offsetX */ Double, 
      /* offsetY */ Double, 
      /* originalEvent */ Event_, 
      /* touchEvt */ TouchEvent, 
      /* hoverTargetEl */ HTMLElement, 
      continue | Unit
    ] = null,
    scrollSensitivity: Int | Double = null,
    scrollSpeed: Int | Double = null
  ): AutoScrollOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbleScroll)) __obj.updateDynamic("bubbleScroll")(bubbleScroll.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (scrollFn != null) __obj.updateDynamic("scrollFn")(scrollFn.asInstanceOf[js.Any])
    if (scrollSensitivity != null) __obj.updateDynamic("scrollSensitivity")(scrollSensitivity.asInstanceOf[js.Any])
    if (scrollSpeed != null) __obj.updateDynamic("scrollSpeed")(scrollSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoScrollOptions]
  }
}

