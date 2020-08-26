package typings.reduxPack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined redux.redux.Action<any> & {  payload :Payload,   meta :redux-pack.redux-pack.MetaPayload<M>} */
@js.native
trait PackActionPayload[Payload, M] extends js.Object {
  var meta: MetaPayload[M] = js.native
  var payload: Payload = js.native
  var `type`: js.Any = js.native
}

object PackActionPayload {
  @scala.inline
  def apply[Payload, M](meta: MetaPayload[M], payload: Payload, `type`: js.Any): PackActionPayload[Payload, M] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackActionPayload[Payload, M]]
  }
  @scala.inline
  implicit class PackActionPayloadOps[Self <: PackActionPayload[_, _], Payload, M] (val x: Self with (PackActionPayload[Payload, M])) extends AnyVal {
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
    def setMeta(value: MetaPayload[M]): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayload(value: Payload): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

