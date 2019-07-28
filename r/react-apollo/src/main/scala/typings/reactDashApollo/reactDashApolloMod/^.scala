package typings.reactDashApollo.reactDashApolloMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageAstMod.DocumentNode
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.Context
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.react.reactMod.StatelessComponent
import typings.reactDashApollo.apolloConsumerMod.ApolloConsumerProps
import typings.reactDashApollo.apolloContextMod.ApolloContextValue
import typings.reactDashApollo.getDataFromTreeMod.GetMarkupFromTreeOptions
import typings.reactDashApollo.typesMod.ChildProps
import typings.reactDashApollo.typesMod.OperationOption
import typings.reactDashApollo.typesMod.OperationVariables
import typings.reactDashApollo.withApolloMod.WithApolloClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ApolloConsumer: StatelessComponent[ApolloConsumerProps] = js.native
  val ApolloContext: Context[js.UndefOr[ApolloContextValue]] = js.native
  def compose(funcs: js.Function*): js.Function1[/* repeated */ js.Any, _] = js.native
  def getDataFromTree(tree: ReactNode): js.Promise[String] = js.native
  def getDataFromTree(tree: ReactNode, context: StringDictionary[js.Any]): js.Promise[String] = js.native
  def getMarkupFromTree(hasTreeContextRenderFunction: GetMarkupFromTreeOptions): js.Promise[String] = js.native
  def graphql[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](document: DocumentNode): js.Function1[
    /* WrappedComponent */ ComponentType[TProps with TChildProps], 
    ComponentClass[TProps, _]
  ] = js.native
  def graphql[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](
    document: DocumentNode,
    operationOptions: OperationOption[TProps, TData, TGraphQLVariables, TChildProps]
  ): js.Function1[
    /* WrappedComponent */ ComponentType[TProps with TChildProps], 
    ComponentClass[TProps, _]
  ] = js.native
  def renderToStringWithData(component: ReactElement): js.Promise[String] = js.native
  def withApollo[TProps, TResult](WrappedComponent: ComponentType[WithApolloClient[TProps]]): ComponentClass[TProps, ComponentState] = js.native
  def withApollo[TProps, TResult](
    WrappedComponent: ComponentType[WithApolloClient[TProps]],
    operationOptions: OperationOption[TProps, TResult, OperationVariables, ChildProps[TProps, TResult, OperationVariables]]
  ): ComponentClass[TProps, ComponentState] = js.native
  def withMutation[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](document: DocumentNode): js.Function1[
    /* WrappedComponent */ ComponentType[TProps with TChildProps], 
    ComponentClass[TProps, _]
  ] = js.native
  def withMutation[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](
    document: DocumentNode,
    operationOptions: OperationOption[TProps, TData, TGraphQLVariables, TChildProps]
  ): js.Function1[
    /* WrappedComponent */ ComponentType[TProps with TChildProps], 
    ComponentClass[TProps, _]
  ] = js.native
  def withQuery[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](document: DocumentNode): js.Function1[
    /* WrappedComponent */ ComponentType[TProps with TChildProps], 
    ComponentClass[TProps, _]
  ] = js.native
  def withQuery[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](
    document: DocumentNode,
    operationOptions: OperationOption[TProps, TData, TGraphQLVariables, TChildProps]
  ): js.Function1[
    /* WrappedComponent */ ComponentType[TProps with TChildProps], 
    ComponentClass[TProps, _]
  ] = js.native
  def withSubscription[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](document: DocumentNode): js.Function1[
    /* WrappedComponent */ ComponentType[TProps with TChildProps], 
    ComponentClass[TProps, _]
  ] = js.native
  def withSubscription[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](
    document: DocumentNode,
    operationOptions: OperationOption[TProps, TData, TGraphQLVariables, TChildProps]
  ): js.Function1[
    /* WrappedComponent */ ComponentType[TProps with TChildProps], 
    ComponentClass[TProps, _]
  ] = js.native
}

