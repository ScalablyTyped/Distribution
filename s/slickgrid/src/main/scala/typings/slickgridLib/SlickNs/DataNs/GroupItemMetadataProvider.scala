package typings
package slickgridLib.SlickNs.DataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Data.GroupItemMetadataProvider")
@js.native
class GroupItemMetadataProvider[T /* <: slickgridLib.SlickNs.SlickData */] () extends js.Object {
  def destroy(): scala.Unit = js.native
  def getGroupRowMetadata(): slickgridLib.SlickNs.RowMetadata[T] = js.native
  def getGroupRowMetadata(item: slickgridLib.SlickNs.Group[T]): slickgridLib.SlickNs.RowMetadata[T] = js.native
  def getTotalsRowMetadata(): slickgridLib.SlickNs.RowMetadata[T] = js.native
  def getTotalsRowMetadata(item: slickgridLib.SlickNs.GroupTotals[T]): slickgridLib.SlickNs.RowMetadata[T] = js.native
  def init(): scala.Unit = js.native
}

