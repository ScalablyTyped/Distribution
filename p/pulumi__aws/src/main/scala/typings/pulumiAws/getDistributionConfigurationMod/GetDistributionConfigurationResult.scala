package typings.pulumiAws.getDistributionConfigurationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.imagebuilder.GetDistributionConfigurationDistribution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDistributionConfigurationResult extends js.Object {
  
  val arn: String = js.native
  
  /**
    * Date the distribution configuration was created.
    */
  val dateCreated: String = js.native
  
  /**
    * Date the distribution configuration was updated.
    */
  val dateUpdated: String = js.native
  
  /**
    * Description to apply to distributed AMI.
    */
  val description: String = js.native
  
  /**
    * Set of distributions.
    */
  val distributions: js.Array[GetDistributionConfigurationDistribution] = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * Name of the distribution configuration.
    */
  val name: String = js.native
  
  /**
    * Key-value map of resource tags for the distribution configuration.
    */
  val tags: StringDictionary[String] = js.native
}
object GetDistributionConfigurationResult {
  
  @scala.inline
  def apply(
    arn: String,
    dateCreated: String,
    dateUpdated: String,
    description: String,
    distributions: js.Array[GetDistributionConfigurationDistribution],
    id: String,
    name: String,
    tags: StringDictionary[String]
  ): GetDistributionConfigurationResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], distributions = distributions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDistributionConfigurationResult]
  }
  
  @scala.inline
  implicit class GetDistributionConfigurationResultOps[Self <: GetDistributionConfigurationResult] (val x: Self) extends AnyVal {
    
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateCreated(value: String): Self = this.set("dateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUpdated(value: String): Self = this.set("dateUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionsVarargs(value: GetDistributionConfigurationDistribution*): Self = this.set("distributions", js.Array(value :_*))
    
    @scala.inline
    def setDistributions(value: js.Array[GetDistributionConfigurationDistribution]): Self = this.set("distributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
}
