package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Algorithm extends js.Object {
  var algorithm: js.UndefOr[String] = js.undefined
}

object Algorithm {
  @scala.inline
  def apply(algorithm: String = null): Algorithm = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algorithm]
  }
}

