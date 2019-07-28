package typings.reduxDashObservable.reduxDashObservableMod

import typings.redux.reduxMod.Action
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-observable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def combineEpics(epics: js.Any*): js.Any = js.native
  @JSName("combineEpics")
  def combineEpics_E_E[E](epics: E*): E = js.native
  @JSName("combineEpics")
  def combineEpics_T_ActionWildcardO_TSD_Epic[T /* <: Action[_] */, O /* <: T */, S, D](epics: (Epic[T, O, S, D])*): Epic[T, O, S, D] = js.native
  def createEpicMiddleware[T /* <: Action[_] */, O /* <: T */, S, D](): EpicMiddleware[T, O, S, D] = js.native
  def createEpicMiddleware[T /* <: Action[_] */, O /* <: T */, S, D](options: Options[D]): EpicMiddleware[T, O, S, D] = js.native
  def ofType[T /* <: Action[_] */, R /* <: T */, K /* <: /* import warning: ImportType.apply Failed type conversion: R['type'] */ js.Any */](key: K*): js.Function1[/* source */ Observable[T], Observable[R]] = js.native
}

