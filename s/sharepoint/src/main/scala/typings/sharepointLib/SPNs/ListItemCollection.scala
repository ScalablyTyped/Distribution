package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemCollection[T] extends ClientObjectCollection[ListItem[T]] {
  def getById(id: java.lang.String): ListItem[T] = js.native
  def getById(id: scala.Double): ListItem[T] = js.native
  def get_item(index: scala.Double): ListItem[T] = js.native
  def get_listItemCollectionPosition(): ListItemCollectionPosition = js.native
  def itemAt(index: scala.Double): ListItem[T] = js.native
}

