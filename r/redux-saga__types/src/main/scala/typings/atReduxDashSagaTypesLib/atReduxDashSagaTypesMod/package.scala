package typings
package atReduxDashSagaTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atReduxDashSagaTypesMod {
  type ActionPattern[Guard /* <: reduxLib.reduxMod.Action[_] */] = ActionSubPattern[Guard] | js.Array[ActionSubPattern[Guard]]
  type ActionSubPattern[Guard /* <: reduxLib.reduxMod.Action[_] */] = (GuardPredicate[Guard, reduxLib.reduxMod.Action[js.Any]]) | StringableActionCreator[Guard] | Predicate[reduxLib.reduxMod.Action[js.Any]] | ActionType
  type ActionType = java.lang.String | scala.Double | js.Symbol
  type CombinatorEffectDescriptor[E] = org.scalablytyped.runtime.StringDictionary[E] | js.Array[E]
  type Effect[T] = (SimpleEffect[T, js.Any]) | (CombinatorEffect[T, js.Any])
  type GuardPredicate[G /* <: T */, T] = js.Function1[/* arg */ T, /* is G */ scala.Boolean]
  type Pattern[T] = SubPattern[T] | js.Array[SubPattern[T]]
  type Predicate[T] = js.Function1[/* arg */ T, scala.Boolean]
  type Saga[Args /* <: js.Array[_] */] = js.Function1[/* args */ Args, stdLib.IterableIterator[js.Any]]
  type SagaIterator = stdLib.IterableIterator[StrictEffect[js.Any]]
  type StrictEffect[T] = (SimpleEffect[T, js.Any]) | StrictCombinatorEffect[T]
  type SubPattern[T] = Predicate[T] | StringableActionCreator[reduxLib.reduxMod.Action[js.Any]] | ActionType
}
