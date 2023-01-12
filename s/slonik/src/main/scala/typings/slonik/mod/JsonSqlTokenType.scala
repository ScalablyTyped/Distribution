package typings.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonSqlTokenType
  extends StObject
     with _SqlTokenType {
  
  var `type`: js.Symbol
  
  var value: SerializableValueType
}
object JsonSqlTokenType {
  
  inline def apply(`type`: js.Symbol): JsonSqlTokenType = {
    val __obj = js.Dynamic.literal(value = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonSqlTokenType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonSqlTokenType] (val x: Self) extends AnyVal {
    
    inline def setType(value: js.Symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: SerializableValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
