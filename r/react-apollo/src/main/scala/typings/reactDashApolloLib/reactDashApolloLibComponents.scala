package typings
package reactDashApolloLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashApolloLibComponents extends reactDashApolloLibProps {
  @scala.inline
  def ApolloConsumer: reactLib.reactMod.ComponentType[reactDashApolloLib.apolloConsumerMod.ApolloConsumerProps] = reactDashApolloLib.apolloConsumerMod.^.default.asInstanceOf[reactLib.reactMod.ComponentType[reactDashApolloLib.apolloConsumerMod.ApolloConsumerProps]]
  @scala.inline
  def ApolloProvider[TCache]: reactLib.reactMod.ComponentType[reactDashApolloLib.apolloProviderMod.ApolloProviderProps[TCache]] = js.constructorOf[reactDashApolloLib.apolloProviderMod.default[TCache]].asInstanceOf[reactLib.reactMod.ComponentType[reactDashApolloLib.apolloProviderMod.ApolloProviderProps[TCache]]]
  @scala.inline
  def Mutation[TData, TVariables]: reactLib.reactMod.ComponentType[reactDashApolloLib.mutationMod.MutationProps[TData, TVariables]] = js.constructorOf[reactDashApolloLib.mutationMod.default[TData, TVariables]].asInstanceOf[reactLib.reactMod.ComponentType[reactDashApolloLib.mutationMod.MutationProps[TData, TVariables]]]
  @scala.inline
  def Query[TData, TVariables]: reactLib.reactMod.ComponentType[reactDashApolloLib.queryMod.QueryProps[TData, TVariables]] = js.constructorOf[reactDashApolloLib.queryMod.default[TData, TVariables]].asInstanceOf[reactLib.reactMod.ComponentType[reactDashApolloLib.queryMod.QueryProps[TData, TVariables]]]
  @scala.inline
  def Subscription[TData, TVariables]: reactLib.reactMod.ComponentType[reactDashApolloLib.subscriptionsMod.SubscriptionProps[TData, TVariables]] = js.constructorOf[reactDashApolloLib.reactDashApolloMod.Subscription[TData, TVariables]].asInstanceOf[reactLib.reactMod.ComponentType[reactDashApolloLib.subscriptionsMod.SubscriptionProps[TData, TVariables]]]
  @scala.inline
  def Subscriptions[TData, TVariables]: reactLib.reactMod.ComponentType[reactDashApolloLib.subscriptionsMod.SubscriptionProps[TData, TVariables]] = js.constructorOf[reactDashApolloLib.subscriptionsMod.default[TData, TVariables]].asInstanceOf[reactLib.reactMod.ComponentType[reactDashApolloLib.subscriptionsMod.SubscriptionProps[TData, TVariables]]]
}

