package typings.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaderObjectValue
  extends StObject
     with ReaderArgument {
  
  val fields: js.Array[ReaderArgument]
  
  val kind: String
  
  // 'ObjectValue';
  val name: String
}
object ReaderObjectValue {
  
  inline def apply(fields: js.Array[ReaderArgument], kind: String, name: String): ReaderObjectValue = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderObjectValue]
  }
  
  extension [Self <: ReaderObjectValue](x: Self) {
    
    inline def setFields(value: js.Array[ReaderArgument]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: ReaderArgument*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
