package typings.relayTestUtils

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayMockPayloadGeneratorMod {
  
  @JSImport("relay-test-utils/lib/RelayMockPayloadGenerator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generate(operation: OperationDescriptor): GraphQLResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(operation.asInstanceOf[js.Any]).asInstanceOf[GraphQLResponse]
  inline def generate(operation: OperationDescriptor, mockResolvers: MockResolvers): GraphQLResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(operation.asInstanceOf[js.Any], mockResolvers.asInstanceOf[js.Any])).asInstanceOf[GraphQLResponse]
  
  type MockResolver = js.Function2[/* context */ MockResolverContext, /* generateId */ js.Function0[Double], js.Any]
  
  trait MockResolverContext extends StObject {
    
    var alias: js.UndefOr[String] = js.undefined
    
    var args: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var parentType: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[js.Array[String]] = js.undefined
  }
  object MockResolverContext {
    
    inline def apply(): MockResolverContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockResolverContext]
    }
    
    extension [Self <: MockResolverContext](x: Self) {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setArgs(value: StringDictionary[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParentType(value: String): Self = StObject.set(x, "parentType", value.asInstanceOf[js.Any])
      
      inline def setParentTypeUndefined: Self = StObject.set(x, "parentType", js.undefined)
      
      inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
    }
  }
  
  type MockResolvers = StringDictionary[MockResolver]
}
