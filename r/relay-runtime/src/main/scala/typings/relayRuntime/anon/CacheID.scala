package typings.relayRuntime.anon

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.relayConcreteNodeMod.ProvidedVariablesType
import typings.relayRuntime.relayConcreteNodeMod.RequestParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheID
  extends StObject
     with RequestParameters {
  
  val cacheID: String
  
  val id: Null
  
  val metadata: StringDictionary[Any]
  
  // common fields
  val name: String
  
  val operationKind: String
  
  // 'mutation' | 'query' | 'subscription';
  val providedVariables: js.UndefOr[ProvidedVariablesType] = js.undefined
  
  val text: String | Null
}
object CacheID {
  
  inline def apply(cacheID: String, id: Null, metadata: StringDictionary[Any], name: String, operationKind: String): CacheID = {
    val __obj = js.Dynamic.literal(cacheID = cacheID.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operationKind = operationKind.asInstanceOf[js.Any], text = null)
    __obj.asInstanceOf[CacheID]
  }
  
  extension [Self <: CacheID](x: Self) {
    
    inline def setCacheID(value: String): Self = StObject.set(x, "cacheID", value.asInstanceOf[js.Any])
    
    inline def setId(value: Null): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: StringDictionary[Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOperationKind(value: String): Self = StObject.set(x, "operationKind", value.asInstanceOf[js.Any])
    
    inline def setProvidedVariables(value: ProvidedVariablesType): Self = StObject.set(x, "providedVariables", value.asInstanceOf[js.Any])
    
    inline def setProvidedVariablesUndefined: Self = StObject.set(x, "providedVariables", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
  }
}
