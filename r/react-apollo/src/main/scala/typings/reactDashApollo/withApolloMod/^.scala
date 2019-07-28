package typings.reactDashApollo.withApolloMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.reactDashApollo.typesMod.ChildProps
import typings.reactDashApollo.typesMod.OperationOption
import typings.reactDashApollo.typesMod.OperationVariables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo/withApollo", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[TProps, TResult](WrappedComponent: ComponentType[WithApolloClient[TProps]]): ComponentClass[TProps, ComponentState] = js.native
  def default[TProps, TResult](
    WrappedComponent: ComponentType[WithApolloClient[TProps]],
    operationOptions: OperationOption[TProps, TResult, OperationVariables, ChildProps[TProps, TResult, OperationVariables]]
  ): ComponentClass[TProps, ComponentState] = js.native
}

