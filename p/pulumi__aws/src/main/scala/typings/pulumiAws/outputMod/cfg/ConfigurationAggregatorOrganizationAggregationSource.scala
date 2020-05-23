package typings.pulumiAws.outputMod.cfg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationAggregatorOrganizationAggregationSource extends js.Object {
  /**
    * If true, aggregate existing AWS Config regions and future regions.
    */
  var allRegions: js.UndefOr[Boolean] = js.native
  /**
    * List of source regions being aggregated.
    */
  var regions: js.UndefOr[js.Array[String]] = js.native
  /**
    * ARN of the IAM role used to retrieve AWS Organization details associated with the aggregator account.
    */
  var roleArn: String = js.native
}

object ConfigurationAggregatorOrganizationAggregationSource {
  @scala.inline
  def apply(roleArn: String, allRegions: js.UndefOr[Boolean] = js.undefined, regions: js.Array[String] = null): ConfigurationAggregatorOrganizationAggregationSource = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any])
    if (!js.isUndefined(allRegions)) __obj.updateDynamic("allRegions")(allRegions.get.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationAggregatorOrganizationAggregationSource]
  }
}

