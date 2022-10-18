package typings.relayRuntime.libUtilNormalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizationScalarField
  extends StObject
     with NormalizationField {
  
  // "ScalarField";
  val alias: js.UndefOr[String | Null] = js.undefined
  
  val args: js.UndefOr[js.Array[NormalizationArgument] | Null] = js.undefined
  
  val kind: String
  
  val name: String
  
  val storageKey: js.UndefOr[String | Null] = js.undefined
}
object NormalizationScalarField {
  
  inline def apply(kind: String, name: String): NormalizationScalarField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationScalarField]
  }
  
  extension [Self <: NormalizationScalarField](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasNull: Self = StObject.set(x, "alias", null)
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setArgs(value: js.Array[NormalizationArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsNull: Self = StObject.set(x, "args", null)
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: NormalizationArgument*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
    
    inline def setStorageKeyNull: Self = StObject.set(x, "storageKey", null)
    
    inline def setStorageKeyUndefined: Self = StObject.set(x, "storageKey", js.undefined)
  }
}
