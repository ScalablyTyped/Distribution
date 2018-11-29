package typings
package reactDashApolloLib.reactDashApolloMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo", JSImport.Namespace)
@js.native
object reactDashApolloModMembers extends js.Object {
  val ApolloConsumer: reactLib.reactMod.ReactNs.StatelessComponent[reactDashApolloLib.apolloconsumerMod.ApolloConsumerProps] = js.native
  val compose: js.Any = js.native
  def getDataFromTree(tree: reactLib.reactMod.ReactNs.ReactNode): stdLib.Promise[java.lang.String] = js.native
  def getDataFromTree(tree: reactLib.reactMod.ReactNs.ReactNode, context: ScalablyTyped.runtime.StringDictionary[js.Any]): stdLib.Promise[java.lang.String] = js.native
  def getMarkupFromTree(hasTreeContextRenderFunction: reactDashApolloLib.getDataFromTreeMod.GetMarkupFromTreeOptions): stdLib.Promise[java.lang.String] = js.native
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
  def renderToStringWithData(component: reactLib.reactMod.ReactNs.ReactElement[_]): stdLib.Promise[java.lang.String] = js.native
  def walkTree(
    element: reactLib.reactMod.ReactNs.ReactNode,
    context: reactDashApolloLib.walkTreeMod.Context,
    visitor: js.Function5[
      /* element */ reactLib.reactMod.ReactNs.ReactNode, 
      /* instance */ (reactLib.reactMod.Component[_, js.Object, _]) | scala.Null, 
      /* newContextMap */ lodashLib.lodashMod.Global.Map[_, _], 
      /* context */ reactDashApolloLib.walkTreeMod.Context, 
      /* childContext */ js.UndefOr[reactDashApolloLib.walkTreeMod.Context], 
      scala.Boolean | scala.Unit
    ]
  ): scala.Unit = js.native
  def walkTree(
    element: reactLib.reactMod.ReactNs.ReactNode,
    context: reactDashApolloLib.walkTreeMod.Context,
    visitor: js.Function5[
      /* element */ reactLib.reactMod.ReactNs.ReactNode, 
      /* instance */ (reactLib.reactMod.Component[_, js.Object, _]) | scala.Null, 
      /* newContextMap */ lodashLib.lodashMod.Global.Map[_, _], 
      /* context */ reactDashApolloLib.walkTreeMod.Context, 
      /* childContext */ js.UndefOr[reactDashApolloLib.walkTreeMod.Context], 
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

