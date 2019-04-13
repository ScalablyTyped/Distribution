package typings
package reactDashSwipeLib.reactDashSwipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactSwipe
  extends reactLib.reactMod.Component[Props, js.Object, js.Any] {
  def getNumSlides(): scala.Double = js.native
  def getPos(): scala.Double = js.native
  def next(): scala.Unit = js.native
  def prev(): scala.Unit = js.native
  def slide(index: scala.Double, duration: scala.Double): scala.Unit = js.native
}

