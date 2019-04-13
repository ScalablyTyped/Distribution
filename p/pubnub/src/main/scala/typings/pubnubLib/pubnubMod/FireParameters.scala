package typings
package pubnubLib.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// fire
trait FireParameters extends js.Object {
  var channel: java.lang.String
  var message: js.Any
  var meta: js.UndefOr[js.Any] = js.undefined
  var sendByPost: js.UndefOr[scala.Boolean] = js.undefined
}

object FireParameters {
  @scala.inline
  def apply(
    channel: java.lang.String,
    message: js.Any,
    meta: js.Any = null,
    sendByPost: js.UndefOr[scala.Boolean] = js.undefined
  ): FireParameters = {
    val __obj = js.Dynamic.literal(channel = channel, message = message)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (!js.isUndefined(sendByPost)) __obj.updateDynamic("sendByPost")(sendByPost)
    __obj.asInstanceOf[FireParameters]
  }
}

