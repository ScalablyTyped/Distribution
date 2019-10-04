package typings.atPulumiAws.typesOutputMod.cfgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationAggregatorOrganizationAggregationSource extends js.Object {
  /**
    * If true, aggregate existing AWS Config regions and future regions.
    */
  var allRegions: js.UndefOr[Boolean] = js.undefined
  /**
    * List of source regions being aggregated.
    */
  var regions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * ARN of the IAM role used to retrieve AWS Organization details associated with the aggregator account.
    */
  var roleArn: String
}

object ConfigurationAggregatorOrganizationAggregationSource {
  @scala.inline
  def apply(roleArn: String, allRegions: js.UndefOr[Boolean] = js.undefined, regions: js.Array[String] = null): ConfigurationAggregatorOrganizationAggregationSource = {
    val __obj = js.Dynamic.literal(roleArn = roleArn)
    if (!js.isUndefined(allRegions)) __obj.updateDynamic("allRegions")(allRegions)
    if (regions != null) __obj.updateDynamic("regions")(regions)
    __obj.asInstanceOf[ConfigurationAggregatorOrganizationAggregationSource]
  }
}

