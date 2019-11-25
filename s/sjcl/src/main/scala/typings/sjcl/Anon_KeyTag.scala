package typings.sjcl

import typings.sjcl.sjclMod.BitArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyTag extends js.Object {
  var key: BitArray
  var tag: BitArray
}

object Anon_KeyTag {
  @scala.inline
  def apply(key: BitArray, tag: BitArray): Anon_KeyTag = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_KeyTag]
  }
}

