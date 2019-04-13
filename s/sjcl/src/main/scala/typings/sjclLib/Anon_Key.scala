package typings
package sjclLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: sjclLib.sjclMod.BitArray
  var salt: sjclLib.sjclMod.BitArray
}

object Anon_Key {
  @scala.inline
  def apply(key: sjclLib.sjclMod.BitArray, salt: sjclLib.sjclMod.BitArray): Anon_Key = {
    val __obj = js.Dynamic.literal(key = key, salt = salt)
  
    __obj.asInstanceOf[Anon_Key]
  }
}

