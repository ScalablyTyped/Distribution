package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserIdInfo
  extends StObject
     with ClientValueObject {
  
  def get_nameId(): String
  
  def get_nameIdIssuer(): String
}
object UserIdInfo {
  
  inline def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_nameId: () => String,
    get_nameIdIssuer: () => String,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): UserIdInfo = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_nameId = js.Any.fromFunction0(get_nameId), get_nameIdIssuer = js.Any.fromFunction0(get_nameIdIssuer), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[UserIdInfo]
  }
  
  extension [Self <: UserIdInfo](x: Self) {
    
    inline def setGet_nameId(value: () => String): Self = StObject.set(x, "get_nameId", js.Any.fromFunction0(value))
    
    inline def setGet_nameIdIssuer(value: () => String): Self = StObject.set(x, "get_nameIdIssuer", js.Any.fromFunction0(value))
  }
}
