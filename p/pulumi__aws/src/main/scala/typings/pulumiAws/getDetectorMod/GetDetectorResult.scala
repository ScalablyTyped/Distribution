package typings.pulumiAws.getDetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDetectorResult extends js.Object {
  
  /**
    * The frequency of notifications sent about subsequent finding occurrences.
    */
  val findingPublishingFrequency: String = js.native
  
  val id: js.UndefOr[String] = js.native
  
  /**
    * The service-linked role that grants GuardDuty access to the resources in the AWS account.
    */
  val serviceRoleArn: String = js.native
  
  /**
    * The current status of the detector.
    */
  val status: String = js.native
}
object GetDetectorResult {
  
  @scala.inline
  def apply(findingPublishingFrequency: String, serviceRoleArn: String, status: String): GetDetectorResult = {
    val __obj = js.Dynamic.literal(findingPublishingFrequency = findingPublishingFrequency.asInstanceOf[js.Any], serviceRoleArn = serviceRoleArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDetectorResult]
  }
  
  @scala.inline
  implicit class GetDetectorResultOps[Self <: GetDetectorResult] (val x: Self) extends AnyVal {
    
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
    def setFindingPublishingFrequency(value: String): Self = this.set("findingPublishingFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRoleArn(value: String): Self = this.set("serviceRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}
