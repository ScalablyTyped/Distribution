package typings.atPulumiAws.typesInputMod.cfgNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationAggregatorOrganizationAggregationSource extends js.Object {
  /**
    * If true, aggregate existing AWS Config regions and future regions.
    */
  var allRegions: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * List of source regions being aggregated.
    */
  var regions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * ARN of the IAM role used to retrieve AWS Organization details associated with the aggregator account.
    */
  var roleArn: Input[String]
}

object ConfigurationAggregatorOrganizationAggregationSource {
  @scala.inline
  def apply(
    roleArn: Input[String],
    allRegions: Input[Boolean] = null,
    regions: Input[js.Array[Input[String]]] = null
  ): ConfigurationAggregatorOrganizationAggregationSource = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any])
    if (allRegions != null) __obj.updateDynamic("allRegions")(allRegions.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationAggregatorOrganizationAggregationSource]
  }
}

