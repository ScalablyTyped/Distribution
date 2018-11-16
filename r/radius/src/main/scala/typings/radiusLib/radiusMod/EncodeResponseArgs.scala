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

