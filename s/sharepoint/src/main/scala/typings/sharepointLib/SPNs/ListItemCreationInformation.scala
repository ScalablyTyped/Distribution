package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the properties of the new list item. */
@JSGlobal("SP.ListItemCreationInformation")
@js.native
class ListItemCreationInformation () extends ClientValueObject {
  def get_folderUrl(): java.lang.String = js.native
  def get_leafName(): java.lang.String = js.native
  def get_underlyingObjectType(): FileSystemObjectType = js.native
  /** Sets a value that specifies the folder for the new list item. */
  def set_folderUrl(value: java.lang.String): scala.Unit = js.native
  /** Sets a value that specifies the name of the new list item. It must be the name of the file if the parent list of the list item is a document library. */
  def set_leafName(value: java.lang.String): scala.Unit = js.native
  /** Sets a value that specifies whether the new list item is a file or a folder. */
  def set_underlyingObjectType(value: FileSystemObjectType): scala.Unit = js.native
}

