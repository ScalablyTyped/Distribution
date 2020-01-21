package typings.sjcl

import typings.sjcl.mod.BitArray_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyTag extends js.Object {
  var key: BitArray_
  var tag: BitArray_
}

object AnonKeyTag {
  @scala.inline
  def apply(key: BitArray_, tag: BitArray_): AnonKeyTag = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKeyTag]
  }
}

