package typings.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizationClientExtension
  extends StObject
     with NormalizationSelection {
  
  var kind: String
  
  // 'ClientExtension';
  var selections: js.Array[NormalizationSelection]
}
object NormalizationClientExtension {
  
  @scala.inline
  def apply(kind: String, selections: js.Array[NormalizationSelection]): NormalizationClientExtension = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationClientExtension]
  }
  
  @scala.inline
  implicit class NormalizationClientExtensionMutableBuilder[Self <: NormalizationClientExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelections(value: js.Array[NormalizationSelection]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionsVarargs(value: NormalizationSelection*): Self = StObject.set(x, "selections", js.Array(value :_*))
  }
}
