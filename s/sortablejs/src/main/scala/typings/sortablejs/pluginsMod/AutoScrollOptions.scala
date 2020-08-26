package typings.sortablejs.pluginsMod

import typings.sortablejs.mod.^
import typings.sortablejs.sortablejsStrings.continue
import typings.std.Event
import typings.std.HTMLElement
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScrollOptions extends js.Object {
  /**
    * apply autoscroll to all parent elements, allowing for easier movement.
    */
  var bubbleScroll: js.UndefOr[Boolean] = js.native
  /**
    *  Enable the plugin. Can be `HTMLElement`.
    */
  var scroll: js.UndefOr[Boolean | HTMLElement] = js.native
  /**
    * if you have custom scrollbar scrollFn may be used for autoscrolling.
    */
  var scrollFn: js.UndefOr[
    js.ThisFunction5[
      /* this */ ^, 
      /* offsetX */ Double, 
      /* offsetY */ Double, 
      /* originalEvent */ Event, 
      /* touchEvt */ TouchEvent, 
      /* hoverTargetEl */ HTMLElement, 
      continue | Unit
    ]
  ] = js.native
  /**
    * `px`, how near the mouse must be to an edge to start scrolling.
    */
  var scrollSensitivity: js.UndefOr[Double] = js.native
  /**
    * `px`, speed of the scrolling.`
    */
  var scrollSpeed: js.UndefOr[Double] = js.native
}

object AutoScrollOptions {
  @scala.inline
  def apply(): AutoScrollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScrollOptions]
  }
  @scala.inline
  implicit class AutoScrollOptionsOps[Self <: AutoScrollOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBubbleScroll(value: Boolean): Self = this.set("bubbleScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBubbleScroll: Self = this.set("bubbleScroll", js.undefined)
    @scala.inline
    def setScroll(value: Boolean | HTMLElement): Self = this.set("scroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    @scala.inline
    def setScrollFn(
      value: js.ThisFunction5[
          /* this */ ^, 
          /* offsetX */ Double, 
          /* offsetY */ Double, 
          /* originalEvent */ Event, 
          /* touchEvt */ TouchEvent, 
          /* hoverTargetEl */ HTMLElement, 
          continue | Unit
        ]
    ): Self = this.set("scrollFn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollFn: Self = this.set("scrollFn", js.undefined)
    @scala.inline
    def setScrollSensitivity(value: Double): Self = this.set("scrollSensitivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollSensitivity: Self = this.set("scrollSensitivity", js.undefined)
    @scala.inline
    def setScrollSpeed(value: Double): Self = this.set("scrollSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollSpeed: Self = this.set("scrollSpeed", js.undefined)
  }
  
}

