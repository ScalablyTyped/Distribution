package typings.pulumiAws.outputMod.cfg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationAggregatorAccountAggregationSource extends js.Object {
  /**
    * List of 12-digit account IDs of the account(s) being aggregated.
    */
  var accountIds: js.Array[String] = js.native
  /**
    * If true, aggregate existing AWS Config regions and future regions.
    */
  var allRegions: js.UndefOr[Boolean] = js.native
  /**
    * List of source regions being aggregated.
    */
  var regions: js.UndefOr[js.Array[String]] = js.native
}

object ConfigurationAggregatorAccountAggregationSource {
  @scala.inline
  def apply(
    accountIds: js.Array[String],
    allRegions: js.UndefOr[Boolean] = js.undefined,
    regions: js.Array[String] = null
  ): ConfigurationAggregatorAccountAggregationSource = {
    val __obj = js.Dynamic.literal(accountIds = accountIds.asInstanceOf[js.Any])
    if (!js.isUndefined(allRegions)) __obj.updateDynamic("allRegions")(allRegions.get.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationAggregatorAccountAggregationSource]
  }
}

