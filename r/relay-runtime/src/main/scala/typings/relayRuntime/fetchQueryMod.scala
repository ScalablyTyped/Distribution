package typings.relayRuntime

import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayRuntimeTypesMod.CacheConfig
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import typings.relayRuntime.relayStoreTypesMod.Environment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fetchQueryMod {
  
  @JSImport("relay-runtime/lib/query/fetchQuery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fetchQuery_variables[T /* <: OperationType */](
    environment: Environment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: T['variables'] */ js.Any
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchQuery")(environment.asInstanceOf[js.Any], taggedNode.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ]]
  @scala.inline
  def fetchQuery_variables[T /* <: OperationType */](
    environment: Environment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: T['variables'] */ js.Any,
    cacheConfig: CacheConfig
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchQuery")(environment.asInstanceOf[js.Any], taggedNode.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], cacheConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ]]
}
