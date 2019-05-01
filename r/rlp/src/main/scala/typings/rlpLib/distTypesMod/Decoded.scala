package typings
package rlpLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decoded extends js.Object {
  var data: nodeLib.Buffer | js.Array[nodeLib.Buffer]
  var remainder: nodeLib.Buffer
}

object Decoded {
  @scala.inline
  def apply(data: nodeLib.Buffer | js.Array[nodeLib.Buffer], remainder: nodeLib.Buffer): Decoded = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], remainder = remainder)
  
    __obj.asInstanceOf[Decoded]
  }
}

