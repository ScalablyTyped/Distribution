package typings.atReduxDashSagaIs

import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.ActionPattern
import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.Buffer
import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.Channel
import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.Effect
import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.GuardPredicate
import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.Pattern
import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.Task
import typings.redux.reduxMod.Action
import typings.std.Iterable
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@redux-saga/is", JSImport.Namespace)
@js.native
object atReduxDashSagaIsMod extends js.Object {
  val array: GuardPredicate[js.Array[js.Any], js.Any] = js.native
  val buffer: GuardPredicate[Buffer[js.Any], js.Any] = js.native
  val channel: GuardPredicate[Channel[js.Any], js.Any] = js.native
  val effect: GuardPredicate[Effect[js.Any], js.Any] = js.native
  val func: GuardPredicate[js.Function, js.Any] = js.native
  val iterable: GuardPredicate[Iterable[js.Any], js.Any] = js.native
  val iterator: GuardPredicate[Iterator[js.Any, js.Any, js.UndefOr[scala.Nothing]], js.Any] = js.native
  val notUndef: GuardPredicate[js.Any, js.Any] = js.native
  val number: GuardPredicate[Double, js.Any] = js.native
  val `object`: GuardPredicate[js.Object, js.Any] = js.native
  val observable: GuardPredicate[Anon_Subscribe, js.Any] = js.native
  val pattern: GuardPredicate[Pattern[js.Any] | ActionPattern[Action[js.Any]], js.Any] = js.native
  val promise: GuardPredicate[js.Promise[js.Any], js.Any] = js.native
  val sagaAction: GuardPredicate[Action[_] with Anon_ReduxsagaSAGAACTION, js.Any] = js.native
  val string: GuardPredicate[String, js.Any] = js.native
  val stringableFunc: GuardPredicate[js.Function, js.Any] = js.native
  val task: GuardPredicate[Task, js.Any] = js.native
  val undef: GuardPredicate[js.UndefOr[scala.Nothing], js.Any] = js.native
}

