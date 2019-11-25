package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Algorithm extends js.Object {
  var algorithm: js.UndefOr[String] = js.undefined
}

object Anon_Algorithm {
  @scala.inline
  def apply(algorithm: String = null): Anon_Algorithm = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Algorithm]
  }
}

