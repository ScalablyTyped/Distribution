package typings.atReduxDashSagaTypes.atReduxDashSagaTypesTypesMod

import typings.atReduxDashSagaTypes.atReduxDashSagaTypesBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictCombinatorEffect[T] extends CombinatorEffect[T, StrictEffect[T]]

object StrictCombinatorEffect {
  @scala.inline
  def apply[T](
    `@@redux-sagaSlashIO`: `true`,
    combinator: `true`,
    payload: CombinatorEffectDescriptor[StrictEffect[T]],
    `type`: T
  ): StrictCombinatorEffect[T] = {
    val __obj = js.Dynamic.literal(combinator = combinator.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("@@redux-saga/IO")(`@@redux-sagaSlashIO`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictCombinatorEffect[T]]
  }
}

