package typings.rlp.typesMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decoded extends js.Object {
  var data: Buffer | js.Array[Buffer]
  var remainder: Buffer
}

object Decoded {
  @scala.inline
  def apply(data: Buffer | js.Array[Buffer], remainder: Buffer): Decoded = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], remainder = remainder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decoded]
  }
}

