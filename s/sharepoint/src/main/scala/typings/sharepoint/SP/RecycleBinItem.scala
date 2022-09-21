package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecycleBinItem
  extends StObject
     with ClientObject {
  
  def deleteObject(): Unit = js.native
  
  def get_author(): User = js.native
  
  def get_deletedBy(): User = js.native
  
  def get_deletedDate(): js.Date = js.native
  
  def get_dirName(): String = js.native
  
  def get_id(): Guid = js.native
  
  def get_itemState(): RecycleBinItemState = js.native
  
  def get_itemType(): RecycleBinItemType = js.native
  
  def get_leafName(): String = js.native
  
  def get_size(): Double = js.native
  
  def get_title(): String = js.native
  
  def restore(): Unit = js.native
}
