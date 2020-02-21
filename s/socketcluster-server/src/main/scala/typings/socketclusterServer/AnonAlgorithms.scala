package typings.socketclusterServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlgorithms extends js.Object {
  var algorithms: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonAlgorithms {
  @scala.inline
  def apply(algorithms: js.Array[String] = null): AnonAlgorithms = {
    val __obj = js.Dynamic.literal()
    if (algorithms != null) __obj.updateDynamic("algorithms")(algorithms.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlgorithms]
  }
}

