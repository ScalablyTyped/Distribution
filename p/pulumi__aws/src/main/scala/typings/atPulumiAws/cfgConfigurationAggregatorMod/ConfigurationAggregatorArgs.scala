package typings.atPulumiAws.cfgConfigurationAggregatorMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.cfg.ConfigurationAggregatorAccountAggregationSource
import typings.atPulumiAws.typesInputMod.cfg.ConfigurationAggregatorOrganizationAggregationSource
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationAggregatorArgs extends js.Object {
  /**
    * The account(s) to aggregate config data from as documented below.
    */
  val accountAggregationSource: js.UndefOr[Input[ConfigurationAggregatorAccountAggregationSource]] = js.undefined
  /**
    * The name of the configuration aggregator.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The organization to aggregate config data from as documented below.
    */
  val organizationAggregationSource: js.UndefOr[Input[ConfigurationAggregatorOrganizationAggregationSource]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object ConfigurationAggregatorArgs {
  @scala.inline
  def apply(
    accountAggregationSource: Input[ConfigurationAggregatorAccountAggregationSource] = null,
    name: Input[String] = null,
    organizationAggregationSource: Input[ConfigurationAggregatorOrganizationAggregationSource] = null,
    tags: Input[StringDictionary[_]] = null
  ): ConfigurationAggregatorArgs = {
    val __obj = js.Dynamic.literal()
    if (accountAggregationSource != null) __obj.updateDynamic("accountAggregationSource")(accountAggregationSource.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (organizationAggregationSource != null) __obj.updateDynamic("organizationAggregationSource")(organizationAggregationSource.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationAggregatorArgs]
  }
}

