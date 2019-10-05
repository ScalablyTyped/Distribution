package typings.sharepoint.SP

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
  
  /* 7 */ val attachment: typings.sharepoint.SP.RecycleBinItemType.attachment with Double = js.native
  /* 9 */ val cascadeParent: typings.sharepoint.SP.RecycleBinItemType.cascadeParent with Double = js.native
  /* 1 */ val file: typings.sharepoint.SP.RecycleBinItemType.file with Double = js.native
  /* 2 */ val fileVersion: typings.sharepoint.SP.RecycleBinItemType.fileVersion with Double = js.native
  /* 5 */ val folder: typings.sharepoint.SP.RecycleBinItemType.folder with Double = js.native
  /* 6 */ val folderWithLists: typings.sharepoint.SP.RecycleBinItemType.folderWithLists with Double = js.native
  /* 4 */ val list: typings.sharepoint.SP.RecycleBinItemType.list with Double = js.native
  /* 3 */ val listItem: typings.sharepoint.SP.RecycleBinItemType.listItem with Double = js.native
  /* 8 */ val listItemVersion: typings.sharepoint.SP.RecycleBinItemType.listItemVersion with Double = js.native
  /* 0 */ val none: typings.sharepoint.SP.RecycleBinItemType.none with Double = js.native
  /* 10 */ val web: typings.sharepoint.SP.RecycleBinItemType.web with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RecycleBinItemType with Double] = js.native
}

