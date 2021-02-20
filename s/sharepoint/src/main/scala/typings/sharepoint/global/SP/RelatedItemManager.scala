package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.RelatedItemManager")
@js.native
class RelatedItemManager ()
  extends typings.sharepoint.SP.ClientObject
object RelatedItemManager {
  
  /* static member */
  @JSGlobal("SP.RelatedItemManager.addSingleLink")
  @js.native
  def addSingleLink(
    context: typings.sharepoint.SP.ClientRuntimeContext,
    SourceListName: String,
    SourceItemID: Double,
    SourceWebUrl: String,
    TargetListName: String,
    TargetItemID: Double,
    TargetWebUrl: String,
    TryAddReverseLink: Boolean
  ): Unit = js.native
  
  /* static member */
  @JSGlobal("SP.RelatedItemManager.addSingleLinkFromUrl")
  @js.native
  def addSingleLinkFromUrl(
    context: typings.sharepoint.SP.ClientRuntimeContext,
    SourceItemUrl: String,
    TargetListName: String,
    TargetItemID: Double,
    TryAddReverseLink: Boolean
  ): Unit = js.native
  
  /* static member */
  @JSGlobal("SP.RelatedItemManager.addSingleLinkToUrl")
  @js.native
  def addSingleLinkToUrl(
    context: typings.sharepoint.SP.ClientRuntimeContext,
    SourceListName: String,
    SourceItemID: Double,
    TargetItemUrl: String,
    TryAddReverseLink: Boolean
  ): Unit = js.native
  
  /* static member */
  @JSGlobal("SP.RelatedItemManager.deleteSingleLink")
  @js.native
  def deleteSingleLink(
    context: typings.sharepoint.SP.ClientRuntimeContext,
    SourceListName: String,
    SourceItemID: Double,
    SourceWebUrl: String,
    TargetListName: String,
    TargetItemID: Double,
    TargetWebUrl: String,
    TryDeleteReverseLink: Boolean
  ): Unit = js.native
  
  /* static member */
  @JSGlobal("SP.RelatedItemManager.getPageOneRelatedItems")
  @js.native
  def getPageOneRelatedItems(context: typings.sharepoint.SP.ClientRuntimeContext, SourceListName: String, SourceItemID: Double): js.Array[typings.sharepoint.SP.RelatedItem] = js.native
  
  /* static member */
  @JSGlobal("SP.RelatedItemManager.getRelatedItems")
  @js.native
  def getRelatedItems(context: typings.sharepoint.SP.ClientRuntimeContext, SourceListName: String, SourceItemID: Double): js.Array[typings.sharepoint.SP.RelatedItem] = js.native
}
