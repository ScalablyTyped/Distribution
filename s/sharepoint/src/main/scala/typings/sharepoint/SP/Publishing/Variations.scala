package typings.sharepoint.SP.Publishing

import typings.sharepoint.SP.ClientContext
import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.ClientObjectList
import typings.sharepoint.SP.Guid
import typings.sharepoint.SP.StringResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.Variations")
@js.native
class Variations () extends ClientObject

/* static members */
@JSGlobal("SP.Publishing.Variations")
@js.native
object Variations extends js.Object {
  def getLabels(context: ClientContext): ClientObjectList[VariationLabel] = js.native
  def getPeerUrl(context: ClientContext, currentUrl: String, labelTitle: String): StringResult = js.native
  def updateListItems(context: ClientContext, listId: Guid, itemIds: js.Array[Double]): Unit = js.native
}

