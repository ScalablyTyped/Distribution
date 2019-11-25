package typings.sjcl

import typings.sjcl.sjclMod.BitArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: BitArray
  var salt: BitArray
}

object Anon_Key {
  @scala.inline
  def apply(key: BitArray, salt: BitArray): Anon_Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Key]
  }
}

