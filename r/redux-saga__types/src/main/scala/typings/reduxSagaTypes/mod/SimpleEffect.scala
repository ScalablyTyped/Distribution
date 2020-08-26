package typings.reduxSagaTypes.mod

import typings.reduxSagaTypes.reduxSagaTypesBooleans.`false`
import typings.reduxSagaTypes.reduxSagaTypesBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleEffect[T, P] extends js.Object {
  @JSName("@@redux-saga/IO")
  var `@@redux-sagaSlashIO`: `true` = js.native
  var combinator: `false` = js.native
  var payload: P = js.native
  var `type`: T = js.native
}

object SimpleEffect {
  @scala.inline
  def apply[T, P](`@@redux-sagaSlashIO`: `true`, combinator: `false`, payload: P, `type`: T): SimpleEffect[T, P] = {
    val __obj = js.Dynamic.literal(combinator = combinator.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("@@redux-saga/IO")(`@@redux-sagaSlashIO`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleEffect[T, P]]
  }
  @scala.inline
  implicit class SimpleEffectOps[Self <: SimpleEffect[_, _], T, P] (val x: Self with (SimpleEffect[T, P])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `set@@redux-sagaSlashIO`(value: `true`): Self = this.set("@@redux-saga/IO", value.asInstanceOf[js.Any])
    @scala.inline
    def setCombinator(value: `false`): Self = this.set("combinator", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayload(value: P): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

