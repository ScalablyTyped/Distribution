package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketLifecycleRuleNoncurrentVersionExpiration extends StObject {
  
  /**
    * Specifies the number of days noncurrent object versions expire.
    */
  var days: js.UndefOr[Double] = js.native
}
object BucketLifecycleRuleNoncurrentVersionExpiration {
  
  @scala.inline
  def apply(): BucketLifecycleRuleNoncurrentVersionExpiration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketLifecycleRuleNoncurrentVersionExpiration]
  }
  
  @scala.inline
  implicit class BucketLifecycleRuleNoncurrentVersionExpirationMutableBuilder[Self <: BucketLifecycleRuleNoncurrentVersionExpiration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
  }
}
