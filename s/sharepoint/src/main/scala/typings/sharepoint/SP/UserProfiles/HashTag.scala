package typings.sharepoint.SP.UserProfiles

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashTag
  extends StObject
     with ClientValueObject {
  
  def get_name(): String
  
  def get_useCount(): Double
}
object HashTag {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Unit,
    get_name: () => String,
    get_typeId: () => String,
    get_useCount: () => Double,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): HashTag = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_name = js.Any.fromFunction0(get_name), get_typeId = js.Any.fromFunction0(get_typeId), get_useCount = js.Any.fromFunction0(get_useCount), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[HashTag]
  }
  
  extension [Self <: HashTag](x: Self) {
    
    inline def setGet_name(value: () => String): Self = StObject.set(x, "get_name", js.Any.fromFunction0(value))
    
    inline def setGet_useCount(value: () => Double): Self = StObject.set(x, "get_useCount", js.Any.fromFunction0(value))
  }
}
