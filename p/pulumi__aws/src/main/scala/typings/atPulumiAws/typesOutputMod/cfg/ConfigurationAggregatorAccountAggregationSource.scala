package typings.atPulumiAws.typesOutputMod.cfg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationAggregatorAccountAggregationSource extends js.Object {
  /**
    * List of 12-digit account IDs of the account(s) being aggregated.
    */
  var accountIds: js.Array[String]
  /**
    * If true, aggregate existing AWS Config regions and future regions.
    */
  var allRegions: js.UndefOr[Boolean] = js.undefined
  /**
    * List of source regions being aggregated.
    */
  var regions: js.UndefOr[js.Array[String]] = js.undefined
}

object ConfigurationAggregatorAccountAggregationSource {
  @scala.inline
  def apply(
    accountIds: js.Array[String],
    allRegions: js.UndefOr[Boolean] = js.undefined,
    regions: js.Array[String] = null
  ): ConfigurationAggregatorAccountAggregationSource = {
    val __obj = js.Dynamic.literal(accountIds = accountIds)
    if (!js.isUndefined(allRegions)) __obj.updateDynamic("allRegions")(allRegions)
    if (regions != null) __obj.updateDynamic("regions")(regions)
    __obj.asInstanceOf[ConfigurationAggregatorAccountAggregationSource]
  }
}

