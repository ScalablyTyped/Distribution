package typings.pulumiAws.distributionConfigurationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.imagebuilder.DistributionConfigurationDistribution
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionConfigurationArgs extends js.Object {
  
  /**
    * Description to apply to the distributed AMI.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * One or more configuration blocks with distribution settings. Detailed below.
    */
  val distributions: Input[js.Array[Input[DistributionConfigurationDistribution]]] = js.native
  
  /**
    * Name to apply to the distributed AMI.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value map of resource tags for the distribution configuration.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object DistributionConfigurationArgs {
  
  @scala.inline
  def apply(distributions: Input[js.Array[Input[DistributionConfigurationDistribution]]]): DistributionConfigurationArgs = {
    val __obj = js.Dynamic.literal(distributions = distributions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionConfigurationArgs]
  }
  
  @scala.inline
  implicit class DistributionConfigurationArgsOps[Self <: DistributionConfigurationArgs] (val x: Self) extends AnyVal {
    
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
    def setDistributionsVarargs(value: Input[DistributionConfigurationDistribution]*): Self = this.set("distributions", js.Array(value :_*))
    
    @scala.inline
    def setDistributions(value: Input[js.Array[Input[DistributionConfigurationDistribution]]]): Self = this.set("distributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
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
