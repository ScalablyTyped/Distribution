package typings.pulumiAws.outputMod.elasticbeanstalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetApplicationAppversionLifecycle extends js.Object {
  
  /**
    * Specifies whether delete a version's source bundle from S3 when the application version is deleted.
    */
  var deleteSourceFromS3: Boolean = js.native
  
  /**
    * The number of days to retain an application version.
    */
  var maxAgeInDays: Double = js.native
  
  /**
    * The maximum number of application versions to retain.
    */
  var maxCount: Double = js.native
  
  /**
    * The ARN of an IAM service role under which the application version is deleted.  Elastic Beanstalk must have permission to assume this role.
    */
  var serviceRole: String = js.native
}
object GetApplicationAppversionLifecycle {
  
  @scala.inline
  def apply(deleteSourceFromS3: Boolean, maxAgeInDays: Double, maxCount: Double, serviceRole: String): GetApplicationAppversionLifecycle = {
    val __obj = js.Dynamic.literal(deleteSourceFromS3 = deleteSourceFromS3.asInstanceOf[js.Any], maxAgeInDays = maxAgeInDays.asInstanceOf[js.Any], maxCount = maxCount.asInstanceOf[js.Any], serviceRole = serviceRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationAppversionLifecycle]
  }
  
  @scala.inline
  implicit class GetApplicationAppversionLifecycleOps[Self <: GetApplicationAppversionLifecycle] (val x: Self) extends AnyVal {
    
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
    def setDeleteSourceFromS3(value: Boolean): Self = this.set("deleteSourceFromS3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAgeInDays(value: Double): Self = this.set("maxAgeInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCount(value: Double): Self = this.set("maxCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRole(value: String): Self = this.set("serviceRole", value.asInstanceOf[js.Any])
  }
}
