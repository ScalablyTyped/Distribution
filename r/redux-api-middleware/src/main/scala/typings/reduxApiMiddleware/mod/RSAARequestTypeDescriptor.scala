package typings.reduxApiMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RSAARequestTypeDescriptor[State, Payload, Meta] extends js.Object {
  var meta: js.UndefOr[
    (js.Function2[/* action */ RSAAAction[_, _, _], /* state */ State, Meta | js.Promise[Meta]]) | Meta
  ] = js.native
  var payload: js.UndefOr[
    (js.Function2[/* action */ RSAAAction[_, _, _], /* state */ State, Payload | js.Promise[Payload]]) | Payload
  ] = js.native
  var `type`: String | js.Symbol = js.native
}

object RSAARequestTypeDescriptor {
  @scala.inline
  def apply[State, Payload, Meta](`type`: String | js.Symbol): RSAARequestTypeDescriptor[State, Payload, Meta] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAARequestTypeDescriptor[State, Payload, Meta]]
  }
  @scala.inline
  implicit class RSAARequestTypeDescriptorOps[Self <: RSAARequestTypeDescriptor[_, _, _], State, Payload, Meta] (val x: Self with (RSAARequestTypeDescriptor[State, Payload, Meta])) extends AnyVal {
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
    def setType(value: String | js.Symbol): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetaFunction2(value: (/* action */ RSAAAction[_, _, _], /* state */ State) => Meta | js.Promise[Meta]): Self = this.set("meta", js.Any.fromFunction2(value))
    @scala.inline
    def setMeta(
      value: (js.Function2[/* action */ RSAAAction[_, _, _], /* state */ State, Meta | js.Promise[Meta]]) | Meta
    ): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    @scala.inline
    def setPayloadFunction2(value: (/* action */ RSAAAction[_, _, _], /* state */ State) => Payload | js.Promise[Payload]): Self = this.set("payload", js.Any.fromFunction2(value))
    @scala.inline
    def setPayload(
      value: (js.Function2[/* action */ RSAAAction[_, _, _], /* state */ State, Payload | js.Promise[Payload]]) | Payload
    ): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
  }
  
}

