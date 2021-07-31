package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppLicense
  extends StObject
     with ClientValueObject {
  
  def get_rawXMLLicenseToken(): String
}
object AppLicense {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_rawXMLLicenseToken: () => String,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): AppLicense = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_rawXMLLicenseToken = js.Any.fromFunction0(get_rawXMLLicenseToken), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[AppLicense]
  }
  
  @scala.inline
  implicit class AppLicenseMutableBuilder[Self <: AppLicense] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_rawXMLLicenseToken(value: () => String): Self = StObject.set(x, "get_rawXMLLicenseToken", js.Any.fromFunction0(value))
  }
}
