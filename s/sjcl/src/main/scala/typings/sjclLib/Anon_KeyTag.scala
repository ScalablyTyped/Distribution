package typings
package sjclLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyTag extends js.Object {
  var key: sjclLib.sjclMod.sjclNs.BitArray
  var tag: sjclLib.sjclMod.sjclNs.BitArray
}

object Anon_KeyTag {
  @scala.inline
  def apply(key: sjclLib.sjclMod.sjclNs.BitArray, tag: sjclLib.sjclMod.sjclNs.BitArray): Anon_KeyTag = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[Anon_KeyTag]
  }
}

