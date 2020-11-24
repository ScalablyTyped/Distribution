package typings.pulumiAws.outputMod.s3control

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketLifecycleConfigurationRuleExpiration extends js.Object {
  
  /**
    * Date the object is to be deleted. Should be in `YYYY-MM-DD` date format, e.g. `2020-09-30`.
    */
  var date: js.UndefOr[String] = js.native
  
  /**
    * Number of days before the object is to be deleted.
    */
  var days: js.UndefOr[Double] = js.native
  
  /**
    * Enable to remove a delete marker with no noncurrent versions. Cannot be specified with `date` or `days`.
    */
  var expiredObjectDeleteMarker: js.UndefOr[Boolean] = js.native
}
object BucketLifecycleConfigurationRuleExpiration {
  
  @scala.inline
  def apply(): BucketLifecycleConfigurationRuleExpiration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketLifecycleConfigurationRuleExpiration]
  }
  
  @scala.inline
  implicit class BucketLifecycleConfigurationRuleExpirationOps[Self <: BucketLifecycleConfigurationRuleExpiration] (val x: Self) extends AnyVal {
    
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
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDays(value: Double): Self = this.set("days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDays: Self = this.set("days", js.undefined)
    
    @scala.inline
    def setExpiredObjectDeleteMarker(value: Boolean): Self = this.set("expiredObjectDeleteMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiredObjectDeleteMarker: Self = this.set("expiredObjectDeleteMarker", js.undefined)
  }
}
