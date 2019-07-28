package typings.slickgrid.SlickNs.DataNs

import typings.slickgrid.SlickNs.Group
import typings.slickgrid.SlickNs.GroupTotals
import typings.slickgrid.SlickNs.RowMetadata
import typings.slickgrid.SlickNs.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Data.GroupItemMetadataProvider")
@js.native
class GroupItemMetadataProvider[T /* <: SlickData */] () extends js.Object {
  def destroy(): Unit = js.native
  def getGroupRowMetadata(): RowMetadata[T] = js.native
  def getGroupRowMetadata(item: Group[T]): RowMetadata[T] = js.native
  def getTotalsRowMetadata(): RowMetadata[T] = js.native
  def getTotalsRowMetadata(item: GroupTotals[T]): RowMetadata[T] = js.native
  def init(): Unit = js.native
}

