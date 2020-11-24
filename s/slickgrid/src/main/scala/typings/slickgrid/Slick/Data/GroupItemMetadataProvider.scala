package typings.slickgrid.Slick.Data

import typings.slickgrid.Slick.Group
import typings.slickgrid.Slick.GroupTotals
import typings.slickgrid.Slick.RowMetadata
import typings.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupItemMetadataProvider[T /* <: SlickData */] extends js.Object {
  
  def destroy(): Unit = js.native
  
  def getGroupRowMetadata(): RowMetadata[T] = js.native
  def getGroupRowMetadata(item: Group[T]): RowMetadata[T] = js.native
  
  def getTotalsRowMetadata(): RowMetadata[T] = js.native
  def getTotalsRowMetadata(item: GroupTotals[T]): RowMetadata[T] = js.native
  
  def init(): Unit = js.native
}
