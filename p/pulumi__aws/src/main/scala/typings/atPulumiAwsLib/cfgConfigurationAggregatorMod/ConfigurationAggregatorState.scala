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

