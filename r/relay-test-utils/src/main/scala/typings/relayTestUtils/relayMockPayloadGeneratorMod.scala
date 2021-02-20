package typings.relayTestUtils

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayMockPayloadGeneratorMod {
  
  @JSImport("relay-test-utils/lib/RelayMockPayloadGenerator", "generate")
  @js.native
  def generate(operation: OperationDescriptor): GraphQLResponse = js.native
  @JSImport("relay-test-utils/lib/RelayMockPayloadGenerator", "generate")
  @js.native
  def generate(operation: OperationDescriptor, mockResolvers: MockResolvers): GraphQLResponse = js.native
  
  type MockResolver = js.Function2[/* context */ MockResolverContext, /* generateId */ js.Function0[Double], js.Any]
  
  @js.native
  trait MockResolverContext extends StObject {
    
    var alias: js.UndefOr[String] = js.native
    
    var args: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var parentType: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[js.Array[String]] = js.native
  }
  object MockResolverContext {
    
    @scala.inline
    def apply(): MockResolverContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockResolverContext]
    }
    
    @scala.inline
    implicit class MockResolverContextMutableBuilder[Self <: MockResolverContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setArgs(value: StringDictionary[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParentType(value: String): Self = StObject.set(x, "parentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentTypeUndefined: Self = StObject.set(x, "parentType", js.undefined)
      
      @scala.inline
      def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
    }
  }
  
  type MockResolvers = StringDictionary[MockResolver]
}
