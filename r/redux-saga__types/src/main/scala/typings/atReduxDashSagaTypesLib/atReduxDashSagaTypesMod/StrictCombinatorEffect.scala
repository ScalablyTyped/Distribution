package typings
package atReduxDashSagaTypesLib.atReduxDashSagaTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictCombinatorEffect[T] extends CombinatorEffect[T, StrictEffect[T]]

object StrictCombinatorEffect {
  @scala.inline
  def apply[T](
    `@@redux-saga/IO`: atReduxDashSagaTypesLib.atReduxDashSagaTypesLibNumbers.`true`,
    combinator: atReduxDashSagaTypesLib.atReduxDashSagaTypesLibNumbers.`true`,
    payload: CombinatorEffectDescriptor[StrictEffect[T]],
    `type`: T
  ): StrictCombinatorEffect[T] = {
    val __obj = js.Dynamic.literal(combinator = combinator, payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("@@redux-saga/IO")(`@@redux-saga/IO`)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictCombinatorEffect[T]]
  }
}

