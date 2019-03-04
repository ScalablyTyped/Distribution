package typings
package radiusLib.radiusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link https://github.com/retailnext/node-radius#radiusencode_responseargs} for more info.
  **/
trait EncodeResponseArgs extends js.Object {
  var attributes: js.UndefOr[js.Any] = js.undefined
  var code: java.lang.String
  var packet: RadiusPacket
  var secret: java.lang.String
}

object EncodeResponseArgs {
  @scala.inline
  def apply(code: java.lang.String, packet: RadiusPacket, secret: java.lang.String, attributes: js.Any = null): EncodeResponseArgs = {
    val __obj = js.Dynamic.literal(code = code, packet = packet, secret = secret)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    __obj.asInstanceOf[EncodeResponseArgs]
  }
}

