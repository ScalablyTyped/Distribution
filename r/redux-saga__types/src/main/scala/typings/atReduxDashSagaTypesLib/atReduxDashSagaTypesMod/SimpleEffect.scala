package typings
package atReduxDashSagaTypesLib.atReduxDashSagaTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleEffect[T, P] extends js.Object {
  var `@@redux-saga/IO`: atReduxDashSagaTypesLib.atReduxDashSagaTypesLibNumbers.`true`
  var combinator: atReduxDashSagaTypesLib.atReduxDashSagaTypesLibNumbers.`false`
  var payload: P
  var `type`: T
}

object SimpleEffect {
  @scala.inline
  def apply[T, P](
    `@@redux-saga/IO`: atReduxDashSagaTypesLib.atReduxDashSagaTypesLibNumbers.`true`,
    combinator: atReduxDashSagaTypesLib.atReduxDashSagaTypesLibNumbers.`false`,
    payload: P,
    `type`: T
  ): SimpleEffect[T, P] = {
    val __obj = js.Dynamic.literal(`@@redux-saga/IO` = `@@redux-saga/IO`, `type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("combinator")(combinator)
    __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleEffect[T, P]]
  }
}

