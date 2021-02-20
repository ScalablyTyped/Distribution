package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketLifecycleRuleNoncurrentVersionTransition extends StObject {
  
  /**
    * Specifies the number of days noncurrent object versions transition.
    */
  var days: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Specifies the Amazon S3 storage class to which you want the noncurrent object versions to transition. Can be `ONEZONE_IA`, `STANDARD_IA`, `INTELLIGENT_TIERING`, `GLACIER`, or `DEEP_ARCHIVE`.
    */
  var storageClass: Input[String] = js.native
}
object BucketLifecycleRuleNoncurrentVersionTransition {
  
  @scala.inline
  def apply(storageClass: Input[String]): BucketLifecycleRuleNoncurrentVersionTransition = {
    val __obj = js.Dynamic.literal(storageClass = storageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLifecycleRuleNoncurrentVersionTransition]
  }
  
  @scala.inline
  implicit class BucketLifecycleRuleNoncurrentVersionTransitionMutableBuilder[Self <: BucketLifecycleRuleNoncurrentVersionTransition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDays(value: Input[Double]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
    
    @scala.inline
    def setStorageClass(value: Input[String]): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
  }
}
