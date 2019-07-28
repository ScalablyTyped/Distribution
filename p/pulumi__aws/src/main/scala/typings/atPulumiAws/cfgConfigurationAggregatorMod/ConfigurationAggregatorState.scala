package typings.atPulumiAws.cfgConfigurationAggregatorMod

import typings.atPulumiAws.Anon_AccountIdsAllRegions
import typings.atPulumiAws.Anon_AllRegionsRegions
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationAggregatorState extends js.Object {
  /**
    * The account(s) to aggregate config data from as documented below.
    */
  val accountAggregationSource: js.UndefOr[Input[Anon_AccountIdsAllRegions]] = js.undefined
  /**
    * The ARN of the aggregator
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the configuration aggregator.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The organization to aggregate config data from as documented below.
    */
  val organizationAggregationSource: js.UndefOr[Input[Anon_AllRegionsRegions]] = js.undefined
}

object ConfigurationAggregatorState {
  @scala.inline
  def apply(
    accountAggregationSource: Input[Anon_AccountIdsAllRegions] = null,
    arn: Input[String] = null,
    name: Input[String] = null,
    organizationAggregationSource: Input[Anon_AllRegionsRegions] = null
  ): ConfigurationAggregatorState = {
    val __obj = js.Dynamic.literal()
    if (accountAggregationSource != null) __obj.updateDynamic("accountAggregationSource")(accountAggregationSource.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (organizationAggregationSource != null) __obj.updateDynamic("organizationAggregationSource")(organizationAggregationSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationAggregatorState]
  }
}

