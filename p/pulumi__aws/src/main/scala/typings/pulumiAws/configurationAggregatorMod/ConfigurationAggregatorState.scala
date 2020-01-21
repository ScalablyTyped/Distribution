package typings.pulumiAws.configurationAggregatorMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.cfg.ConfigurationAggregatorAccountAggregationSource
import typings.pulumiAws.inputMod.cfg.ConfigurationAggregatorOrganizationAggregationSource
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationAggregatorState extends js.Object {
  /**
    * The account(s) to aggregate config data from as documented below.
    */
  val accountAggregationSource: js.UndefOr[Input[ConfigurationAggregatorAccountAggregationSource]] = js.native
  /**
    * The ARN of the aggregator
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the configuration aggregator.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The organization to aggregate config data from as documented below.
    */
  val organizationAggregationSource: js.UndefOr[Input[ConfigurationAggregatorOrganizationAggregationSource]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ConfigurationAggregatorState {
  @scala.inline
  def apply(
    accountAggregationSource: Input[ConfigurationAggregatorAccountAggregationSource] = null,
    arn: Input[String] = null,
    name: Input[String] = null,
    organizationAggregationSource: Input[ConfigurationAggregatorOrganizationAggregationSource] = null,
    tags: Input[StringDictionary[_]] = null
  ): ConfigurationAggregatorState = {
    val __obj = js.Dynamic.literal()
    if (accountAggregationSource != null) __obj.updateDynamic("accountAggregationSource")(accountAggregationSource.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (organizationAggregationSource != null) __obj.updateDynamic("organizationAggregationSource")(organizationAggregationSource.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationAggregatorState]
  }
}

