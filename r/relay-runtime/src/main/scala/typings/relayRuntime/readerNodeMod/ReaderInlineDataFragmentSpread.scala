package typings.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaderInlineDataFragmentSpread
  extends StObject
     with ReaderSelection {
  
  val kind: String
  
  // 'InlineDataFragmentSpread';
  val name: String
  
  val selections: js.Array[ReaderSelection]
}
object ReaderInlineDataFragmentSpread {
  
  inline def apply(kind: String, name: String, selections: js.Array[ReaderSelection]): ReaderInlineDataFragmentSpread = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderInlineDataFragmentSpread]
  }
  
  extension [Self <: ReaderInlineDataFragmentSpread](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSelections(value: js.Array[ReaderSelection]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    inline def setSelectionsVarargs(value: ReaderSelection*): Self = StObject.set(x, "selections", js.Array(value*))
  }
}
