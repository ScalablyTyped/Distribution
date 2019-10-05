package typings.sharepoint.SP.Taxonomy

import typings.sharepoint.SP.ClientObjectCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangedItemCollection extends ClientObjectCollection[ChangedItem] {
  def get_item(index: Double): ChangedItem = js.native
  def itemAt(index: Double): ChangedItem = js.native
}

