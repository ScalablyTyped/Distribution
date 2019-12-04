package typings.smoothDashScrollbar

import typings.smoothDashScrollbar.interfacesScrollbarMod.ScrollStatus
import typings.smoothDashScrollbar.interfacesScrollbarMod.Scrollbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/scrolling/set-position", JSImport.Namespace)
@js.native
object scrollingSetDashPositionMod extends js.Object {
  def setPosition(scrollbar: Scrollbar, x: Double, y: Double): ScrollStatus | Null = js.native
}

