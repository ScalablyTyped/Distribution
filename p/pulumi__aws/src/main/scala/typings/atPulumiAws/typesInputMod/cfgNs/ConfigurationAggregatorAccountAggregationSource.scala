package typings.atPulumiAws.typesInputMod.cfgNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationAggregatorAccountAggregationSource extends js.Object {
  /**
    * List of 12-digit account IDs of the account(s) being aggregated.
    */
  var accountIds: Input[js.Array[Input[String]]]
  /**
    * If true, aggregate existing AWS Config regions and future regions.
    */
  var allRegions: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * List of source regions being aggregated.
    */
  var regions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object ConfigurationAggregatorAccountAggregationSource {
  @scala.inline
  def apply(
    accountIds: Input[js.Array[Input[String]]],
    allRegions: Input[Boolean] = null,
    regions: Input[js.Array[Input[String]]] = null
  ): ConfigurationAggregatorAccountAggregationSource = {
    val __obj = js.Dynamic.literal(accountIds = accountIds.asInstanceOf[js.Any])
    if (allRegions != null) __obj.updateDynamic("allRegions")(allRegions.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationAggregatorAccountAggregationSource]
  }
}

