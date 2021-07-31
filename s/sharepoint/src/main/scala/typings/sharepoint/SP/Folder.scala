package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Folder
  extends StObject
     with ClientObject {
  
  def deleteObject(): Unit = js.native
  
  def get_contentTypeOrder(): js.Array[ContentTypeId] = js.native
  
  def get_files(): FileCollection = js.native
  
  def get_folders(): FolderCollection = js.native
  
  def get_itemCount(): Double = js.native
  
  def get_listItemAllFields[T](): ListItem[T] = js.native
  
  def get_name(): String = js.native
  
  def get_parentFolder(): Folder = js.native
  
  def get_properties(): PropertyValues = js.native
  
  def get_serverRelativeUrl(): String = js.native
  
  def get_uniqueContentTypeOrder(): js.Array[ContentTypeId] = js.native
  
  def get_welcomePage(): String = js.native
  
  def recycle(): GuidResult = js.native
  
  def set_uniqueContentTypeOrder(value: js.Array[ContentTypeId]): Unit = js.native
  
  def set_welcomePage(value: String): Unit = js.native
  
  def update(): Unit = js.native
}
