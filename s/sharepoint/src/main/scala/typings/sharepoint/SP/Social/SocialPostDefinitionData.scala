package typings.sharepoint.SP.Social

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides additional information about server-generated posts.
  This type can only be specified in a server-to-server call. */
trait SocialPostDefinitionData
  extends StObject
     with ClientValueObject {
  
  def get_items(): js.Array[SocialPostDefinitionDataItem]
  
  def get_name(): String
  
  def set_items(value: js.Array[SocialPostDefinitionDataItem]): js.Array[SocialPostDefinitionDataItem]
  
  def set_name(value: String): String
}
object SocialPostDefinitionData {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Unit,
    get_items: () => js.Array[SocialPostDefinitionDataItem],
    get_name: () => String,
    get_typeId: () => String,
    set_items: js.Array[SocialPostDefinitionDataItem] => js.Array[SocialPostDefinitionDataItem],
    set_name: String => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): SocialPostDefinitionData = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_items = js.Any.fromFunction0(get_items), get_name = js.Any.fromFunction0(get_name), get_typeId = js.Any.fromFunction0(get_typeId), set_items = js.Any.fromFunction1(set_items), set_name = js.Any.fromFunction1(set_name), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[SocialPostDefinitionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SocialPostDefinitionData] (val x: Self) extends AnyVal {
    
    inline def setGet_items(value: () => js.Array[SocialPostDefinitionDataItem]): Self = StObject.set(x, "get_items", js.Any.fromFunction0(value))
    
    inline def setGet_name(value: () => String): Self = StObject.set(x, "get_name", js.Any.fromFunction0(value))
    
    inline def setSet_items(value: js.Array[SocialPostDefinitionDataItem] => js.Array[SocialPostDefinitionDataItem]): Self = StObject.set(x, "set_items", js.Any.fromFunction1(value))
    
    inline def setSet_name(value: String => String): Self = StObject.set(x, "set_name", js.Any.fromFunction1(value))
  }
}
