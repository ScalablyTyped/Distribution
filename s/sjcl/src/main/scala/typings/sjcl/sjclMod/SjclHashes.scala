package typings.sjcl.sjclMod

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
    val __obj = js.Dynamic.literal(sha1 = sha1.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any], sha512 = sha512.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SjclHashes]
  }
}

