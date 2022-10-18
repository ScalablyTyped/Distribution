package typings.relayRuntime.libUtilNormalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizationListValueArgument
  extends StObject
     with NormalizationArgument {
  
  val items: js.Array[NormalizationArgument | Null]
  
  val kind: String
  
  // "ListValue";
  val name: String
}
object NormalizationListValueArgument {
  
  inline def apply(items: js.Array[NormalizationArgument | Null], kind: String, name: String): NormalizationListValueArgument = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationListValueArgument]
  }
  
  extension [Self <: NormalizationListValueArgument](x: Self) {
    
    inline def setItems(value: js.Array[NormalizationArgument | Null]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: (NormalizationArgument | Null)*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
