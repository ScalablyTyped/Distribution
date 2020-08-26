package typings.promClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SummaryConfiguration extends js.Object {
  var ageBuckets: js.UndefOr[Double] = js.native
  var aggregator: js.UndefOr[Aggregator] = js.native
  var compressCount: js.UndefOr[Double] = js.native
  var help: String = js.native
  var labelNames: js.UndefOr[js.Array[String]] = js.native
  var maxAgeSeconds: js.UndefOr[Double] = js.native
  var name: String = js.native
  var percentiles: js.UndefOr[js.Array[Double]] = js.native
  var registers: js.UndefOr[js.Array[Registry]] = js.native
}

object SummaryConfiguration {
  @scala.inline
  def apply(help: String, name: String): SummaryConfiguration = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummaryConfiguration]
  }
  @scala.inline
  implicit class SummaryConfigurationOps[Self <: SummaryConfiguration] (val x: Self) extends AnyVal {
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
    def setHelp(value: String): Self = this.set("help", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAgeBuckets(value: Double): Self = this.set("ageBuckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgeBuckets: Self = this.set("ageBuckets", js.undefined)
    @scala.inline
    def setAggregator(value: Aggregator): Self = this.set("aggregator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregator: Self = this.set("aggregator", js.undefined)
    @scala.inline
    def setCompressCount(value: Double): Self = this.set("compressCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompressCount: Self = this.set("compressCount", js.undefined)
    @scala.inline
    def setLabelNamesVarargs(value: String*): Self = this.set("labelNames", js.Array(value :_*))
    @scala.inline
    def setLabelNames(value: js.Array[String]): Self = this.set("labelNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelNames: Self = this.set("labelNames", js.undefined)
    @scala.inline
    def setMaxAgeSeconds(value: Double): Self = this.set("maxAgeSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAgeSeconds: Self = this.set("maxAgeSeconds", js.undefined)
    @scala.inline
    def setPercentilesVarargs(value: Double*): Self = this.set("percentiles", js.Array(value :_*))
    @scala.inline
    def setPercentiles(value: js.Array[Double]): Self = this.set("percentiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentiles: Self = this.set("percentiles", js.undefined)
    @scala.inline
    def setRegistersVarargs(value: Registry*): Self = this.set("registers", js.Array(value :_*))
    @scala.inline
    def setRegisters(value: js.Array[Registry]): Self = this.set("registers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegisters: Self = this.set("registers", js.undefined)
  }
  
}

