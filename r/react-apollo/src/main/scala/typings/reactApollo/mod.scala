package typings.reactApollo

import org.scalablytyped.runtime.StringDictionary
import typings.apolloClient.mod.default
import typings.apolloReactCommon.apolloConsumerMod.ApolloConsumerProps
import typings.apolloReactCommon.apolloContextMod.ApolloContextValue
import typings.apolloReactCommon.apolloProviderMod.ApolloProviderProps
import typings.apolloReactCommon.typesMod.OperationVariables
import typings.apolloReactCommon.typesMod.QueryResult
import typings.apolloReactComponents.typesMod.MutationComponentOptions
import typings.apolloReactComponents.typesMod.QueryComponentOptions
import typings.apolloReactComponents.typesMod.SubscriptionComponentOptions
import typings.apolloReactHoc.typesMod.ChildProps
import typings.apolloReactHoc.typesMod.OperationOption
import typings.apolloReactHoc.typesMod.WithApolloClient
import typings.apolloReactHooks.AnonError
import typings.apolloReactHooks.typesMod.LazyQueryHookOptions
import typings.apolloReactHooks.typesMod.MutationHookOptions
import typings.apolloReactHooks.typesMod.MutationTuple
import typings.apolloReactHooks.typesMod.QueryHookOptions
import typings.apolloReactHooks.typesMod.QueryTuple
import typings.apolloReactHooks.typesMod.SubscriptionHookOptions
import typings.apolloReactSsr.getDataFromTreeMod.GetMarkupFromTreeOptions
import typings.graphql.astMod.DocumentNode
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod._Global_.JSX.Element
import typings.reactApollo.reactApolloStrings.client
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val ApolloConsumer: FC[ApolloConsumerProps] = js.native
  val ApolloProvider: FC[ApolloProviderProps[js.Any]] = js.native
  def getApolloContext(): Context[ApolloContextValue] = js.native
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
  def resetApolloContext(): Unit = js.native
  def useApolloClient(): default[js.Object] = js.native
  def useLazyQuery[TData, TVariables](query: DocumentNode): QueryTuple[TData, TVariables] = js.native
  def useLazyQuery[TData, TVariables](query: DocumentNode, options: LazyQueryHookOptions[TData, TVariables]): QueryTuple[TData, TVariables] = js.native
  def useMutation[TData, TVariables](mutation: DocumentNode): MutationTuple[TData, TVariables] = js.native
  def useMutation[TData, TVariables](mutation: DocumentNode, options: MutationHookOptions[TData, TVariables]): MutationTuple[TData, TVariables] = js.native
  def useQuery[TData, TVariables](query: DocumentNode): QueryResult[TData, TVariables] = js.native
  def useQuery[TData, TVariables](query: DocumentNode, options: QueryHookOptions[TData, TVariables]): QueryResult[TData, TVariables] = js.native
  def useSubscription[TData, TVariables](subscription: DocumentNode): AnonError[TVariables, TData] = js.native
  def useSubscription[TData, TVariables](subscription: DocumentNode, options: SubscriptionHookOptions[TData, TVariables]): AnonError[TVariables, TData] = js.native
  @JSName("withApollo")
  def withApollo_client[TProps, TResult](WrappedComponent: ComponentType[WithApolloClient[Omit[TProps, client]]]): ComponentClass[Omit[TProps, client], ComponentState] = js.native
  @JSName("withApollo")
  def withApollo_client[TProps, TResult](
    WrappedComponent: ComponentType[WithApolloClient[Omit[TProps, client]]],
    operationOptions: OperationOption[TProps, TResult, OperationVariables, ChildProps[TProps, TResult, OperationVariables]]
  ): ComponentClass[Omit[TProps, client], ComponentState] = js.native
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
  @js.native
  object Mutation extends js.Object {
    def apply[TData, TVariables](props: MutationComponentOptions[TData, TVariables]): Element | Null = js.native
    @js.native
    object propTypes extends js.Object {
      var awaitRefetchQueries: Requireable[Boolean] = js.native
      var children: Validator[js.Function1[/* repeated */ _, _]] = js.native
      var fetchPolicy: Requireable[String] = js.native
      var mutation: Validator[js.Object] = js.native
      var onCompleted: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var onError: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var optimisticResponse: Requireable[js.Object] = js.native
      var refetchQueries: Requireable[
            (js.Function1[/* repeated */ _, _]) | (js.Array[js.UndefOr[String | js.Object | Null]])
          ] = js.native
      var update: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var variables: Requireable[js.Object] = js.native
    }
    
  }
  
  @js.native
  object Query extends js.Object {
    def apply[TData, TVariables](props: QueryComponentOptions[TData, TVariables]): Element | Null = js.native
    @js.native
    object propTypes extends js.Object {
      var children: Validator[js.Function1[/* repeated */ _, _]] = js.native
      var client: Requireable[js.Object] = js.native
      var fetchPolicy: Requireable[String] = js.native
      var notifyOnNetworkStatusChange: Requireable[Boolean] = js.native
      var onCompleted: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var onError: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var partialRefetch: Requireable[Boolean] = js.native
      var pollInterval: Requireable[Double] = js.native
      var query: Validator[js.Object] = js.native
      var returnPartialData: Requireable[Boolean] = js.native
      var ssr: Requireable[Boolean] = js.native
      var variables: Requireable[js.Object] = js.native
    }
    
  }
  
  @js.native
  object Subscription extends js.Object {
    def apply[TData, TVariables](props: SubscriptionComponentOptions[TData, TVariables]): Element | Null = js.native
    @js.native
    object propTypes extends js.Object {
      var children: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var onSubscriptionComplete: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var onSubscriptionData: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var shouldResubscribe: Requireable[Boolean | (js.Function1[/* repeated */ _, _])] = js.native
      var subscription: Validator[js.Object] = js.native
      var variables: Requireable[js.Object] = js.native
    }
    
  }
  
}

