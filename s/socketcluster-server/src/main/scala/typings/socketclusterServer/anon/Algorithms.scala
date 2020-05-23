package typings.socketclusterServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Algorithms extends js.Object {
  var algorithms: js.UndefOr[js.Array[String]] = js.undefined
}

object Algorithms {
  @scala.inline
  def apply(algorithms: js.Array[String] = null): Algorithms = {
    val __obj = js.Dynamic.literal()
    if (algorithms != null) __obj.updateDynamic("algorithms")(algorithms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algorithms]
  }
}

