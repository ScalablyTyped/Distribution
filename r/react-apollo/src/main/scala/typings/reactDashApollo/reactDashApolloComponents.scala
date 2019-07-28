package typings.reactDashApollo

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashApolloComponents extends reactDashApolloProps {
  @scala.inline
  def ApolloConsumer: ComponentType[typings.reactDashApollo.apolloConsumerMod.ApolloConsumerProps] = typings.reactDashApollo.apolloConsumerMod.^.default.asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashApollo.apolloConsumerMod.ApolloConsumerProps]]
  @scala.inline
  def ApolloProvider[TCache]: ComponentType[typings.reactDashApollo.apolloProviderMod.ApolloProviderProps[TCache]] = js.constructorOf[typings.reactDashApollo.apolloProviderMod.default[TCache]].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashApollo.apolloProviderMod.ApolloProviderProps[TCache]]]
  @scala.inline
  def Mutation[TData, TVariables]: ComponentType[typings.reactDashApollo.mutationMod.MutationProps[TData, TVariables]] = js.constructorOf[typings.reactDashApollo.mutationMod.default[TData, TVariables]].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashApollo.mutationMod.MutationProps[TData, TVariables]]]
  @scala.inline
  def Query[TData, TVariables]: ComponentType[typings.reactDashApollo.queryMod.QueryProps[TData, TVariables]] = js.constructorOf[typings.reactDashApollo.queryMod.default[TData, TVariables]].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashApollo.queryMod.QueryProps[TData, TVariables]]]
  @scala.inline
  def Subscription[TData, TVariables]: ComponentType[typings.reactDashApollo.subscriptionsMod.SubscriptionProps[TData, TVariables]] = js.constructorOf[typings.reactDashApollo.reactDashApolloMod.Subscription[TData, TVariables]].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashApollo.subscriptionsMod.SubscriptionProps[TData, TVariables]]]
  @scala.inline
  def Subscriptions[TData, TVariables]: ComponentType[typings.reactDashApollo.subscriptionsMod.SubscriptionProps[TData, TVariables]] = js.constructorOf[typings.reactDashApollo.subscriptionsMod.default[TData, TVariables]].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashApollo.subscriptionsMod.SubscriptionProps[TData, TVariables]]]
}

