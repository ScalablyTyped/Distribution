package typings.reduxSagaTypes.mod

import typings.reduxSagaTypes.reduxSagaTypesBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CombinatorEffect[T, E] extends js.Object {
  @JSName("@@redux-saga/IO")
  var `@@redux-sagaSlashIO`: `true`
  var combinator: `true`
  var payload: CombinatorEffectDescriptor[E]
  var `type`: T
}

object CombinatorEffect {
  @scala.inline
  def apply[T, E](
    `@@redux-sagaSlashIO`: `true`,
    combinator: `true`,
    payload: CombinatorEffectDescriptor[E],
    `type`: T
  ): CombinatorEffect[T, E] = {
    val __obj = js.Dynamic.literal(combinator = combinator.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("@@redux-saga/IO")(`@@redux-sagaSlashIO`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CombinatorEffect[T, E]]
  }
}

