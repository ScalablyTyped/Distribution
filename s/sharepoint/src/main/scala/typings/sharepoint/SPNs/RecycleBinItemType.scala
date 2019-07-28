package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RecycleBinItemType extends js.Object

@JSGlobal("SP.RecycleBinItemType")
@js.native
object RecycleBinItemType extends js.Object {
  @js.native
  sealed trait attachment extends RecycleBinItemType
  
  @js.native
  sealed trait cascadeParent extends RecycleBinItemType
  
  @js.native
  sealed trait file extends RecycleBinItemType
  
  @js.native
  sealed trait fileVersion extends RecycleBinItemType
  
  @js.native
  sealed trait folder extends RecycleBinItemType
  
  @js.native
  sealed trait folderWithLists extends RecycleBinItemType
  
  @js.native
  sealed trait list extends RecycleBinItemType
  
  @js.native
  sealed trait listItem extends RecycleBinItemType
  
  @js.native
  sealed trait listItemVersion extends RecycleBinItemType
  
  @js.native
  sealed trait none extends RecycleBinItemType
  
  @js.native
  sealed trait web extends RecycleBinItemType
  
  /* 7 */ val attachment: typings.sharepoint.SPNs.RecycleBinItemType.attachment with Double = js.native
  /* 9 */ val cascadeParent: typings.sharepoint.SPNs.RecycleBinItemType.cascadeParent with Double = js.native
  /* 1 */ val file: typings.sharepoint.SPNs.RecycleBinItemType.file with Double = js.native
  /* 2 */ val fileVersion: typings.sharepoint.SPNs.RecycleBinItemType.fileVersion with Double = js.native
  /* 5 */ val folder: typings.sharepoint.SPNs.RecycleBinItemType.folder with Double = js.native
  /* 6 */ val folderWithLists: typings.sharepoint.SPNs.RecycleBinItemType.folderWithLists with Double = js.native
  /* 4 */ val list: typings.sharepoint.SPNs.RecycleBinItemType.list with Double = js.native
  /* 3 */ val listItem: typings.sharepoint.SPNs.RecycleBinItemType.listItem with Double = js.native
  /* 8 */ val listItemVersion: typings.sharepoint.SPNs.RecycleBinItemType.listItemVersion with Double = js.native
  /* 0 */ val none: typings.sharepoint.SPNs.RecycleBinItemType.none with Double = js.native
  /* 10 */ val web: typings.sharepoint.SPNs.RecycleBinItemType.web with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RecycleBinItemType with Double] = js.native
}

