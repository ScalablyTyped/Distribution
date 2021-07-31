package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataSource
  extends StObject
     with ClientValueObject {
  
  def get_properties(): js.Any
}
object ListDataSource {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_properties: () => js.Any,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ListDataSource = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_properties = js.Any.fromFunction0(get_properties), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ListDataSource]
  }
  
  @scala.inline
  implicit class ListDataSourceMutableBuilder[Self <: ListDataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_properties(value: () => js.Any): Self = StObject.set(x, "get_properties", js.Any.fromFunction0(value))
  }
}
