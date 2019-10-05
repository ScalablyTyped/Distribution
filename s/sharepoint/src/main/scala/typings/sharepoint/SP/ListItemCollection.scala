package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemCollection[T]
  extends ClientObjectCollection[typings.sharepoint.SP.ListItem[T]] {
  def getById(id: String): typings.sharepoint.SP.ListItem[T] = js.native
  def getById(id: Double): typings.sharepoint.SP.ListItem[T] = js.native
  def get_item(index: Double): typings.sharepoint.SP.ListItem[T] = js.native
  def get_listItemCollectionPosition(): ListItemCollectionPosition = js.native
  def itemAt(index: Double): typings.sharepoint.SP.ListItem[T] = js.native
}

