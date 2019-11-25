package typings.radius.radiusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link https://github.com/retailnext/node-radius#radiusencode_responseargs} for more info.
  **/
trait EncodeResponseArgs extends js.Object {
  var attributes: js.UndefOr[js.Any] = js.undefined
  var code: String
  var packet: RadiusPacket
  var secret: String
}

object EncodeResponseArgs {
  @scala.inline
  def apply(code: String, packet: RadiusPacket, secret: String, attributes: js.Any = null): EncodeResponseArgs = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], packet = packet.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodeResponseArgs]
  }
}

