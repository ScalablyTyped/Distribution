package typings.rsocketDashTypes.reactiveSocketTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameWithData extends js.Object {
  var data: js.UndefOr[Encodable] = js.undefined
  var metadata: js.UndefOr[Encodable] = js.undefined
}

object FrameWithData {
  @scala.inline
  def apply(data: Encodable = null, metadata: Encodable = null): FrameWithData = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameWithData]
  }
}

