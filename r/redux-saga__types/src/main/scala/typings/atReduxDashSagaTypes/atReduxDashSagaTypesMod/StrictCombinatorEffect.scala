package typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod

import typings.atReduxDashSagaTypes.atReduxDashSagaTypesNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictCombinatorEffect[T] extends CombinatorEffect[T, StrictEffect[T]]

object StrictCombinatorEffect {
  @scala.inline
  def apply[T](
    `@@redux-saga/IO`: `true`,
    combinator: `true`,
    payload: CombinatorEffectDescriptor[StrictEffect[T]],
    `type`: T
  ): StrictCombinatorEffect[T] = {
    val __obj = js.Dynamic.literal(combinator = combinator, payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("@@redux-saga/IO")(`@@redux-saga/IO`)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictCombinatorEffect[T]]
  }
}

