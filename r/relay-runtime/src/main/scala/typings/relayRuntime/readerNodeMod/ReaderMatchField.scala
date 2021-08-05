package typings.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.anon.FragmentName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.relayRuntime.readerNodeMod.ReaderSelection because Already inherited */ trait ReaderMatchField
  extends StObject
     with ReaderField {
  
  // 'MatchField';
  val alias: js.UndefOr[String | Null] = js.undefined
  
  val args: js.UndefOr[js.Array[ReaderArgument] | Null] = js.undefined
  
  val kind: String
  
  val matchesByType: StringDictionary[FragmentName]
  
  val name: String
  
  val storageKey: js.UndefOr[String | Null] = js.undefined
}
object ReaderMatchField {
  
  inline def apply(kind: String, matchesByType: StringDictionary[FragmentName], name: String): ReaderMatchField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], matchesByType = matchesByType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderMatchField]
  }
  
  extension [Self <: ReaderMatchField](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasNull: Self = StObject.set(x, "alias", null)
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setArgs(value: js.Array[ReaderArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsNull: Self = StObject.set(x, "args", null)
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: ReaderArgument*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMatchesByType(value: StringDictionary[FragmentName]): Self = StObject.set(x, "matchesByType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
    
    inline def setStorageKeyNull: Self = StObject.set(x, "storageKey", null)
    
    inline def setStorageKeyUndefined: Self = StObject.set(x, "storageKey", js.undefined)
  }
}
