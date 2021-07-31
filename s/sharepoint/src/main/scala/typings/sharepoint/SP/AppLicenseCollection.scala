package typings.sharepoint.SP

import typings.sharepoint.IEnumerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppLicenseCollection
  extends StObject
     with ClientValueObjectCollection[AppLicense] {
  
  def add(item: AppLicense): Unit
  
  def get_item(index: Double): AppLicense
}
object AppLicenseCollection {
  
  @scala.inline
  def apply(
    add: AppLicense => Unit,
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    getEnumerator: () => IEnumerator[AppLicense],
    get_count: () => Double,
    get_item: Double => AppLicense,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): AppLicenseCollection = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), getEnumerator = js.Any.fromFunction0(getEnumerator), get_count = js.Any.fromFunction0(get_count), get_item = js.Any.fromFunction1(get_item), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[AppLicenseCollection]
  }
  
  @scala.inline
  implicit class AppLicenseCollectionMutableBuilder[Self <: AppLicenseCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: AppLicense => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet_item(value: Double => AppLicense): Self = StObject.set(x, "get_item", js.Any.fromFunction1(value))
  }
}
