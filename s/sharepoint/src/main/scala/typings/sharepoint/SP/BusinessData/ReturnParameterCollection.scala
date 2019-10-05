package typings.sharepoint.SP.BusinessData

import typings.sharepoint.SP.BusinessData.Runtime.EntityFieldValueDictionary
import typings.sharepoint.SP.ClientObjectCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnParameterCollection extends ClientObjectCollection[EntityFieldValueDictionary] {
  def get_item(index: Double): EntityFieldValueDictionary = js.native
  def itemAt(index: Double): EntityFieldValueDictionary = js.native
}

