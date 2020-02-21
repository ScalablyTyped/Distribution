package typings.socketclusterServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlgorithm extends js.Object {
  var algorithm: js.UndefOr[String] = js.undefined
  var expiresIn: Double
}

object AnonAlgorithm {
  @scala.inline
  def apply(expiresIn: Double, algorithm: String = null): AnonAlgorithm = {
    val __obj = js.Dynamic.literal(expiresIn = expiresIn.asInstanceOf[js.Any])
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlgorithm]
  }
}

