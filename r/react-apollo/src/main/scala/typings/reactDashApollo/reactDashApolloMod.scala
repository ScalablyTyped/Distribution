package typings.reactDashApollo

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashClient.apolloDashClientMod.default
import typings.atApolloReactDashCommon.libContextApolloConsumerMod.ApolloConsumerProps
import typings.atApolloReactDashCommon.libContextApolloContextMod.ApolloContextValue
import typings.atApolloReactDashCommon.libContextApolloProviderMod.ApolloProviderProps
import typings.atApolloReactDashCommon.libTypesTypesMod.OperationVariables
import typings.atApolloReactDashCommon.libTypesTypesMod.QueryResult
import typings.atApolloReactDashComponents.libTypesMod.MutationComponentOptions
import typings.atApolloReactDashComponents.libTypesMod.QueryComponentOptions
import typings.atApolloReactDashComponents.libTypesMod.SubscriptionComponentOptions
import typings.atApolloReactDashHoc.libTypesMod.ChildProps
import typings.atApolloReactDashHoc.libTypesMod.OperationOption
import typings.atApolloReactDashHoc.libTypesMod.WithApolloClient
import typings.atApolloReactDashHooks.Anon_Data
import typings.atApolloReactDashHooks.libTypesMod.LazyQueryHookOptions
import typings.atApolloReactDashHooks.libTypesMod.MutationHookOptions
import typings.atApolloReactDashHooks.libTypesMod.MutationTuple
import typings.atApolloReactDashHooks.libTypesMod.QueryHookOptions
import typings.atApolloReactDashHooks.libTypesMod.QueryLazyOptions
import typings.atApolloReactDashHooks.libTypesMod.SubscriptionHookOptions
import typings.atApolloReactDashSsr.libGetDataFromTreeMod.GetMarkupFromTreeOptions
import typings.graphql.languageAstMod.DocumentNode
import typings.propDashTypes.propDashTypesMod.Requireable
import typings.propDashTypes.propDashTypesMod.Validator
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.Context
import typings.react.reactMod.FC
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.reactDashApollo.reactDashApolloStrings.client
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo", JSImport.Namespace)
@js.native
object reactDashApolloMod extends js.Object {
  val ApolloConsumer: FC[ApolloConsumerProps] = js.native
  val ApolloProvider: FC[ApolloProviderProps[js.Any]] = js.native
  def Mutation[TData, TVariables](props: MutationComponentOptions[TData, TVariables]): Element | Null = js.native
  def Query[TData, TVariables](props: QueryComponentOptions[TData, TVariables]): Element | Null = js.native
  def Subscription[TData, TVariables](props: SubscriptionComponentOptions[TData, TVariables]): Element | Null = js.native
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
  def useLazyQuery[TData, TVariables](query: DocumentNode): js.Tuple2[
    js.Function1[/* options */ js.UndefOr[QueryLazyOptions[TVariables]], Unit], 
    QueryResult[TData, TVariables]
  ] = js.native
  def useLazyQuery[TData, TVariables](query: DocumentNode, options: LazyQueryHookOptions[TData, TVariables]): js.Tuple2[
    js.Function1[/* options */ js.UndefOr[QueryLazyOptions[TVariables]], Unit], 
    QueryResult[TData, TVariables]
  ] = js.native
  def useMutation[TData, TVariables](mutation: DocumentNode): MutationTuple[TData, TVariables] = js.native
  def useMutation[TData, TVariables](mutation: DocumentNode, options: MutationHookOptions[TData, TVariables]): MutationTuple[TData, TVariables] = js.native
  def useQuery[TData, TVariables](query: DocumentNode): QueryResult[TData, TVariables] = js.native
  def useQuery[TData, TVariables](query: DocumentNode, options: QueryHookOptions[TData, TVariables]): QueryResult[TData, TVariables] = js.native
  def useSubscription[TData, TVariables](subscription: DocumentNode): Anon_Data[TVariables, TData] = js.native
  def useSubscription[TData, TVariables](subscription: DocumentNode, options: SubscriptionHookOptions[TData, TVariables]): Anon_Data[TVariables, TData] = js.native
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
  @JSName("Mutation")
  @js.native
  object MutationNs extends js.Object {
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
  
  @JSName("Query")
  @js.native
  object QueryNs extends js.Object {
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
  
  @JSName("Subscription")
  @js.native
  object SubscriptionNs extends js.Object {
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

