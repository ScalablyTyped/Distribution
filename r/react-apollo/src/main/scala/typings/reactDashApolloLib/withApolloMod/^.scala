package typings
package reactDashApolloLib.withApolloMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo/withApollo", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[TProps, TResult](
    WrappedComponent: reactLib.reactMod.ReactNs.ComponentType[reactDashApolloLib.withApolloMod.WithApolloClient[TProps]]
  ): reactLib.reactMod.ReactNs.ComponentClass[TProps, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def default[TProps, TResult](
    WrappedComponent: reactLib.reactMod.ReactNs.ComponentType[reactDashApolloLib.withApolloMod.WithApolloClient[TProps]],
    operationOptions: reactDashApolloLib.typesMod.OperationOption[
      TProps, 
      TResult, 
      reactDashApolloLib.typesMod.OperationVariables, 
      reactDashApolloLib.typesMod.ChildProps[TProps, TResult, reactDashApolloLib.typesMod.OperationVariables]
    ]
  ): reactLib.reactMod.ReactNs.ComponentClass[TProps, reactLib.reactMod.ReactNs.ComponentState] = js.native
}

