package typings.reactDashRedux.reactDashReduxMod

import typings.react.reactMod.Context
import typings.redux.reduxMod.Action
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-redux", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ReactReduxContext: Context[ReactReduxContextValue[js.Any, AnyAction]] = js.native
  val connect: Connect = js.native
  def batch(cb: js.Function0[Unit]): Unit = js.native
  def connectAdvanced[S, TProps, TOwnProps, TFactoryOptions](
    // tslint:disable-next-line no-unnecessary-generics
  selectorFactory: SelectorFactory[S, TProps, TOwnProps, TFactoryOptions]
  ): AdvancedComponentDecorator[TProps, TOwnProps] = js.native
  def connectAdvanced[S, TProps, TOwnProps, TFactoryOptions](
    // tslint:disable-next-line no-unnecessary-generics
  selectorFactory: SelectorFactory[S, TProps, TOwnProps, TFactoryOptions],
    connectOptions: ConnectOptions with TFactoryOptions
  ): AdvancedComponentDecorator[TProps, TOwnProps] = js.native
  def shallowEqual(left: js.Any, right: js.Any): Boolean = js.native
  def useDispatch[A /* <: Action[_] */](): Dispatch[A] = js.native
  @JSName("useDispatch")
  def useDispatch_TDispatch_TDispatch[TDispatch](): TDispatch = js.native
  def useSelector[TState, TSelected](selector: js.Function1[/* state */ TState, TSelected]): TSelected = js.native
  def useSelector[TState, TSelected](
    selector: js.Function1[/* state */ TState, TSelected],
    equalityFn: js.Function2[/* left */ TSelected, /* right */ TSelected, Boolean]
  ): TSelected = js.native
  def useStore[S, A /* <: Action[_] */](): Store[S, A] = js.native
}

