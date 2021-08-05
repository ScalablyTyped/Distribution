package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Language
  extends StObject
     with ClientValueObject {
  
  def get_displayName(): String
  
  def get_languageTag(): String
  
  def get_lcid(): Double
}
object Language {
  
  inline def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_displayName: () => String,
    get_languageTag: () => String,
    get_lcid: () => Double,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): Language = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_displayName = js.Any.fromFunction0(get_displayName), get_languageTag = js.Any.fromFunction0(get_languageTag), get_lcid = js.Any.fromFunction0(get_lcid), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[Language]
  }
  
  extension [Self <: Language](x: Self) {
    
    inline def setGet_displayName(value: () => String): Self = StObject.set(x, "get_displayName", js.Any.fromFunction0(value))
    
    inline def setGet_languageTag(value: () => String): Self = StObject.set(x, "get_languageTag", js.Any.fromFunction0(value))
    
    inline def setGet_lcid(value: () => Double): Self = StObject.set(x, "get_lcid", js.Any.fromFunction0(value))
  }
}
