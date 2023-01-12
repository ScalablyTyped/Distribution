package typings.relayRuntime.anon

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.libUtilRelayConcreteNodeMod.ProvidedVariablesType
import typings.relayRuntime.libUtilRelayConcreteNodeMod.RequestParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id
  extends StObject
     with RequestParameters {
  
  val id: String
  
  val metadata: StringDictionary[Any]
  
  // common fields
  val name: String
  
  val operationKind: String
  
  // 'mutation' | 'query' | 'subscription';
  val providedVariables: js.UndefOr[ProvidedVariablesType] = js.undefined
  
  val text: Null
}
object Id {
  
  inline def apply(id: String, metadata: StringDictionary[Any], name: String, operationKind: String, text: Null): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operationKind = operationKind.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: StringDictionary[Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOperationKind(value: String): Self = StObject.set(x, "operationKind", value.asInstanceOf[js.Any])
    
    inline def setProvidedVariables(value: ProvidedVariablesType): Self = StObject.set(x, "providedVariables", value.asInstanceOf[js.Any])
    
    inline def setProvidedVariablesUndefined: Self = StObject.set(x, "providedVariables", js.undefined)
    
    inline def setText(value: Null): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
