package typings.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaderLinkedField
  extends StObject
     with ReaderField {
  
  // 'LinkedField';
  val alias: js.UndefOr[String | Null] = js.undefined
  
  val args: js.Array[ReaderArgument]
  
  val concreteType: js.UndefOr[String | Null] = js.undefined
  
  val kind: String
  
  val name: String
  
  val plural: Boolean
  
  val selections: js.Array[ReaderSelection]
  
  val storageKey: js.UndefOr[String | Null] = js.undefined
}
object ReaderLinkedField {
  
  inline def apply(
    args: js.Array[ReaderArgument],
    kind: String,
    name: String,
    plural: Boolean,
    selections: js.Array[ReaderSelection]
  ): ReaderLinkedField = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderLinkedField]
  }
  
  extension [Self <: ReaderLinkedField](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasNull: Self = StObject.set(x, "alias", null)
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setArgs(value: js.Array[ReaderArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: ReaderArgument*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    inline def setConcreteType(value: String): Self = StObject.set(x, "concreteType", value.asInstanceOf[js.Any])
    
    inline def setConcreteTypeNull: Self = StObject.set(x, "concreteType", null)
    
    inline def setConcreteTypeUndefined: Self = StObject.set(x, "concreteType", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPlural(value: Boolean): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
    
    inline def setSelections(value: js.Array[ReaderSelection]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    inline def setSelectionsVarargs(value: ReaderSelection*): Self = StObject.set(x, "selections", js.Array(value :_*))
    
    inline def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
    
    inline def setStorageKeyNull: Self = StObject.set(x, "storageKey", null)
    
    inline def setStorageKeyUndefined: Self = StObject.set(x, "storageKey", js.undefined)
  }
}
