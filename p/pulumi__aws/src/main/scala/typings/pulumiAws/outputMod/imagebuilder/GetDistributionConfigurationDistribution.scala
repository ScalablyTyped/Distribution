package typings.pulumiAws.outputMod.imagebuilder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDistributionConfigurationDistribution extends js.Object {
  
  /**
    * Nested list of AMI distribution configuration.
    */
  var amiDistributionConfigurations: js.Array[GetDistributionConfigurationDistributionAmiDistributionConfiguration] = js.native
  
  /**
    * Set of Amazon Resource Names (ARNs) of License Manager License Configurations.
    */
  var licenseConfigurationArns: js.Array[String] = js.native
  
  /**
    * AWS Region of distribution.
    */
  var region: String = js.native
}
object GetDistributionConfigurationDistribution {
  
  @scala.inline
  def apply(
    amiDistributionConfigurations: js.Array[GetDistributionConfigurationDistributionAmiDistributionConfiguration],
    licenseConfigurationArns: js.Array[String],
    region: String
  ): GetDistributionConfigurationDistribution = {
    val __obj = js.Dynamic.literal(amiDistributionConfigurations = amiDistributionConfigurations.asInstanceOf[js.Any], licenseConfigurationArns = licenseConfigurationArns.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDistributionConfigurationDistribution]
  }
  
  @scala.inline
  implicit class GetDistributionConfigurationDistributionOps[Self <: GetDistributionConfigurationDistribution] (val x: Self) extends AnyVal {
    
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
    def setAmiDistributionConfigurationsVarargs(value: GetDistributionConfigurationDistributionAmiDistributionConfiguration*): Self = this.set("amiDistributionConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setAmiDistributionConfigurations(value: js.Array[GetDistributionConfigurationDistributionAmiDistributionConfiguration]): Self = this.set("amiDistributionConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseConfigurationArnsVarargs(value: String*): Self = this.set("licenseConfigurationArns", js.Array(value :_*))
    
    @scala.inline
    def setLicenseConfigurationArns(value: js.Array[String]): Self = this.set("licenseConfigurationArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
  }
}
