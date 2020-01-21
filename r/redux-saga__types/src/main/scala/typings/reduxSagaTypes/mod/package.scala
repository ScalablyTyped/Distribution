package typings.reduxSagaTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ActionMatchingPattern[P /* <: typings.reduxSagaTypes.mod.ActionPattern[typings.redux.mod.Action[_]] */] = typings.reduxSagaTypes.mod.ActionMatchingSubPattern[
    (/* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any) | P
  ]
  type ActionMatchingSubPattern[P /* <: typings.reduxSagaTypes.mod.ActionSubPattern[typings.redux.mod.Action[_]] */] = typings.redux.mod.Action[js.Any]
  type ActionPattern[Guard /* <: typings.redux.mod.Action[_] */] = typings.reduxSagaTypes.mod.ActionSubPattern[Guard] | js.Array[typings.reduxSagaTypes.mod.ActionSubPattern[Guard]]
  type ActionSubPattern[Guard /* <: typings.redux.mod.Action[_] */] = (typings.reduxSagaTypes.mod.GuardPredicate[Guard, typings.redux.mod.Action[js.Any]]) | typings.reduxSagaTypes.mod.StringableActionCreator[Guard] | typings.reduxSagaTypes.mod.Predicate[typings.redux.mod.Action[js.Any]] | typings.reduxSagaTypes.mod.ActionType
  type ActionType = java.lang.String | scala.Double | js.Symbol
  type CombinatorEffectDescriptor[E] = org.scalablytyped.runtime.StringDictionary[E] | js.Array[E]
  type Effect[T] = (typings.reduxSagaTypes.mod.SimpleEffect[T, js.Any]) | (typings.reduxSagaTypes.mod.CombinatorEffect[T, js.Any])
  type GuardPredicate[G /* <: T */, T] = js.Function1[/* arg */ T, /* is G */ scala.Boolean]
  type Pattern[T] = typings.reduxSagaTypes.mod.SubPattern[T] | js.Array[typings.reduxSagaTypes.mod.SubPattern[T]]
  type Predicate[T] = js.Function1[/* arg */ T, scala.Boolean]
  type Saga[Args /* <: js.Array[_] */] = js.Function1[/* args */ Args, typings.std.IterableIterator[js.Any]]
  type SagaIterator = typings.std.IterableIterator[typings.reduxSagaTypes.mod.StrictEffect[js.Any]]
  type StrictEffect[T] = (typings.reduxSagaTypes.mod.SimpleEffect[T, js.Any]) | typings.reduxSagaTypes.mod.StrictCombinatorEffect[T]
  type SubPattern[T] = typings.reduxSagaTypes.mod.Predicate[T] | typings.reduxSagaTypes.mod.StringableActionCreator[typings.redux.mod.Action[js.Any]] | typings.reduxSagaTypes.mod.ActionType
}
