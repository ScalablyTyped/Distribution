package typings.reduxPack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined redux.redux.Action<any> & {  payload  :Payload,   meta  :redux-pack.redux-pack.MetaPayload<M>} */
trait PackActionPayload[Payload, M] extends js.Object {
  var meta: MetaPayload[M]
  var payload: Payload
  var `type`: js.Any
}

object PackActionPayload {
  @scala.inline
  def apply[Payload, M](meta: MetaPayload[M], payload: Payload, `type`: js.Any): PackActionPayload[Payload, M] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackActionPayload[Payload, M]]
  }
}

