package typings.sjcl

import typings.sjcl.mod.BitArray_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTag extends js.Object {
  var key: BitArray_
  var tag: BitArray_
}

object AnonTag {
  @scala.inline
  def apply(key: BitArray_, tag: BitArray_): AnonTag = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTag]
  }
}

