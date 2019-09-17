package typings.atReduxDashSagaTypes.atReduxDashSagaTypesTypesMod

import typings.atReduxDashSagaTypes.atReduxDashSagaTypesNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CombinatorEffect[T, E] extends js.Object {
  var `@@redux-saga/IO`: `true`
  var combinator: `true`
  var payload: CombinatorEffectDescriptor[E]
  var `type`: T
}

object CombinatorEffect {
  @scala.inline
  def apply[T, E](`@@redux-saga/IO`: `true`, combinator: `true`, payload: CombinatorEffectDescriptor[E], `type`: T): CombinatorEffect[T, E] = {
    val __obj = js.Dynamic.literal(combinator = combinator, payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("@@redux-saga/IO")(`@@redux-saga/IO`)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CombinatorEffect[T, E]]
  }
}

