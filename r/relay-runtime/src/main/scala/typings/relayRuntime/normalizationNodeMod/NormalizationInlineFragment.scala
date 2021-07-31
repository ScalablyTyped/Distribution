package typings.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizationInlineFragment
  extends StObject
     with NormalizationSelection {
  
  val kind: String
  
  // 'InlineFragment';
  val selections: js.Array[NormalizationSelection]
  
  val `type`: String
}
object NormalizationInlineFragment {
  
  @scala.inline
  def apply(kind: String, selections: js.Array[NormalizationSelection], `type`: String): NormalizationInlineFragment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationInlineFragment]
  }
  
  @scala.inline
  implicit class NormalizationInlineFragmentMutableBuilder[Self <: NormalizationInlineFragment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelections(value: js.Array[NormalizationSelection]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionsVarargs(value: NormalizationSelection*): Self = StObject.set(x, "selections", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
