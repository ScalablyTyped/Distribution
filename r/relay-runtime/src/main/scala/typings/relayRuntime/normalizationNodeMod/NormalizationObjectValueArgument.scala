package typings.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizationObjectValueArgument
  extends StObject
     with NormalizationArgument {
  
  val fields: js.Array[NormalizationArgument]
  
  val kind: String
  
  // "ObjectValue";
  val name: String
}
object NormalizationObjectValueArgument {
  
  inline def apply(fields: js.Array[NormalizationArgument], kind: String, name: String): NormalizationObjectValueArgument = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationObjectValueArgument]
  }
  
  extension [Self <: NormalizationObjectValueArgument](x: Self) {
    
    inline def setFields(value: js.Array[NormalizationArgument]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: NormalizationArgument*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
