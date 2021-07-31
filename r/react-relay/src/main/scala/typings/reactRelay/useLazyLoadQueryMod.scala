package typings.reactRelay

import typings.reactRelay.anon.FetchKey
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import typings.relayRuntime.relayRuntimeTypesMod.VariablesOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useLazyLoadQueryMod {
  
  @JSImport("react-relay/lib/relay-experimental/useLazyLoadQuery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useLazyLoadQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, variables: VariablesOf[TQuery]): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useLazyLoadQuery")(gqlQuery.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
  @scala.inline
  def useLazyLoadQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, variables: VariablesOf[TQuery], options: FetchKey): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useLazyLoadQuery")(gqlQuery.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
}
