package typings
package reactDashReduxLib.reactDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-redux", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ReactReduxContext: reactLib.reactMod.ReactNs.Context[
    reactDashReduxLib.reactDashReduxMod.ReactReduxContextValue[js.Any, reduxLib.reduxMod.AnyAction]
  ] = js.native
  val connect: reactDashReduxLib.reactDashReduxMod.Connect = js.native
  def connectAdvanced[S, TProps, TOwnProps, TFactoryOptions](
    // tslint:disable-next-line no-unnecessary-generics
  selectorFactory: reactDashReduxLib.reactDashReduxMod.SelectorFactory[S, TProps, TOwnProps, TFactoryOptions]
  ): reactDashReduxLib.reactDashReduxMod.AdvancedComponentDecorator[TProps, TOwnProps] = js.native
  def connectAdvanced[S, TProps, TOwnProps, TFactoryOptions](
    // tslint:disable-next-line no-unnecessary-generics
  selectorFactory: reactDashReduxLib.reactDashReduxMod.SelectorFactory[S, TProps, TOwnProps, TFactoryOptions],
    connectOptions: reactDashReduxLib.reactDashReduxMod.ConnectOptions with TFactoryOptions
  ): reactDashReduxLib.reactDashReduxMod.AdvancedComponentDecorator[TProps, TOwnProps] = js.native
}

