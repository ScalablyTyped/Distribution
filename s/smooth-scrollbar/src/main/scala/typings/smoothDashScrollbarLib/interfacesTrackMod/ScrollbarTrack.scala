package typings
package smoothDashScrollbarLib.interfacesTrackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollbarTrack extends js.Object {
  val element: stdLib.HTMLElement
  val thumb: ScrollbarThumb
  def attachTo(container: stdLib.HTMLElement): scala.Unit
  def hide(): scala.Unit
  def show(): scala.Unit
  def update(scrollOffset: scala.Double, containerSize: scala.Double, pageSize: scala.Double): scala.Unit
}

