package typings.relayRuntime.libUtilNormalizationNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.libUtilRelayConcreteNodeMod.GeneratedNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizationSplitOperation
  extends StObject
     with GeneratedNode
     with NormalizationNode
     with NormalizationRootNode
     with NormalizationSelectableNode {
  
  val argumentDefinitions: js.UndefOr[js.Array[NormalizationLocalArgumentDefinition]] = js.undefined
  
  val kind: String
  
  val metadata: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  // "SplitOperation";
  val name: String
  
  val selections: js.Array[NormalizationSelection]
}
object NormalizationSplitOperation {
  
  inline def apply(kind: String, name: String, selections: js.Array[NormalizationSelection]): NormalizationSplitOperation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationSplitOperation]
  }
  
  extension [Self <: NormalizationSplitOperation](x: Self) {
    
    inline def setArgumentDefinitions(value: js.Array[NormalizationLocalArgumentDefinition]): Self = StObject.set(x, "argumentDefinitions", value.asInstanceOf[js.Any])
    
    inline def setArgumentDefinitionsUndefined: Self = StObject.set(x, "argumentDefinitions", js.undefined)
    
    inline def setArgumentDefinitionsVarargs(value: NormalizationLocalArgumentDefinition*): Self = StObject.set(x, "argumentDefinitions", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: StringDictionary[Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSelections(value: js.Array[NormalizationSelection]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    inline def setSelectionsVarargs(value: NormalizationSelection*): Self = StObject.set(x, "selections", js.Array(value*))
  }
}
