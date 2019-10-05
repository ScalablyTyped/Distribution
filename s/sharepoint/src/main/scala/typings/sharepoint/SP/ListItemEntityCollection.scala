package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemEntityCollection[T]
  extends ClientObjectCollection[typings.sharepoint.SP.ListItem[T]] {
  def get_item(index: Double): typings.sharepoint.SP.ListItem[T] = js.native
  def itemAt(index: Double): typings.sharepoint.SP.ListItem[T] = js.native
}

