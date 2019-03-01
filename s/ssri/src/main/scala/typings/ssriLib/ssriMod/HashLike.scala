package typings
package ssriLib.ssriMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashLike extends js.Object {
  var algorithm: java.lang.String
  var digest: java.lang.String
  var options: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object HashLike {
  @scala.inline
  def apply(algorithm: java.lang.String, digest: java.lang.String, options: js.Array[java.lang.String] = null): HashLike = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("algorithm")(algorithm)
    __obj.updateDynamic("digest")(digest)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[HashLike]
  }
}

