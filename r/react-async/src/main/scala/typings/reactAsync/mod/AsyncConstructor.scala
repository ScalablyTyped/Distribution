package typings.reactAsync.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.GetDerivedStateFromError
import typings.react.mod.GetDerivedStateFromProps
import typings.react.mod.ValidationMap
import typings.react.mod.WeakValidationMap
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ComponentClass<react-async.react-async.AsyncProps<T>, react.react.ComponentState> & {  Initial  :react.react.FC<react-async.react-async.InitialProps<T>>,   Pending  :react.react.FC<react-async.react-async.PendingProps<T>>,   Loading  :react.react.FC<react-async.react-async.PendingProps<T>>,   Fulfilled  :react.react.FC<react-async.react-async.FulfilledProps<T>>,   Resolved  :react.react.FC<react-async.react-async.FulfilledProps<T>>,   Rejected  :react.react.FC<react-async.react-async.RejectedProps<T>>,   Settled  :react.react.FC<react-async.react-async.SettledProps<T>>} */
@js.native
trait AsyncConstructor[T]
  extends Instantiable1[/* props */ AsyncProps[T], Component[AsyncProps[T], ComponentState, js.Any]]
     with Instantiable2[
      /* props */ AsyncProps[T], 
      /* context */ js.Any, 
      Component[AsyncProps[T], ComponentState, js.Any]
    ] {
  var Fulfilled: FC[FulfilledProps[T]] = js.native
  var Initial: FC[InitialProps[T]] = js.native
  var Loading: FC[PendingProps[T]] = js.native
  var Pending: FC[PendingProps[T]] = js.native
  var Rejected: FC[RejectedProps[T]] = js.native
  var Resolved: FC[FulfilledProps[T]] = js.native
  var Settled: FC[SettledProps[T]] = js.native
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var contextType: js.UndefOr[Context[_]] = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[Partial[AsyncProps[T]]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[AsyncProps[T], ComponentState]] = js.native
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[AsyncProps[T], ComponentState]] = js.native
  var propTypes: js.UndefOr[WeakValidationMap[AsyncProps[T]]] = js.native
}

