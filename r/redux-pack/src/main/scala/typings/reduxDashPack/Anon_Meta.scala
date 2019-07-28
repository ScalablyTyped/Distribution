package typings.reduxDashPack

import typings.reduxDashPack.reduxDashPackMod.MetaPayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Meta[Payload, M] extends js.Object {
  var meta: MetaPayload[M]
  var payload: Payload
}

object Anon_Meta {
  @scala.inline
  def apply[Payload, M](meta: MetaPayload[M], payload: Payload): Anon_Meta[Payload, M] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Meta[Payload, M]]
  }
}

