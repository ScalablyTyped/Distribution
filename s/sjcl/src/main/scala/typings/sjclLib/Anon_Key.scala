package typings
package sjclLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: sjclLib.sjclMod.sjclNs.BitArray
  var salt: sjclLib.sjclMod.sjclNs.BitArray
}

object Anon_Key {
  @scala.inline
  def apply(key: sjclLib.sjclMod.sjclNs.BitArray, salt: sjclLib.sjclMod.sjclNs.BitArray): Anon_Key = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("salt")(salt)
    __obj.asInstanceOf[Anon_Key]
  }
}

