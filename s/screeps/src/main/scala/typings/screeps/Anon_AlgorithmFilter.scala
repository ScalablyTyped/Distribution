package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlgorithmFilter extends js.Object {
  var algorithm: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[js.Any | String] = js.undefined
}

object Anon_AlgorithmFilter {
  @scala.inline
  def apply(algorithm: String = null, filter: js.Any | String = null): Anon_AlgorithmFilter = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AlgorithmFilter]
  }
}

