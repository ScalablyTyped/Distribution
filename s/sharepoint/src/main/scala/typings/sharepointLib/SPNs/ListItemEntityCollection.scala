package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemEntityCollection[T] extends ClientObjectCollection[ListItem[T]] {
  def get_item(index: scala.Double): ListItem[T] = js.native
  def itemAt(index: scala.Double): ListItem[T] = js.native
}

