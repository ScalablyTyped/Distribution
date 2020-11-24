package typings.pulumiAws.getInfrastructureConfigurationMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInfrastructureConfigurationArgs extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of the infrastructure configuration.
    */
  val arn: String = js.native
  
  /**
    * Key-value map of resource tags for the infrastructure created by the infrastructure configuration.
    */
  val resourceTags: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Key-value map of resource tags for the infrastructure configuration.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}
object GetInfrastructureConfigurationArgs {
  
  @scala.inline
  def apply(arn: String): GetInfrastructureConfigurationArgs = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInfrastructureConfigurationArgs]
  }
  
  @scala.inline
  implicit class GetInfrastructureConfigurationArgsOps[Self <: GetInfrastructureConfigurationArgs] (val x: Self) extends AnyVal {
    
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
    def setResourceTags(value: StringDictionary[String]): Self = this.set("resourceTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceTags: Self = this.set("resourceTags", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
