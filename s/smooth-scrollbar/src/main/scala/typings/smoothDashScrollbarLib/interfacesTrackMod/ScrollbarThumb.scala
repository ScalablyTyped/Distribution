package typings
package smoothDashScrollbarLib.interfacesTrackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ScrollbarThumb extends js.Object {
  var displaySize: scala.Double
  val element: stdLib.HTMLElement
  var offset: scala.Double
  var realSize: scala.Double
  def attachTo(track: stdLib.HTMLElement): scala.Unit
  def update(scrollOffset: scala.Double, containerSize: scala.Double, pageSize: scala.Double): scala.Unit
}

