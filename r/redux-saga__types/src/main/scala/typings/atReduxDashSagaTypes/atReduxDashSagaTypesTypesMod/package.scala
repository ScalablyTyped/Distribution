package typings.atReduxDashSagaTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atReduxDashSagaTypesTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.redux.reduxMod.Action
  import typings.std.IterableIterator

  type ActionMatchingPattern[P /* <: ActionPattern[Action[_]] */] = ActionMatchingSubPattern[
    (/* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any) | P
  ]
  type ActionMatchingSubPattern[P /* <: ActionSubPattern[Action[_]] */] = Action[js.Any]
  type ActionPattern[Guard /* <: Action[_] */] = ActionSubPattern[Guard] | js.Array[ActionSubPattern[Guard]]
  type ActionSubPattern[Guard /* <: Action[_] */] = (GuardPredicate[Guard, Action[js.Any]]) | StringableActionCreator[Guard] | Predicate[Action[js.Any]] | ActionType
  type ActionType = String | Double | js.Symbol
  type CombinatorEffectDescriptor[E] = StringDictionary[E] | js.Array[E]
  type Effect[T] = (SimpleEffect[T, js.Any]) | (CombinatorEffect[T, js.Any])
  type GuardPredicate[G /* <: T */, T] = js.Function1[/* arg */ T, /* is G */ Boolean]
  type Pattern[T] = SubPattern[T] | js.Array[SubPattern[T]]
  type Predicate[T] = js.Function1[/* arg */ T, Boolean]
  type Saga[Args /* <: js.Array[_] */] = js.Function1[/* args */ Args, IterableIterator[js.Any]]
  type SagaIterator = IterableIterator[StrictEffect[js.Any]]
  type StrictEffect[T] = (SimpleEffect[T, js.Any]) | StrictCombinatorEffect[T]
  type SubPattern[T] = Predicate[T] | StringableActionCreator[Action[js.Any]] | ActionType
}
