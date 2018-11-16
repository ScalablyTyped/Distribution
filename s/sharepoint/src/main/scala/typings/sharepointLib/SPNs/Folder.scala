package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Folder")
@js.native
class Folder () extends ClientObject {
  def deleteObject(): scala.Unit = js.native
  def get_contentTypeOrder(): js.Array[ContentTypeId] = js.native
  def get_files(): FileCollection = js.native
  def get_folders(): FolderCollection = js.native
  def get_itemCount(): scala.Double = js.native
  def get_listItemAllFields[T](): ListItem[T] = js.native
  def get_name(): java.lang.String = js.native
  def get_parentFolder(): Folder = js.native
  def get_properties(): PropertyValues = js.native
  def get_serverRelativeUrl(): java.lang.String = js.native
  def get_uniqueContentTypeOrder(): js.Array[ContentTypeId] = js.native
  def get_welcomePage(): java.lang.String = js.native
  def recycle(): GuidResult = js.native
  def set_uniqueContentTypeOrder(value: js.Array[ContentTypeId]): scala.Unit = js.native
  def set_welcomePage(value: java.lang.String): scala.Unit = js.native
  def update(): scala.Unit = js.native
}

