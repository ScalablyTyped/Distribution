package typings.pulumiAws.configurationAggregatorMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.cfg.ConfigurationAggregatorAccountAggregationSource
import typings.pulumiAws.inputMod.cfg.ConfigurationAggregatorOrganizationAggregationSource
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationAggregatorArgs extends js.Object {
  
  /**
    * The account(s) to aggregate config data from as documented below.
    */
  val accountAggregationSource: js.UndefOr[Input[ConfigurationAggregatorAccountAggregationSource]] = js.native
  
  /**
    * The name of the configuration aggregator.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The organization to aggregate config data from as documented below.
    */
  val organizationAggregationSource: js.UndefOr[Input[ConfigurationAggregatorOrganizationAggregationSource]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object ConfigurationAggregatorArgs {
  
  @scala.inline
  def apply(): ConfigurationAggregatorArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationAggregatorArgs]
  }
  
  @scala.inline
  implicit class ConfigurationAggregatorArgsOps[Self <: ConfigurationAggregatorArgs] (val x: Self) extends AnyVal {
    
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
    def setAccountAggregationSource(value: Input[ConfigurationAggregatorAccountAggregationSource]): Self = this.set("accountAggregationSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountAggregationSource: Self = this.set("accountAggregationSource", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOrganizationAggregationSource(value: Input[ConfigurationAggregatorOrganizationAggregationSource]): Self = this.set("organizationAggregationSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizationAggregationSource: Self = this.set("organizationAggregationSource", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
