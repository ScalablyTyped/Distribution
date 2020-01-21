package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlgorithm extends js.Object {
  var algorithm: js.UndefOr[String] = js.undefined
}

object AnonAlgorithm {
  @scala.inline
  def apply(algorithm: String = null): AnonAlgorithm = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlgorithm]
  }
}

