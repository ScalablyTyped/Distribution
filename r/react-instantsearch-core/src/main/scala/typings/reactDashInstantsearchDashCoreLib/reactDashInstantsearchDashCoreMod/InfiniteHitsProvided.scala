package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfiniteHitsProvided[THit] extends js.Object {
  /** indicates if there are more pages to load */
  var hasMore: scala.Boolean
  var hasPrevious: scala.Boolean
  /** the records that matched the search */
  var hits: js.Array[THit]
  def refineNext(args: js.Any*): js.Any
  def refinePrevious(args: js.Any*): js.Any
}

object InfiniteHitsProvided {
  @scala.inline
  def apply[THit](
    hasMore: scala.Boolean,
    hasPrevious: scala.Boolean,
    hits: js.Array[THit],
    refineNext: /* repeated */ js.Any => js.Any,
    refinePrevious: /* repeated */ js.Any => js.Any
  ): InfiniteHitsProvided[THit] = {
    val __obj = js.Dynamic.literal(hasMore = hasMore, hasPrevious = hasPrevious, hits = hits, refineNext = js.Any.fromFunction1(refineNext), refinePrevious = js.Any.fromFunction1(refinePrevious))
  
    __obj.asInstanceOf[InfiniteHitsProvided[THit]]
  }
}

