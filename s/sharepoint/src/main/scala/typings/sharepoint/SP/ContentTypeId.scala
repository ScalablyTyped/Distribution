package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentTypeId extends ClientValueObject {
  
  def get_stringValue(): String = js.native
}
object ContentTypeId {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_stringValue: () => String,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ContentTypeId = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_stringValue = js.Any.fromFunction0(get_stringValue), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ContentTypeId]
  }
  
  @scala.inline
  implicit class ContentTypeIdMutableBuilder[Self <: ContentTypeId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_stringValue(value: () => String): Self = StObject.set(x, "get_stringValue", js.Any.fromFunction0(value))
  }
}
