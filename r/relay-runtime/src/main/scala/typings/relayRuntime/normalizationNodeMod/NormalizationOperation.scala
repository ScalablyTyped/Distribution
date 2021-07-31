package typings.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizationOperation
  extends StObject
     with NormalizationSelectableNode {
  
  val argumentDefinitions: js.Array[NormalizationLocalArgumentDefinition]
  
  val kind: String
  
  // 'Operation';
  val name: String
  
  val selections: js.Array[NormalizationSelection]
}
object NormalizationOperation {
  
  @scala.inline
  def apply(
    argumentDefinitions: js.Array[NormalizationLocalArgumentDefinition],
    kind: String,
    name: String,
    selections: js.Array[NormalizationSelection]
  ): NormalizationOperation = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationOperation]
  }
  
  @scala.inline
  implicit class NormalizationOperationMutableBuilder[Self <: NormalizationOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgumentDefinitions(value: js.Array[NormalizationLocalArgumentDefinition]): Self = StObject.set(x, "argumentDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentDefinitionsVarargs(value: NormalizationLocalArgumentDefinition*): Self = StObject.set(x, "argumentDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelections(value: js.Array[NormalizationSelection]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionsVarargs(value: NormalizationSelection*): Self = StObject.set(x, "selections", js.Array(value :_*))
  }
}
