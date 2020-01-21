package typings.rsocketTypes.reactiveSocketTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payload[D, M] extends js.Object {
  var data: js.UndefOr[D] = js.undefined
  var metadata: js.UndefOr[M] = js.undefined
}

object Payload {
  @scala.inline
  def apply[D, M](data: D = null, metadata: M = null): Payload[D, M] = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload[D, M]]
  }
}

