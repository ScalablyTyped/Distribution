package typings.pulumiAws.licenseConfigurationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicenseConfigurationState extends js.Object {
  
  /**
    * Description of the license configuration.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * Number of licenses managed by the license configuration.
    */
  val licenseCount: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Sets the number of available licenses as a hard limit.
    */
  val licenseCountHardLimit: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Dimension to use to track license inventory. Specify either `vCPU`, `Instance`, `Core` or `Socket`.
    */
  val licenseCountingType: js.UndefOr[Input[String]] = js.native
  
  /**
    * Array of configured License Manager rules.
    */
  val licenseRules: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Name of the license configuration.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object LicenseConfigurationState {
  
  @scala.inline
  def apply(): LicenseConfigurationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseConfigurationState]
  }
  
  @scala.inline
  implicit class LicenseConfigurationStateOps[Self <: LicenseConfigurationState] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setLicenseCount(value: Input[Double]): Self = this.set("licenseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseCount: Self = this.set("licenseCount", js.undefined)
    
    @scala.inline
    def setLicenseCountHardLimit(value: Input[Boolean]): Self = this.set("licenseCountHardLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseCountHardLimit: Self = this.set("licenseCountHardLimit", js.undefined)
    
    @scala.inline
    def setLicenseCountingType(value: Input[String]): Self = this.set("licenseCountingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseCountingType: Self = this.set("licenseCountingType", js.undefined)
    
    @scala.inline
    def setLicenseRulesVarargs(value: Input[String]*): Self = this.set("licenseRules", js.Array(value :_*))
    
    @scala.inline
    def setLicenseRules(value: Input[js.Array[Input[String]]]): Self = this.set("licenseRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseRules: Self = this.set("licenseRules", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
