package typings.reduxPack

import typings.reduxPack.mod.MetaPayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMeta[Payload, M] extends js.Object {
  var meta: MetaPayload[M]
  var payload: Payload
}

object AnonMeta {
  @scala.inline
  def apply[Payload, M](meta: MetaPayload[M], payload: Payload): AnonMeta[Payload, M] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMeta[Payload, M]]
  }
}

