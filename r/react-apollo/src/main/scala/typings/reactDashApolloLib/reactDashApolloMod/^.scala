package typings
package reactDashApolloLib.reactDashApolloMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ApolloConsumer: reactLib.reactMod.StatelessComponent[reactDashApolloLib.apolloConsumerMod.ApolloConsumerProps] = js.native
  val ApolloContext: reactLib.reactMod.Context[js.UndefOr[reactDashApolloLib.apolloContextMod.ApolloContextValue]] | scala.Null = js.native
  def compose(funcs: js.Function*): js.Function1[/* repeated */ js.Any, _] = js.native
  def getDataFromTree(tree: reactLib.reactMod.ReactNode): js.Promise[java.lang.String] = js.native
  def getDataFromTree(tree: reactLib.reactMod.ReactNode, context: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Promise[java.lang.String] = js.native
  def getMarkupFromTree(hasTreeContextRenderFunction: reactDashApolloLib.getDataFromTreeMod.GetMarkupFromTreeOptions): js.Promise[java.lang.String] = js.native
  def graphql[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](document: graphqlLib.languageAstMod.DocumentNode): js.Function1[
    /* WrappedComponent */ reactLib.reactMod.ComponentType[TProps with TChildProps], 
    reactLib.reactMod.ComponentClass[TProps, _]
  ] = js.native
  def graphql[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](
    document: graphqlLib.languageAstMod.DocumentNode,
    operationOptions: reactDashApolloLib.typesMod.OperationOption[TProps, TData, TGraphQLVariables, TChildProps]
  ): js.Function1[
    /* WrappedComponent */ reactLib.reactMod.ComponentType[TProps with TChildProps], 
    reactLib.reactMod.ComponentClass[TProps, _]
  ] = js.native
  def renderToStringWithData(component: reactLib.reactMod.ReactElement): js.Promise[java.lang.String] = js.native
  def withApollo[TProps, TResult](
    WrappedComponent: reactLib.reactMod.ComponentType[reactDashApolloLib.withApolloMod.WithApolloClient[TProps]]
  ): reactLib.reactMod.ComponentClass[TProps, reactLib.reactMod.ComponentState] = js.native
  def withApollo[TProps, TResult](
    WrappedComponent: reactLib.reactMod.ComponentType[reactDashApolloLib.withApolloMod.WithApolloClient[TProps]],
    operationOptions: reactDashApolloLib.typesMod.OperationOption[
      TProps, 
      TResult, 
      reactDashApolloLib.typesMod.OperationVariables, 
      reactDashApolloLib.typesMod.ChildProps[TProps, TResult, reactDashApolloLib.typesMod.OperationVariables]
    ]
  ): reactLib.reactMod.ComponentClass[TProps, reactLib.reactMod.ComponentState] = js.native
  def withMutation[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](document: graphqlLib.languageAstMod.DocumentNode): js.Function1[
    /* WrappedComponent */ reactLib.reactMod.ComponentType[TProps with TChildProps], 
    reactLib.reactMod.ComponentClass[TProps, _]
  ] = js.native
  def withMutation[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](
    document: graphqlLib.languageAstMod.DocumentNode,
    operationOptions: reactDashApolloLib.typesMod.OperationOption[TProps, TData, TGraphQLVariables, TChildProps]
  ): js.Function1[
    /* WrappedComponent */ reactLib.reactMod.ComponentType[TProps with TChildProps], 
    reactLib.reactMod.ComponentClass[TProps, _]
  ] = js.native
  def withQuery[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](document: graphqlLib.languageAstMod.DocumentNode): js.Function1[
    /* WrappedComponent */ reactLib.reactMod.ComponentType[TProps with TChildProps], 
    reactLib.reactMod.ComponentClass[TProps, _]
  ] = js.native
  def withQuery[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](
    document: graphqlLib.languageAstMod.DocumentNode,
    operationOptions: reactDashApolloLib.typesMod.OperationOption[TProps, TData, TGraphQLVariables, TChildProps]
  ): js.Function1[
    /* WrappedComponent */ reactLib.reactMod.ComponentType[TProps with TChildProps], 
    reactLib.reactMod.ComponentClass[TProps, _]
  ] = js.native
  def withSubscription[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](document: graphqlLib.languageAstMod.DocumentNode): js.Function1[
    /* WrappedComponent */ reactLib.reactMod.ComponentType[TProps with TChildProps], 
    reactLib.reactMod.ComponentClass[TProps, _]
  ] = js.native
  def withSubscription[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](
    document: graphqlLib.languageAstMod.DocumentNode,
    operationOptions: reactDashApolloLib.typesMod.OperationOption[TProps, TData, TGraphQLVariables, TChildProps]
  ): js.Function1[
    /* WrappedComponent */ reactLib.reactMod.ComponentType[TProps with TChildProps], 
    reactLib.reactMod.ComponentClass[TProps, _]
  ] = js.native
}

