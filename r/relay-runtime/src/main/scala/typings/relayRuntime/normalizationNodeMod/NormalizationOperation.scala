package typings.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizationOperation
  extends StObject
     with NormalizationNode
     with NormalizationSelectableNode {
  
  val argumentDefinitions: js.Array[NormalizationLocalArgumentDefinition]
  
  val clientAbstractTypes: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  
  val kind: String
  
  // "Operation";
  val name: String
  
  val selections: js.Array[NormalizationSelection]
}
object NormalizationOperation {
  
  inline def apply(
    argumentDefinitions: js.Array[NormalizationLocalArgumentDefinition],
    kind: String,
    name: String,
    selections: js.Array[NormalizationSelection]
  ): NormalizationOperation = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationOperation]
  }
  
  extension [Self <: NormalizationOperation](x: Self) {
    
    inline def setArgumentDefinitions(value: js.Array[NormalizationLocalArgumentDefinition]): Self = StObject.set(x, "argumentDefinitions", value.asInstanceOf[js.Any])
    
    inline def setArgumentDefinitionsVarargs(value: NormalizationLocalArgumentDefinition*): Self = StObject.set(x, "argumentDefinitions", js.Array(value*))
    
    inline def setClientAbstractTypes(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "clientAbstractTypes", value.asInstanceOf[js.Any])
    
    inline def setClientAbstractTypesUndefined: Self = StObject.set(x, "clientAbstractTypes", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSelections(value: js.Array[NormalizationSelection]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    inline def setSelectionsVarargs(value: NormalizationSelection*): Self = StObject.set(x, "selections", js.Array(value*))
  }
}
