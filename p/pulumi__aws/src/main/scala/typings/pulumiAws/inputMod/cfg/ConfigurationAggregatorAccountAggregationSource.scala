package typings.pulumiAws.inputMod.cfg

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationAggregatorAccountAggregationSource extends js.Object {
  /**
    * List of 12-digit account IDs of the account(s) being aggregated.
    */
  var accountIds: Input[js.Array[Input[String]]] = js.native
  /**
    * If true, aggregate existing AWS Config regions and future regions.
    */
  var allRegions: js.UndefOr[Input[Boolean]] = js.native
  /**
    * List of source regions being aggregated.
    */
  var regions: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object ConfigurationAggregatorAccountAggregationSource {
  @scala.inline
  def apply(accountIds: Input[js.Array[Input[String]]]): ConfigurationAggregatorAccountAggregationSource = {
    val __obj = js.Dynamic.literal(accountIds = accountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationAggregatorAccountAggregationSource]
  }
  @scala.inline
  implicit class ConfigurationAggregatorAccountAggregationSourceOps[Self <: ConfigurationAggregatorAccountAggregationSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountIdsVarargs(value: Input[String]*): Self = this.set("accountIds", js.Array(value :_*))
    @scala.inline
    def setAccountIds(value: Input[js.Array[Input[String]]]): Self = this.set("accountIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllRegions(value: Input[Boolean]): Self = this.set("allRegions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllRegions: Self = this.set("allRegions", js.undefined)
    @scala.inline
    def setRegionsVarargs(value: Input[String]*): Self = this.set("regions", js.Array(value :_*))
    @scala.inline
    def setRegions(value: Input[js.Array[Input[String]]]): Self = this.set("regions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegions: Self = this.set("regions", js.undefined)
  }
  
}

