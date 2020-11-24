package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the properties of the new list item. */
@js.native
trait ListItemCreationInformation extends ClientValueObject {
  
  def get_folderUrl(): String = js.native
  
  def get_leafName(): String = js.native
  
  def get_underlyingObjectType(): FileSystemObjectType = js.native
  
  /** Sets a value that specifies the folder for the new list item. */
  def set_folderUrl(value: String): Unit = js.native
  
  /** Sets a value that specifies the name of the new list item. It must be the name of the file if the parent list of the list item is a document library. */
  def set_leafName(value: String): Unit = js.native
  
  /** Sets a value that specifies whether the new list item is a file or a folder. */
  def set_underlyingObjectType(value: FileSystemObjectType): Unit = js.native
}
object ListItemCreationInformation {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_folderUrl: () => String,
    get_leafName: () => String,
    get_typeId: () => String,
    get_underlyingObjectType: () => FileSystemObjectType,
    set_folderUrl: String => Unit,
    set_leafName: String => Unit,
    set_underlyingObjectType: FileSystemObjectType => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ListItemCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_folderUrl = js.Any.fromFunction0(get_folderUrl), get_leafName = js.Any.fromFunction0(get_leafName), get_typeId = js.Any.fromFunction0(get_typeId), get_underlyingObjectType = js.Any.fromFunction0(get_underlyingObjectType), set_folderUrl = js.Any.fromFunction1(set_folderUrl), set_leafName = js.Any.fromFunction1(set_leafName), set_underlyingObjectType = js.Any.fromFunction1(set_underlyingObjectType), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ListItemCreationInformation]
  }
  
  @scala.inline
  implicit class ListItemCreationInformationOps[Self <: ListItemCreationInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet_folderUrl(value: () => String): Self = this.set("get_folderUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_leafName(value: () => String): Self = this.set("get_leafName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_underlyingObjectType(value: () => FileSystemObjectType): Self = this.set("get_underlyingObjectType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_folderUrl(value: String => Unit): Self = this.set("set_folderUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_leafName(value: String => Unit): Self = this.set("set_leafName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_underlyingObjectType(value: FileSystemObjectType => Unit): Self = this.set("set_underlyingObjectType", js.Any.fromFunction1(value))
  }
}
