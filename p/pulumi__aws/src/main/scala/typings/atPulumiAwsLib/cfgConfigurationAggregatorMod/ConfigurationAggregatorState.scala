package typings
package atPulumiAwsLib.cfgConfigurationAggregatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationAggregatorState extends js.Object {
  /**
    * The account(s) to aggregate config data from as documented below.
    */
  val accountAggregationSource: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AccountIdsAllRegions]] = js.undefined
  /**
    * The ARN of the aggregator
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the configuration aggregator.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The organization to aggregate config data from as documented below.
    */
  val organizationAggregationSource: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AllRegionsRegions]] = js.undefined
}

object ConfigurationAggregatorState {
  @scala.inline
  def apply(
    accountAggregationSource: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AccountIdsAllRegions] = null,
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    organizationAggregationSource: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AllRegionsRegions] = null
  ): ConfigurationAggregatorState = {
    val __obj = js.Dynamic.literal()
    if (accountAggregationSource != null) __obj.updateDynamic("accountAggregationSource")(accountAggregationSource.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (organizationAggregationSource != null) __obj.updateDynamic("organizationAggregationSource")(organizationAggregationSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationAggregatorState]
  }
}

