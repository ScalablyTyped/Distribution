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
  
  val attachment: attachment with java.lang.String = js.native
  val cascadeParent: cascadeParent with java.lang.String = js.native
  val file: file with java.lang.String = js.native
  val fileVersion: fileVersion with java.lang.String = js.native
  val folder: folder with java.lang.String = js.native
  val folderWithLists: folderWithLists with java.lang.String = js.native
  val list: list with java.lang.String = js.native
  val listItem: listItem with java.lang.String = js.native
  val listItemVersion: listItemVersion with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val web: web with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.RecycleBinItemType with java.lang.String] = js.native
}

