package typings.reduxDashObservable.reduxDashObservableMod

import typings.redux.reduxMod.Action
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-observable", "ofType")
@js.native
object ofType extends js.Object {
  def apply[T /* <: Action[_] */, R /* <: T */, K /* <: /* import warning: ImportType.apply Failed type conversion: R['type'] */ js.Any */](key: K*): js.Function1[/* source */ Observable[T], Observable[R]] = js.native
}

