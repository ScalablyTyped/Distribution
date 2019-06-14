package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RecycleBinItemType extends js.Object

@JSGlobal("SP.RecycleBinItemType")
@js.native
object RecycleBinItemType extends js.Object {
  @js.native
  sealed trait attachment
    extends sharepointLib.SPNs.RecycleBinItemType
  
  @js.native
  sealed trait cascadeParent
    extends sharepointLib.SPNs.RecycleBinItemType
  
  @js.native
  sealed trait file
    extends sharepointLib.SPNs.RecycleBinItemType
  
  @js.native
  sealed trait fileVersion
    extends sharepointLib.SPNs.RecycleBinItemType
  
  @js.native
  sealed trait folder
    extends sharepointLib.SPNs.RecycleBinItemType
  
  @js.native
  sealed trait folderWithLists
    extends sharepointLib.SPNs.RecycleBinItemType
  
  @js.native
  sealed trait list
    extends sharepointLib.SPNs.RecycleBinItemType
  
  @js.native
  sealed trait listItem
    extends sharepointLib.SPNs.RecycleBinItemType
  
  @js.native
  sealed trait listItemVersion
    extends sharepointLib.SPNs.RecycleBinItemType
  
  @js.native
  sealed trait none
    extends sharepointLib.SPNs.RecycleBinItemType
  
  @js.native
  sealed trait web
    extends sharepointLib.SPNs.RecycleBinItemType
  
  /* 7 */ val attachment: attachment with scala.Double = js.native
  /* 9 */ val cascadeParent: cascadeParent with scala.Double = js.native
  /* 1 */ val file: file with scala.Double = js.native
  /* 2 */ val fileVersion: fileVersion with scala.Double = js.native
  /* 5 */ val folder: folder with scala.Double = js.native
  /* 6 */ val folderWithLists: folderWithLists with scala.Double = js.native
  /* 4 */ val list: list with scala.Double = js.native
  /* 3 */ val listItem: listItem with scala.Double = js.native
  /* 8 */ val listItemVersion: listItemVersion with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 10 */ val web: web with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.RecycleBinItemType with scala.Double] = js.native
}

