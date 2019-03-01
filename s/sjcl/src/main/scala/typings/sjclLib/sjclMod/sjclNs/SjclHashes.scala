package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclHashes extends js.Object {
  var sha1: SjclHashStatic
  var sha256: SjclHashStatic
  var sha512: SjclHashStatic
}

object SjclHashes {
  @scala.inline
  def apply(sha1: SjclHashStatic, sha256: SjclHashStatic, sha512: SjclHashStatic): SjclHashes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sha1")(sha1)
    __obj.updateDynamic("sha256")(sha256)
    __obj.updateDynamic("sha512")(sha512)
    __obj.asInstanceOf[SjclHashes]
  }
}

