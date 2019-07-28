package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemCollection[T]
  extends ClientObjectCollection[typings.sharepoint.SPNs.ListItem[T]] {
  def getById(id: String): typings.sharepoint.SPNs.ListItem[T] = js.native
  def getById(id: Double): typings.sharepoint.SPNs.ListItem[T] = js.native
  def get_item(index: Double): typings.sharepoint.SPNs.ListItem[T] = js.native
  def get_listItemCollectionPosition(): ListItemCollectionPosition = js.native
  def itemAt(index: Double): typings.sharepoint.SPNs.ListItem[T] = js.native
}

