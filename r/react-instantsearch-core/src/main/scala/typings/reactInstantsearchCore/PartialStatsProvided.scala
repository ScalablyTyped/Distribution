package typings.reactInstantsearchCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.StatsProvided> */
trait PartialStatsProvided extends js.Object {
  var nbHits: js.UndefOr[Double] = js.undefined
  var processingTimeMS: js.UndefOr[Double] = js.undefined
}

object PartialStatsProvided {
  @scala.inline
  def apply(nbHits: Int | Double = null, processingTimeMS: Int | Double = null): PartialStatsProvided = {
    val __obj = js.Dynamic.literal()
    if (nbHits != null) __obj.updateDynamic("nbHits")(nbHits.asInstanceOf[js.Any])
    if (processingTimeMS != null) __obj.updateDynamic("processingTimeMS")(processingTimeMS.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStatsProvided]
  }
}

