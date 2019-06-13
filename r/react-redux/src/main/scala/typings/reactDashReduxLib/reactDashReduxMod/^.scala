package typings
package reactDashReduxLib.reactDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-redux", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ReactReduxContext: reactLib.reactMod.Context[ReactReduxContextValue[js.Any, reduxLib.reduxMod.AnyAction]] = js.native
  val connect: Connect = js.native
  def batch(cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def connectAdvanced[S, TProps, TOwnProps, TFactoryOptions](
    // tslint:disable-next-line no-unnecessary-generics
  selectorFactory: SelectorFactory[S, TProps, TOwnProps, TFactoryOptions]
  ): AdvancedComponentDecorator[TProps, TOwnProps] = js.native
  def connectAdvanced[S, TProps, TOwnProps, TFactoryOptions](
    // tslint:disable-next-line no-unnecessary-generics
  selectorFactory: SelectorFactory[S, TProps, TOwnProps, TFactoryOptions],
    connectOptions: ConnectOptions with TFactoryOptions
  ): AdvancedComponentDecorator[TProps, TOwnProps] = js.native
  def shallowEqual(left: js.Any, right: js.Any): scala.Boolean = js.native
  def useDispatch[A /* <: reduxLib.reduxMod.Action[_] */](): reduxLib.reduxMod.Dispatch[A] = js.native
  @JSName("useDispatch")
  def useDispatch_TDispatchTDispatch[TDispatch](): TDispatch = js.native
  def useSelector[TState, TSelected](selector: js.Function1[/* state */ TState, TSelected]): TSelected = js.native
  def useSelector[TState, TSelected](
    selector: js.Function1[/* state */ TState, TSelected],
    equalityFn: js.Function2[/* left */ TSelected, /* right */ TSelected, scala.Boolean]
  ): TSelected = js.native
  def useStore[S, A /* <: reduxLib.reduxMod.Action[_] */](): reduxLib.reduxMod.Store[S, A] = js.native
}

