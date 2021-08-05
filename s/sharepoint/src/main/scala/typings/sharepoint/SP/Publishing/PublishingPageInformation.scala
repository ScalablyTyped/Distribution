package typings.sharepoint.SP.Publishing

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.Folder
import typings.sharepoint.SP.ListItem
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishingPageInformation
  extends StObject
     with ClientValueObject {
  
  def get_folder(): Folder
  
  def get_name(): String
  
  def get_pageLayoutListItem(): ListItem[js.Any]
  
  def set_folder(value: Folder): Folder
  
  def set_name(value: String): String
  
  def set_pageLayoutListItem(value: ListItem[js.Any]): ListItem[js.Any]
}
object PublishingPageInformation {
  
  inline def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_folder: () => Folder,
    get_name: () => String,
    get_pageLayoutListItem: () => ListItem[js.Any],
    get_typeId: () => String,
    set_folder: Folder => Folder,
    set_name: String => String,
    set_pageLayoutListItem: ListItem[js.Any] => ListItem[js.Any],
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): PublishingPageInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_folder = js.Any.fromFunction0(get_folder), get_name = js.Any.fromFunction0(get_name), get_pageLayoutListItem = js.Any.fromFunction0(get_pageLayoutListItem), get_typeId = js.Any.fromFunction0(get_typeId), set_folder = js.Any.fromFunction1(set_folder), set_name = js.Any.fromFunction1(set_name), set_pageLayoutListItem = js.Any.fromFunction1(set_pageLayoutListItem), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[PublishingPageInformation]
  }
  
  extension [Self <: PublishingPageInformation](x: Self) {
    
    inline def setGet_folder(value: () => Folder): Self = StObject.set(x, "get_folder", js.Any.fromFunction0(value))
    
    inline def setGet_name(value: () => String): Self = StObject.set(x, "get_name", js.Any.fromFunction0(value))
    
    inline def setGet_pageLayoutListItem(value: () => ListItem[js.Any]): Self = StObject.set(x, "get_pageLayoutListItem", js.Any.fromFunction0(value))
    
    inline def setSet_folder(value: Folder => Folder): Self = StObject.set(x, "set_folder", js.Any.fromFunction1(value))
    
    inline def setSet_name(value: String => String): Self = StObject.set(x, "set_name", js.Any.fromFunction1(value))
    
    inline def setSet_pageLayoutListItem(value: ListItem[js.Any] => ListItem[js.Any]): Self = StObject.set(x, "set_pageLayoutListItem", js.Any.fromFunction1(value))
  }
}
