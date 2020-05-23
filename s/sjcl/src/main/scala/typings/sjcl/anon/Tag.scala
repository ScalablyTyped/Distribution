package typings.sjcl.anon

import typings.sjcl.mod.BitArray_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  var key: BitArray_
  var tag: BitArray_
}

object Tag {
  @scala.inline
  def apply(key: BitArray_, tag: BitArray_): Tag = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
}

