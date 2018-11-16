package typings
package reactDashApolloLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo/graphql", JSImport.Namespace)
@js.native
object graphqlMod extends js.Object {
  def graphql[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](document: graphqlLib.languageAstMod.DocumentNode): js.Function1[
    /* WrappedComponent */ reactLib.reactMod.ReactNs.ComponentType[TChildProps with TProps], 
    reactLib.reactMod.ReactNs.ComponentClass[TProps, _]
  ] = js.native
  def graphql[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](
    document: graphqlLib.languageAstMod.DocumentNode,
    operationOptions: reactDashApolloLib.typesMod.OperationOption[TProps, TData, TGraphQLVariables, TChildProps]
  ): js.Function1[
    /* WrappedComponent */ reactLib.reactMod.ReactNs.ComponentType[TChildProps with TProps], 
    reactLib.reactMod.ReactNs.ComponentClass[TProps, _]
  ] = js.native
}

