package typings.radius.radiusMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link https://github.com/retailnext/node-radius#radiusdecodeargs} for more info.
  **/
trait DecodeArgsWithSecret extends DecodeArgs {
  var secret: String
}

object DecodeArgsWithSecret {
  @scala.inline
  def apply(packet: Buffer, secret: String): DecodeArgsWithSecret = {
    val __obj = js.Dynamic.literal(packet = packet, secret = secret)
  
    __obj.asInstanceOf[DecodeArgsWithSecret]
  }
}

