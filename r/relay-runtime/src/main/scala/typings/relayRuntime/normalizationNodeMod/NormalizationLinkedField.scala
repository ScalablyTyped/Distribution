package typings.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizationLinkedField
  extends StObject
     with NormalizationField
     with NormalizationNode
     with NormalizationSelectableNode {
  
  // "LinkedField";
  val alias: js.UndefOr[String | Null] = js.undefined
  
  val args: js.UndefOr[js.Array[NormalizationArgument] | Null] = js.undefined
  
  val concreteType: js.UndefOr[String | Null] = js.undefined
  
  val kind: String
  
  val name: String
  
  val plural: Boolean
  
  val selections: js.Array[NormalizationSelection]
  
  val storageKey: js.UndefOr[String | Null] = js.undefined
}
object NormalizationLinkedField {
  
  inline def apply(kind: String, name: String, plural: Boolean, selections: js.Array[NormalizationSelection]): NormalizationLinkedField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationLinkedField]
  }
  
  extension [Self <: NormalizationLinkedField](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasNull: Self = StObject.set(x, "alias", null)
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setArgs(value: js.Array[NormalizationArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsNull: Self = StObject.set(x, "args", null)
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: NormalizationArgument*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setConcreteType(value: String): Self = StObject.set(x, "concreteType", value.asInstanceOf[js.Any])
    
    inline def setConcreteTypeNull: Self = StObject.set(x, "concreteType", null)
    
    inline def setConcreteTypeUndefined: Self = StObject.set(x, "concreteType", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPlural(value: Boolean): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
    
    inline def setSelections(value: js.Array[NormalizationSelection]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    inline def setSelectionsVarargs(value: NormalizationSelection*): Self = StObject.set(x, "selections", js.Array(value*))
    
    inline def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
    
    inline def setStorageKeyNull: Self = StObject.set(x, "storageKey", null)
    
    inline def setStorageKeyUndefined: Self = StObject.set(x, "storageKey", js.undefined)
  }
}
