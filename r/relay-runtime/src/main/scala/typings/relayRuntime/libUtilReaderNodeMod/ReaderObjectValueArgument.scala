package typings.relayRuntime.libUtilReaderNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaderObjectValueArgument
  extends StObject
     with ReaderArgument {
  
  val fields: js.Array[ReaderArgument]
  
  val kind: String
  
  // 'ObjectValue';
  val name: String
}
object ReaderObjectValueArgument {
  
  inline def apply(fields: js.Array[ReaderArgument], kind: String, name: String): ReaderObjectValueArgument = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderObjectValueArgument]
  }
  
  extension [Self <: ReaderObjectValueArgument](x: Self) {
    
    inline def setFields(value: js.Array[ReaderArgument]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: ReaderArgument*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
