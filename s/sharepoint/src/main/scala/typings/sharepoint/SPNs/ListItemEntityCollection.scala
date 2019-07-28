package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemEntityCollection[T]
  extends ClientObjectCollection[typings.sharepoint.SPNs.ListItem[T]] {
  def get_item(index: Double): typings.sharepoint.SPNs.ListItem[T] = js.native
  def itemAt(index: Double): typings.sharepoint.SPNs.ListItem[T] = js.native
}

