package typings.relayRuntime.libUtilReaderNodeMod

import typings.relayRuntime.anon.Connection
import typings.relayRuntime.libQueryRelayModernGraphQLTagMod._GraphQLTaggedNode
import typings.relayRuntime.libUtilRelayConcreteNodeMod.GeneratedNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaderFragment
  extends StObject
     with GeneratedNode
     with ReaderNode
     with _GraphQLTaggedNode {
  
  val abstractKey: js.UndefOr[String | Null] = js.undefined
  
  val argumentDefinitions: js.Array[ReaderArgumentDefinition]
  
  val kind: String
  
  val metadata: js.UndefOr[Connection | Null] = js.undefined
  
  // 'Fragment';
  val name: String
  
  val selections: js.Array[ReaderSelection]
  
  val `type`: String
}
object ReaderFragment {
  
  inline def apply(
    argumentDefinitions: js.Array[ReaderArgumentDefinition],
    kind: String,
    name: String,
    selections: js.Array[ReaderSelection],
    `type`: String
  ): ReaderFragment = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderFragment]
  }
  
  extension [Self <: ReaderFragment](x: Self) {
    
    inline def setAbstractKey(value: String): Self = StObject.set(x, "abstractKey", value.asInstanceOf[js.Any])
    
    inline def setAbstractKeyNull: Self = StObject.set(x, "abstractKey", null)
    
    inline def setAbstractKeyUndefined: Self = StObject.set(x, "abstractKey", js.undefined)
    
    inline def setArgumentDefinitions(value: js.Array[ReaderArgumentDefinition]): Self = StObject.set(x, "argumentDefinitions", value.asInstanceOf[js.Any])
    
    inline def setArgumentDefinitionsVarargs(value: ReaderArgumentDefinition*): Self = StObject.set(x, "argumentDefinitions", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Connection): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSelections(value: js.Array[ReaderSelection]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    inline def setSelectionsVarargs(value: ReaderSelection*): Self = StObject.set(x, "selections", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
