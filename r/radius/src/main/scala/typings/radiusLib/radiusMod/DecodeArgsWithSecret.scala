package typings
package radiusLib.radiusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link https://github.com/retailnext/node-radius#radiusdecodeargs} for more info.
  **/
trait DecodeArgsWithSecret extends DecodeArgs {
  var secret: java.lang.String
}

object DecodeArgsWithSecret {
  @scala.inline
  def apply(packet: nodeLib.Buffer, secret: java.lang.String): DecodeArgsWithSecret = {
    val __obj = js.Dynamic.literal(packet = packet, secret = secret)
  
    __obj.asInstanceOf[DecodeArgsWithSecret]
  }
}

