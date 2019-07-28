package typings.sharepoint.SPNs.PublishingNs

import typings.sharepoint.SPNs.ClientContext
import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.ClientObjectList
import typings.sharepoint.SPNs.Guid
import typings.sharepoint.SPNs.StringResult
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

