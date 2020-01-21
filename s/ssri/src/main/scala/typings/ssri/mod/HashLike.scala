package typings.ssri.mod

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
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], digest = digest.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashLike]
  }
}

