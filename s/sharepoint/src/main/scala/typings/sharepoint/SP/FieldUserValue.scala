package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldUserValue
  extends StObject
     with FieldLookupValue
object FieldUserValue {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Unit,
    get_lookupId: () => Double,
    get_lookupValue: () => String,
    get_typeId: () => String,
    set_lookupId: Double => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): FieldUserValue = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_lookupId = js.Any.fromFunction0(get_lookupId), get_lookupValue = js.Any.fromFunction0(get_lookupValue), get_typeId = js.Any.fromFunction0(get_typeId), set_lookupId = js.Any.fromFunction1(set_lookupId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[FieldUserValue]
  }
}
