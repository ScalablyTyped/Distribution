package typings.sjcl.anon

import typings.sjcl.mod.BitArray_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var key: BitArray_
  var salt: BitArray_
}

object Key {
  @scala.inline
  def apply(key: BitArray_, salt: BitArray_): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

