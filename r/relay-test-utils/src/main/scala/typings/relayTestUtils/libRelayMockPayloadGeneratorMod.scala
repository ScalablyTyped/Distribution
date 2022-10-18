package typings.relayTestUtils

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.libNetworkRelayNetworkTypesMod.GraphQLSingularResponse
import typings.relayRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import typings.relayTestUtils.anon.MockClientData
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRelayMockPayloadGeneratorMod {
  
  @JSImport("relay-test-utils/lib/RelayMockPayloadGenerator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generate(operation: OperationDescriptor): GraphQLSingularResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(operation.asInstanceOf[js.Any]).asInstanceOf[GraphQLSingularResponse]
  inline def generate(operation: OperationDescriptor, mockResolvers: Null, options: MockClientData): GraphQLSingularResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(operation.asInstanceOf[js.Any], mockResolvers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GraphQLSingularResponse]
  inline def generate(operation: OperationDescriptor, mockResolvers: Unit, options: MockClientData): GraphQLSingularResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(operation.asInstanceOf[js.Any], mockResolvers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GraphQLSingularResponse]
  inline def generate(operation: OperationDescriptor, mockResolvers: MockResolvers): GraphQLSingularResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(operation.asInstanceOf[js.Any], mockResolvers.asInstanceOf[js.Any])).asInstanceOf[GraphQLSingularResponse]
  inline def generate(operation: OperationDescriptor, mockResolvers: MockResolvers, options: MockClientData): GraphQLSingularResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(operation.asInstanceOf[js.Any], mockResolvers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GraphQLSingularResponse]
  
  type MockResolver = js.Function2[/* context */ MockResolverContext, /* generateId */ js.Function0[Double], Any]
  
  trait MockResolverContext extends StObject {
    
    val alias: js.UndefOr[String | Null] = js.undefined
    
    val args: js.UndefOr[(Record[String, Any]) | Null] = js.undefined
    
    val name: js.UndefOr[String | Null] = js.undefined
    
    val parentType: js.UndefOr[String | Null] = js.undefined
    
    val path: js.UndefOr[js.Array[String] | Null] = js.undefined
  }
  object MockResolverContext {
    
    inline def apply(): MockResolverContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockResolverContext]
    }
    
    extension [Self <: MockResolverContext](x: Self) {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasNull: Self = StObject.set(x, "alias", null)
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setArgs(value: Record[String, Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsNull: Self = StObject.set(x, "args", null)
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParentType(value: String): Self = StObject.set(x, "parentType", value.asInstanceOf[js.Any])
      
      inline def setParentTypeNull: Self = StObject.set(x, "parentType", null)
      
      inline def setParentTypeUndefined: Self = StObject.set(x, "parentType", js.undefined)
      
      inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathNull: Self = StObject.set(x, "path", null)
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
  
  type MockResolvers = StringDictionary[MockResolver]
}
