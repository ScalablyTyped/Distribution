package typings.reactInstantsearchCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.StatsProvided> */
@js.native
trait PartialStatsProvided extends js.Object {
  var nbHits: js.UndefOr[Double] = js.native
  var processingTimeMS: js.UndefOr[Double] = js.native
}

object PartialStatsProvided {
  @scala.inline
  def apply(): PartialStatsProvided = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStatsProvided]
  }
  @scala.inline
  implicit class PartialStatsProvidedOps[Self <: PartialStatsProvided] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNbHits(value: Double): Self = this.set("nbHits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNbHits: Self = this.set("nbHits", js.undefined)
    @scala.inline
    def setProcessingTimeMS(value: Double): Self = this.set("processingTimeMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessingTimeMS: Self = this.set("processingTimeMS", js.undefined)
  }
  
}

