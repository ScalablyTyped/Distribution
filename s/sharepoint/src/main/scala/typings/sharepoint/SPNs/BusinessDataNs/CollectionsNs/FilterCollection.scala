package typings.sharepoint.SPNs.BusinessDataNs.CollectionsNs

import typings.sharepoint.SPNs.BusinessDataNs.Filter
import typings.sharepoint.SPNs.ClientObjectCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterCollection extends ClientObjectCollection[Filter] {
  def get_item(index: Double): Filter = js.native
  def itemAt(index: Double): Filter = js.native
  def setFilterValue(inputFilterName: String, valueIndex: Double, value: js.Any): Unit = js.native
}

