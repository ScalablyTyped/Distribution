package typings.sharepoint.SP.Publishing

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.Guid
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DesignPackageInfo
  extends StObject
     with ClientValueObject {
  
  def get_majorVersion(): Double
  
  def get_minorVersion(): Double
  
  def get_packageGuid(): Guid
  
  def get_packageName(): String
  
  def set_majorVersion(value: Double): Double
  
  def set_minorVersion(value: Double): Double
  
  def set_packageGuid(value: Guid): Guid
  
  def set_packageName(value: String): String
}
object DesignPackageInfo {
  
  inline def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_majorVersion: () => Double,
    get_minorVersion: () => Double,
    get_packageGuid: () => Guid,
    get_packageName: () => String,
    get_typeId: () => String,
    set_majorVersion: Double => Double,
    set_minorVersion: Double => Double,
    set_packageGuid: Guid => Guid,
    set_packageName: String => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): DesignPackageInfo = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_majorVersion = js.Any.fromFunction0(get_majorVersion), get_minorVersion = js.Any.fromFunction0(get_minorVersion), get_packageGuid = js.Any.fromFunction0(get_packageGuid), get_packageName = js.Any.fromFunction0(get_packageName), get_typeId = js.Any.fromFunction0(get_typeId), set_majorVersion = js.Any.fromFunction1(set_majorVersion), set_minorVersion = js.Any.fromFunction1(set_minorVersion), set_packageGuid = js.Any.fromFunction1(set_packageGuid), set_packageName = js.Any.fromFunction1(set_packageName), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[DesignPackageInfo]
  }
  
  extension [Self <: DesignPackageInfo](x: Self) {
    
    inline def setGet_majorVersion(value: () => Double): Self = StObject.set(x, "get_majorVersion", js.Any.fromFunction0(value))
    
    inline def setGet_minorVersion(value: () => Double): Self = StObject.set(x, "get_minorVersion", js.Any.fromFunction0(value))
    
    inline def setGet_packageGuid(value: () => Guid): Self = StObject.set(x, "get_packageGuid", js.Any.fromFunction0(value))
    
    inline def setGet_packageName(value: () => String): Self = StObject.set(x, "get_packageName", js.Any.fromFunction0(value))
    
    inline def setSet_majorVersion(value: Double => Double): Self = StObject.set(x, "set_majorVersion", js.Any.fromFunction1(value))
    
    inline def setSet_minorVersion(value: Double => Double): Self = StObject.set(x, "set_minorVersion", js.Any.fromFunction1(value))
    
    inline def setSet_packageGuid(value: Guid => Guid): Self = StObject.set(x, "set_packageGuid", js.Any.fromFunction1(value))
    
    inline def setSet_packageName(value: String => String): Self = StObject.set(x, "set_packageName", js.Any.fromFunction1(value))
  }
}
