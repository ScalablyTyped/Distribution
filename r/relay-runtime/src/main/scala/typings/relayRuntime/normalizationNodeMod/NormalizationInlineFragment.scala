package typings.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizationInlineFragment
  extends StObject
     with NormalizationNode
     with NormalizationSelection {
  
  val abstractKey: js.UndefOr[String | Null] = js.undefined
  
  val kind: String
  
  // "InlineFragment";
  val selections: js.Array[NormalizationSelection]
  
  val `type`: String
}
object NormalizationInlineFragment {
  
  inline def apply(kind: String, selections: js.Array[NormalizationSelection], `type`: String): NormalizationInlineFragment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationInlineFragment]
  }
  
  extension [Self <: NormalizationInlineFragment](x: Self) {
    
    inline def setAbstractKey(value: String): Self = StObject.set(x, "abstractKey", value.asInstanceOf[js.Any])
    
    inline def setAbstractKeyNull: Self = StObject.set(x, "abstractKey", null)
    
    inline def setAbstractKeyUndefined: Self = StObject.set(x, "abstractKey", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setSelections(value: js.Array[NormalizationSelection]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    inline def setSelectionsVarargs(value: NormalizationSelection*): Self = StObject.set(x, "selections", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
