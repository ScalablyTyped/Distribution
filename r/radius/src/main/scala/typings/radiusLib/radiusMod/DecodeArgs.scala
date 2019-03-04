package typings
package radiusLib.radiusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link https://github.com/retailnext/node-radius#radiusdecode_without_secretargs} for more info.
  **/
trait DecodeArgs extends js.Object {
  var packet: nodeLib.Buffer
}

object DecodeArgs {
  @scala.inline
  def apply(packet: nodeLib.Buffer): DecodeArgs = {
    val __obj = js.Dynamic.literal(packet = packet)
  
    __obj.asInstanceOf[DecodeArgs]
  }
}

