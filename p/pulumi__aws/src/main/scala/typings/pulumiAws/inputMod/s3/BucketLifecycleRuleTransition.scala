package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketLifecycleRuleTransition extends StObject {
  
  /**
    * Specifies the date after which you want the corresponding action to take effect.
    */
  var date: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Specifies the number of days after object creation when the specific rule action takes effect.
    */
  var days: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Specifies the Amazon S3 storage class to which you want the object to transition. Can be `ONEZONE_IA`, `STANDARD_IA`, `INTELLIGENT_TIERING`, `GLACIER`, or `DEEP_ARCHIVE`.
    */
  var storageClass: Input[String]
}
object BucketLifecycleRuleTransition {
  
  @scala.inline
  def apply(storageClass: Input[String]): BucketLifecycleRuleTransition = {
    val __obj = js.Dynamic.literal(storageClass = storageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLifecycleRuleTransition]
  }
  
  @scala.inline
  implicit class BucketLifecycleRuleTransitionMutableBuilder[Self <: BucketLifecycleRuleTransition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Input[String]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDays(value: Input[Double]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
    
    @scala.inline
    def setStorageClass(value: Input[String]): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
  }
}
