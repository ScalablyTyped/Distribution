package typings
package reactDashApolloLib.browserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo/browser", JSImport.Namespace)
@js.native
object browserModMembers extends js.Object {
  val ApolloConsumer: reactLib.reactMod.ReactNs.StatelessComponent[reactDashApolloLib.apolloconsumerMod.ApolloConsumerProps] = js.native
  val compose: js.Any = js.native
  def getDataFromTree(rootElement: reactLib.reactMod.ReactNs.ReactNode): stdLib.Promise[_] = js.native
  def getDataFromTree(rootElement: reactLib.reactMod.ReactNs.ReactNode, rootContext: js.Any): stdLib.Promise[_] = js.native
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
  def walkTree(
    element: reactLib.reactMod.ReactNs.ReactNode,
    context: reactDashApolloLib.getDataFromTreeMod.Context,
    visitor: js.Function5[
      /* element */ reactLib.reactMod.ReactNs.ReactNode, 
      /* instance */ (reactLib.reactMod.Component[_, js.Object, _]) | scala.Null, 
      /* newContextMap */ lodashLib.lodashMod.Global.Map[_, _], 
      /* context */ reactDashApolloLib.getDataFromTreeMod.Context, 
      /* childContext */ js.UndefOr[reactDashApolloLib.getDataFromTreeMod.Context], 
      scala.Boolean | scala.Unit
    ]
  ): scala.Unit = js.native
  def walkTree(
    element: reactLib.reactMod.ReactNs.ReactNode,
    context: reactDashApolloLib.getDataFromTreeMod.Context,
    visitor: js.Function5[
      /* element */ reactLib.reactMod.ReactNs.ReactNode, 
      /* instance */ (reactLib.reactMod.Component[_, js.Object, _]) | scala.Null, 
      /* newContextMap */ lodashLib.lodashMod.Global.Map[_, _], 
      /* context */ reactDashApolloLib.getDataFromTreeMod.Context, 
      /* childContext */ js.UndefOr[reactDashApolloLib.getDataFromTreeMod.Context], 
      scala.Boolean | scala.Unit
    ],
    newContext: lodashLib.lodashMod.Global.Map[_, _]
  ): scala.Unit = js.native
  def withApollo[TProps, TResult](
    WrappedComponent: reactLib.reactMod.ReactNs.ComponentType[reactDashApolloLib.withApolloMod.WithApolloClient[TProps]]
  ): reactLib.reactMod.ReactNs.ComponentClass[TProps, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def withApollo[TProps, TResult](
    WrappedComponent: reactLib.reactMod.ReactNs.ComponentType[reactDashApolloLib.withApolloMod.WithApolloClient[TProps]],
    operationOptions: reactDashApolloLib.typesMod.OperationOption[
      TProps, 
      TResult, 
      reactDashApolloLib.typesMod.OperationVariables, 
      reactDashApolloLib.typesMod.ChildProps[TProps, TResult, reactDashApolloLib.typesMod.OperationVariables]
    ]
  ): reactLib.reactMod.ReactNs.ComponentClass[TProps, reactLib.reactMod.ReactNs.ComponentState] = js.native
}

