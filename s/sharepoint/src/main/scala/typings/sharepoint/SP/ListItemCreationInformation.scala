package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the properties of the new list item. */
trait ListItemCreationInformation
  extends StObject
     with ClientValueObject {
  
  def get_folderUrl(): String
  
  def get_leafName(): String
  
  def get_underlyingObjectType(): FileSystemObjectType
  
  /** Sets a value that specifies the folder for the new list item. */
  def set_folderUrl(value: String): Unit
  
  /** Sets a value that specifies the name of the new list item. It must be the name of the file if the parent list of the list item is a document library. */
  def set_leafName(value: String): Unit
  
  /** Sets a value that specifies whether the new list item is a file or a folder. */
  def set_underlyingObjectType(value: FileSystemObjectType): Unit
}
object ListItemCreationInformation {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Unit,
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
  
  extension [Self <: ListItemCreationInformation](x: Self) {
    
    inline def setGet_folderUrl(value: () => String): Self = StObject.set(x, "get_folderUrl", js.Any.fromFunction0(value))
    
    inline def setGet_leafName(value: () => String): Self = StObject.set(x, "get_leafName", js.Any.fromFunction0(value))
    
    inline def setGet_underlyingObjectType(value: () => FileSystemObjectType): Self = StObject.set(x, "get_underlyingObjectType", js.Any.fromFunction0(value))
    
    inline def setSet_folderUrl(value: String => Unit): Self = StObject.set(x, "set_folderUrl", js.Any.fromFunction1(value))
    
    inline def setSet_leafName(value: String => Unit): Self = StObject.set(x, "set_leafName", js.Any.fromFunction1(value))
    
    inline def setSet_underlyingObjectType(value: FileSystemObjectType => Unit): Self = StObject.set(x, "set_underlyingObjectType", js.Any.fromFunction1(value))
  }
}
