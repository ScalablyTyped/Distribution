package typings.sharepoint.SP

import typings.sharepoint.IEnumerable
import typings.sharepoint.IEnumerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientValueObjectCollection[T]
  extends StObject
     with ClientValueObject
     with IEnumerable[T] {
  
  def get_count(): Double
}
object ClientValueObjectCollection {
  
  @scala.inline
  def apply[T](
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    getEnumerator: () => IEnumerator[T],
    get_count: () => Double,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ClientValueObjectCollection[T] = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), getEnumerator = js.Any.fromFunction0(getEnumerator), get_count = js.Any.fromFunction0(get_count), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ClientValueObjectCollection[T]]
  }
  
  @scala.inline
  implicit class ClientValueObjectCollectionMutableBuilder[Self <: ClientValueObjectCollection[?], T] (val x: Self & ClientValueObjectCollection[T]) extends AnyVal {
    
    @scala.inline
    def setGet_count(value: () => Double): Self = StObject.set(x, "get_count", js.Any.fromFunction0(value))
  }
}
