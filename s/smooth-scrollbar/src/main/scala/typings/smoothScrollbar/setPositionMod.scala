package typings.smoothScrollbar

import typings.smoothScrollbar.scrollbarMod.ScrollStatus
import typings.smoothScrollbar.scrollbarMod.Scrollbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/scrolling/set-position", JSImport.Namespace)
@js.native
object setPositionMod extends js.Object {
  def setPosition(scrollbar: Scrollbar, x: Double, y: Double): ScrollStatus | Null = js.native
}

