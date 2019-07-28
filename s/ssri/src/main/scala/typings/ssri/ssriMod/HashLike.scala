package typings.ssri.ssriMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashLike extends js.Object {
  var algorithm: String
  var digest: String
  var options: js.UndefOr[js.Array[String]] = js.undefined
}

object HashLike {
  @scala.inline
  def apply(algorithm: String, digest: String, options: js.Array[String] = null): HashLike = {
    val __obj = js.Dynamic.literal(algorithm = algorithm, digest = digest)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[HashLike]
  }
}

