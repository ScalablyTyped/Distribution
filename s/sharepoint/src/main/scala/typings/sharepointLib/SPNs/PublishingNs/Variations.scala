package typings
package sharepointLib.SPNs.PublishingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.Variations")
@js.native
class Variations ()
  extends sharepointLib.SPNs.ClientObject

/* static members */
@JSGlobal("SP.Publishing.Variations")
@js.native
object Variations extends js.Object {
  def getLabels(context: sharepointLib.SPNs.ClientContext): sharepointLib.SPNs.ClientObjectList[sharepointLib.SPNs.PublishingNs.VariationLabel] = js.native
  def getPeerUrl(
    context: sharepointLib.SPNs.ClientContext,
    currentUrl: java.lang.String,
    labelTitle: java.lang.String
  ): sharepointLib.SPNs.StringResult = js.native
  def updateListItems(
    context: sharepointLib.SPNs.ClientContext,
    listId: sharepointLib.SPNs.Guid,
    itemIds: js.Array[scala.Double]
  ): scala.Unit = js.native
}

