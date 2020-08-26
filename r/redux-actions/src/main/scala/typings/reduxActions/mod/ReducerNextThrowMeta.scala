package typings.reduxActions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReducerNextThrowMeta[State, Payload, Meta] extends js.Object {
  var next: js.UndefOr[js.Function2[/* state */ State, /* action */ ActionMeta[Payload, Meta], State]] = js.native
  var `throw`: js.UndefOr[js.Function2[/* state */ State, /* action */ ActionMeta[Payload, Meta], State]] = js.native
}

object ReducerNextThrowMeta {
  @scala.inline
  def apply[State, Payload, Meta](): ReducerNextThrowMeta[State, Payload, Meta] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReducerNextThrowMeta[State, Payload, Meta]]
  }
  @scala.inline
  implicit class ReducerNextThrowMetaOps[Self <: ReducerNextThrowMeta[_, _, _], State, Payload, Meta] (val x: Self with (ReducerNextThrowMeta[State, Payload, Meta])) extends AnyVal {
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
    def setNext(value: (/* state */ State, /* action */ ActionMeta[Payload, Meta]) => State): Self = this.set("next", js.Any.fromFunction2(value))
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    @scala.inline
    def setThrow(value: (/* state */ State, /* action */ ActionMeta[Payload, Meta]) => State): Self = this.set("throw", js.Any.fromFunction2(value))
    @scala.inline
    def deleteThrow: Self = this.set("throw", js.undefined)
  }
  
}

