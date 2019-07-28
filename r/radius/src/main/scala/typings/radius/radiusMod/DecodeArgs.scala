package typings.radius.radiusMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link https://github.com/retailnext/node-radius#radiusdecode_without_secretargs} for more info.
  **/
trait DecodeArgs extends js.Object {
  var packet: Buffer
}

object DecodeArgs {
  @scala.inline
  def apply(packet: Buffer): DecodeArgs = {
    val __obj = js.Dynamic.literal(packet = packet)
  
    __obj.asInstanceOf[DecodeArgs]
  }
}

