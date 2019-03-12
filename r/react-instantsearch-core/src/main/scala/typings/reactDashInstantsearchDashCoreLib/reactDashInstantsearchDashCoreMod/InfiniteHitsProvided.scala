package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfiniteHitsProvided[THit] extends js.Object {
  /** indicates if there are more pages to load */
  var hasMore: scala.Boolean
  /** the records that matched the search */
  var hits: js.Array[THit]
  /** a function to toggle the refinement */
  def refine(args: js.Any*): js.Any
}

object InfiniteHitsProvided {
  @scala.inline
  def apply[THit](hasMore: scala.Boolean, hits: js.Array[THit], refine: /* repeated */ js.Any => js.Any): InfiniteHitsProvided[THit] = {
    val __obj = js.Dynamic.literal(hasMore = hasMore, hits = hits, refine = js.Any.fromFunction1(refine))
  
    __obj.asInstanceOf[InfiniteHitsProvided[THit]]
  }
}

