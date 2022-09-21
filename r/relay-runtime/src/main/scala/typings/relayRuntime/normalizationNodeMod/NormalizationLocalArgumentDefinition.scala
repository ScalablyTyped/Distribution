package typings.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizationLocalArgumentDefinition extends StObject {
  
  val defaultValue: Any
  
  val kind: String
  
  // "LocalArgument";
  val name: String
}
object NormalizationLocalArgumentDefinition {
  
  inline def apply(defaultValue: Any, kind: String, name: String): NormalizationLocalArgumentDefinition = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationLocalArgumentDefinition]
  }
  
  extension [Self <: NormalizationLocalArgumentDefinition](x: Self) {
    
    inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
