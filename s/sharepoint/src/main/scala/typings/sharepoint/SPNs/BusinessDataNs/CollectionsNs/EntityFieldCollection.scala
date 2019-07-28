package typings.sharepoint.SPNs.BusinessDataNs.CollectionsNs

import typings.sharepoint.SPNs.BusinessDataNs.EntityField
import typings.sharepoint.SPNs.ClientObjectCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityFieldCollection extends ClientObjectCollection[EntityField] {
  def get_item(index: Double): EntityField = js.native
  def itemAt(index: Double): EntityField = js.native
}

