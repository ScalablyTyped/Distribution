package typings.sharepoint.SP.Publishing

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.Web
import typings.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageLayoutCreationInformation extends ClientValueObject {
  
  def get_associatedContentTypeId(): String = js.native
  
  def get_masterPageUrl(): String = js.native
  
  def get_newPageLayoutEditablePath(): String = js.native
  
  def get_newPageLayoutNameWithoutExtension(): String = js.native
  
  def get_web(): Web = js.native
  
  def set_associatedContentTypeId(value: String): String = js.native
  
  def set_masterPageUrl(value: String): String = js.native
  
  def set_newPageLayoutEditablePath(value: String): String = js.native
  
  def set_newPageLayoutNameWithoutExtension(value: String): String = js.native
  
  def set_web(value: Web): Web = js.native
}
object PageLayoutCreationInformation {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_associatedContentTypeId: () => String,
    get_masterPageUrl: () => String,
    get_newPageLayoutEditablePath: () => String,
    get_newPageLayoutNameWithoutExtension: () => String,
    get_typeId: () => String,
    get_web: () => Web,
    set_associatedContentTypeId: String => String,
    set_masterPageUrl: String => String,
    set_newPageLayoutEditablePath: String => String,
    set_newPageLayoutNameWithoutExtension: String => String,
    set_web: Web => Web,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): PageLayoutCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_associatedContentTypeId = js.Any.fromFunction0(get_associatedContentTypeId), get_masterPageUrl = js.Any.fromFunction0(get_masterPageUrl), get_newPageLayoutEditablePath = js.Any.fromFunction0(get_newPageLayoutEditablePath), get_newPageLayoutNameWithoutExtension = js.Any.fromFunction0(get_newPageLayoutNameWithoutExtension), get_typeId = js.Any.fromFunction0(get_typeId), get_web = js.Any.fromFunction0(get_web), set_associatedContentTypeId = js.Any.fromFunction1(set_associatedContentTypeId), set_masterPageUrl = js.Any.fromFunction1(set_masterPageUrl), set_newPageLayoutEditablePath = js.Any.fromFunction1(set_newPageLayoutEditablePath), set_newPageLayoutNameWithoutExtension = js.Any.fromFunction1(set_newPageLayoutNameWithoutExtension), set_web = js.Any.fromFunction1(set_web), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[PageLayoutCreationInformation]
  }
  
  @scala.inline
  implicit class PageLayoutCreationInformationMutableBuilder[Self <: PageLayoutCreationInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_associatedContentTypeId(value: () => String): Self = StObject.set(x, "get_associatedContentTypeId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_masterPageUrl(value: () => String): Self = StObject.set(x, "get_masterPageUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_newPageLayoutEditablePath(value: () => String): Self = StObject.set(x, "get_newPageLayoutEditablePath", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_newPageLayoutNameWithoutExtension(value: () => String): Self = StObject.set(x, "get_newPageLayoutNameWithoutExtension", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_web(value: () => Web): Self = StObject.set(x, "get_web", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_associatedContentTypeId(value: String => String): Self = StObject.set(x, "set_associatedContentTypeId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_masterPageUrl(value: String => String): Self = StObject.set(x, "set_masterPageUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_newPageLayoutEditablePath(value: String => String): Self = StObject.set(x, "set_newPageLayoutEditablePath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_newPageLayoutNameWithoutExtension(value: String => String): Self = StObject.set(x, "set_newPageLayoutNameWithoutExtension", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_web(value: Web => Web): Self = StObject.set(x, "set_web", js.Any.fromFunction1(value))
  }
}
