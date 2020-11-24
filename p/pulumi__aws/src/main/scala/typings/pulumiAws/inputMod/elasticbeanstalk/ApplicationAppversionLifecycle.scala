package typings.pulumiAws.inputMod.elasticbeanstalk

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationAppversionLifecycle extends js.Object {
  
  /**
    * Set to `true` to delete a version's source bundle from S3 when the application version is deleted.
    */
  var deleteSourceFromS3: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The number of days to retain an application version ('max_age_in_days' and 'max_count' cannot be enabled simultaneously.).
    */
  var maxAgeInDays: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The maximum number of application versions to retain ('max_age_in_days' and 'max_count' cannot be enabled simultaneously.).
    */
  var maxCount: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The ARN of an IAM service role under which the application version is deleted.  Elastic Beanstalk must have permission to assume this role.
    */
  var serviceRole: Input[String] = js.native
}
object ApplicationAppversionLifecycle {
  
  @scala.inline
  def apply(serviceRole: Input[String]): ApplicationAppversionLifecycle = {
    val __obj = js.Dynamic.literal(serviceRole = serviceRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationAppversionLifecycle]
  }
  
  @scala.inline
  implicit class ApplicationAppversionLifecycleOps[Self <: ApplicationAppversionLifecycle] (val x: Self) extends AnyVal {
    
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
    def setServiceRole(value: Input[String]): Self = this.set("serviceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteSourceFromS3(value: Input[Boolean]): Self = this.set("deleteSourceFromS3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteSourceFromS3: Self = this.set("deleteSourceFromS3", js.undefined)
    
    @scala.inline
    def setMaxAgeInDays(value: Input[Double]): Self = this.set("maxAgeInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAgeInDays: Self = this.set("maxAgeInDays", js.undefined)
    
    @scala.inline
    def setMaxCount(value: Input[Double]): Self = this.set("maxCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxCount: Self = this.set("maxCount", js.undefined)
  }
}
