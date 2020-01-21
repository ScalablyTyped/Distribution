package typings.reduxSagaTypes.mod

import typings.reduxSagaTypes.reduxSagaTypesBooleans.`false`
import typings.reduxSagaTypes.reduxSagaTypesBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleEffect[T, P] extends js.Object {
  @JSName("@@redux-saga/IO")
  var `@@redux-sagaSlashIO`: `true`
  var combinator: `false`
  var payload: P
  var `type`: T
}

object SimpleEffect {
  @scala.inline
  def apply[T, P](`@@redux-sagaSlashIO`: `true`, combinator: `false`, payload: P, `type`: T): SimpleEffect[T, P] = {
    val __obj = js.Dynamic.literal(combinator = combinator.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("@@redux-saga/IO")(`@@redux-sagaSlashIO`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleEffect[T, P]]
  }
}

