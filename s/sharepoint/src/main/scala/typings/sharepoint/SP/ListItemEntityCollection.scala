package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemEntityCollection[T] extends ClientObjectCollection[ListItem[T]] {
  def get_item(index: Double): ListItem[T] = js.native
  def itemAt(index: Double): ListItem[T] = js.native
}

