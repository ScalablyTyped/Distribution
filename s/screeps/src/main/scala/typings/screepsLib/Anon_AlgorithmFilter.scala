package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlgorithmFilter extends js.Object {
  var algorithm: js.UndefOr[java.lang.String] = js.undefined
  var filter: js.UndefOr[js.Any | java.lang.String] = js.undefined
}

object Anon_AlgorithmFilter {
  @scala.inline
  def apply(algorithm: java.lang.String = null, filter: js.Any | java.lang.String = null): Anon_AlgorithmFilter = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AlgorithmFilter]
  }
}

