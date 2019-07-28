package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.RelatedItemManager")
@js.native
class RelatedItemManager () extends ClientObject

/* static members */
@JSGlobal("SP.RelatedItemManager")
@js.native
object RelatedItemManager extends js.Object {
  def addSingleLink(
    context: ClientRuntimeContext,
    SourceListName: String,
    SourceItemID: Double,
    SourceWebUrl: String,
    TargetListName: String,
    TargetItemID: Double,
    TargetWebUrl: String,
    TryAddReverseLink: Boolean
  ): Unit = js.native
  def addSingleLinkFromUrl(
    context: ClientRuntimeContext,
    SourceItemUrl: String,
    TargetListName: String,
    TargetItemID: Double,
    TryAddReverseLink: Boolean
  ): Unit = js.native
  def addSingleLinkToUrl(
    context: ClientRuntimeContext,
    SourceListName: String,
    SourceItemID: Double,
    TargetItemUrl: String,
    TryAddReverseLink: Boolean
  ): Unit = js.native
  def deleteSingleLink(
    context: ClientRuntimeContext,
    SourceListName: String,
    SourceItemID: Double,
    SourceWebUrl: String,
    TargetListName: String,
    TargetItemID: Double,
    TargetWebUrl: String,
    TryDeleteReverseLink: Boolean
  ): Unit = js.native
  def getPageOneRelatedItems(context: ClientRuntimeContext, SourceListName: String, SourceItemID: Double): js.Array[RelatedItem] = js.native
  def getRelatedItems(context: ClientRuntimeContext, SourceListName: String, SourceItemID: Double): js.Array[RelatedItem] = js.native
}

