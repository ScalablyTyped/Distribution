package typings.reactInstantsearchCore.anon

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
  def apply(nbHits: js.UndefOr[Double] = js.undefined, processingTimeMS: js.UndefOr[Double] = js.undefined): PartialStatsProvided = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nbHits)) __obj.updateDynamic("nbHits")(nbHits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(processingTimeMS)) __obj.updateDynamic("processingTimeMS")(processingTimeMS.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStatsProvided]
  }
}

