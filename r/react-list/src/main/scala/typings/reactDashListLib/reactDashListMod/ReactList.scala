package typings
package reactDashListLib.reactDashListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactList
  extends reactLib.reactMod.Component[ReactListProps, js.Object, js.Any] {
  def getVisibleRange(): js.Array[scala.Double] = js.native
  def scrollAround(index: scala.Double): scala.Unit = js.native
  def scrollTo(index: scala.Double): scala.Unit = js.native
}

