package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.RelatedItemManager")
@js.native
class RelatedItemManager () extends ClientObject

@JSGlobal("SP.RelatedItemManager")
@js.native
object RelatedItemManager extends js.Object {
  def addSingleLink(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    SourceListName: java.lang.String,
    SourceItemID: scala.Double,
    SourceWebUrl: java.lang.String,
    TargetListName: java.lang.String,
    TargetItemID: scala.Double,
    TargetWebUrl: java.lang.String,
    TryAddReverseLink: scala.Boolean
  ): scala.Unit = js.native
  def addSingleLinkFromUrl(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    SourceItemUrl: java.lang.String,
    TargetListName: java.lang.String,
    TargetItemID: scala.Double,
    TryAddReverseLink: scala.Boolean
  ): scala.Unit = js.native
  def addSingleLinkToUrl(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    SourceListName: java.lang.String,
    SourceItemID: scala.Double,
    TargetItemUrl: java.lang.String,
    TryAddReverseLink: scala.Boolean
  ): scala.Unit = js.native
  def deleteSingleLink(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    SourceListName: java.lang.String,
    SourceItemID: scala.Double,
    SourceWebUrl: java.lang.String,
    TargetListName: java.lang.String,
    TargetItemID: scala.Double,
    TargetWebUrl: java.lang.String,
    TryDeleteReverseLink: scala.Boolean
  ): scala.Unit = js.native
  def getPageOneRelatedItems(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    SourceListName: java.lang.String,
    SourceItemID: scala.Double
  ): js.Array[sharepointLib.SPNs.RelatedItem] = js.native
  def getRelatedItems(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    SourceListName: java.lang.String,
    SourceItemID: scala.Double
  ): js.Array[sharepointLib.SPNs.RelatedItem] = js.native
}

