package typings.pulumiAws.analyticsConfigurationMod

import typings.pulumiAws.inputMod.s3.AnalyticsConfigurationFilter
import typings.pulumiAws.inputMod.s3.AnalyticsConfigurationStorageClassAnalysis
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsConfigurationArgs extends js.Object {
  val bucket: Input[String] = js.native
  val filter: js.UndefOr[Input[AnalyticsConfigurationFilter]] = js.native
  val name: js.UndefOr[Input[String]] = js.native
  val storageClassAnalysis: js.UndefOr[Input[AnalyticsConfigurationStorageClassAnalysis]] = js.native
}

object AnalyticsConfigurationArgs {
  @scala.inline
  def apply(
    bucket: Input[String],
    filter: Input[AnalyticsConfigurationFilter] = null,
    name: Input[String] = null,
    storageClassAnalysis: Input[AnalyticsConfigurationStorageClassAnalysis] = null
  ): AnalyticsConfigurationArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (storageClassAnalysis != null) __obj.updateDynamic("storageClassAnalysis")(storageClassAnalysis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsConfigurationArgs]
  }
}

