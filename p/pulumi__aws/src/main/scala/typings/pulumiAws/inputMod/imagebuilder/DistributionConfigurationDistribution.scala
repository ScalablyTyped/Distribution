package typings.pulumiAws.inputMod.imagebuilder

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionConfigurationDistribution extends js.Object {
  
  /**
    * Configuration block with Amazon Machine Image (AMI) distribution settings. Detailed below.
    */
  var amiDistributionConfiguration: js.UndefOr[Input[DistributionConfigurationDistributionAmiDistributionConfiguration]] = js.native
  
  /**
    * Set of Amazon Resource Names (ARNs) of License Manager License Configurations.
    */
  var licenseConfigurationArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * AWS Region for the distribution.
    */
  var region: Input[String] = js.native
}
object DistributionConfigurationDistribution {
  
  @scala.inline
  def apply(region: Input[String]): DistributionConfigurationDistribution = {
    val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionConfigurationDistribution]
  }
  
  @scala.inline
  implicit class DistributionConfigurationDistributionOps[Self <: DistributionConfigurationDistribution] (val x: Self) extends AnyVal {
    
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
    def setRegion(value: Input[String]): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmiDistributionConfiguration(value: Input[DistributionConfigurationDistributionAmiDistributionConfiguration]): Self = this.set("amiDistributionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmiDistributionConfiguration: Self = this.set("amiDistributionConfiguration", js.undefined)
    
    @scala.inline
    def setLicenseConfigurationArnsVarargs(value: Input[String]*): Self = this.set("licenseConfigurationArns", js.Array(value :_*))
    
    @scala.inline
    def setLicenseConfigurationArns(value: Input[js.Array[Input[String]]]): Self = this.set("licenseConfigurationArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseConfigurationArns: Self = this.set("licenseConfigurationArns", js.undefined)
  }
}
