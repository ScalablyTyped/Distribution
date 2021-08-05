package typings.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaderSplitOperation
  extends StObject
     with ReaderSelectableNode {
  
  val kind: String
  
  val metadata: js.UndefOr[StringDictionary[js.Any] | Null] = js.undefined
  
  // 'SplitOperation';
  val name: String
  
  val selections: js.Array[ReaderSelection]
}
object ReaderSplitOperation {
  
  inline def apply(kind: String, name: String, selections: js.Array[ReaderSelection]): ReaderSplitOperation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderSplitOperation]
  }
  
  extension [Self <: ReaderSplitOperation](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: StringDictionary[js.Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSelections(value: js.Array[ReaderSelection]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    inline def setSelectionsVarargs(value: ReaderSelection*): Self = StObject.set(x, "selections", js.Array(value :_*))
  }
}
