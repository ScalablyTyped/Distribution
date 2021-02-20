package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketLifecycleRuleExpiration extends StObject {
  
  /**
    * Specifies the date after which you want the corresponding action to take effect.
    */
  var date: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies the number of days after object creation when the specific rule action takes effect.
    */
  var days: js.UndefOr[Input[Double]] = js.native
  
  /**
    * On a versioned bucket (versioning-enabled or versioning-suspended bucket), you can add this element in the lifecycle configuration to direct Amazon S3 to delete expired object delete markers.
    */
  var expiredObjectDeleteMarker: js.UndefOr[Input[Boolean]] = js.native
}
object BucketLifecycleRuleExpiration {
  
  @scala.inline
  def apply(): BucketLifecycleRuleExpiration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketLifecycleRuleExpiration]
  }
  
  @scala.inline
  implicit class BucketLifecycleRuleExpirationMutableBuilder[Self <: BucketLifecycleRuleExpiration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Input[String]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDays(value: Input[Double]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
    
    @scala.inline
    def setExpiredObjectDeleteMarker(value: Input[Boolean]): Self = StObject.set(x, "expiredObjectDeleteMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiredObjectDeleteMarkerUndefined: Self = StObject.set(x, "expiredObjectDeleteMarker", js.undefined)
  }
}
