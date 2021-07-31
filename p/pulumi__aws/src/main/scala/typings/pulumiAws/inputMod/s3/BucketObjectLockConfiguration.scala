package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketObjectLockConfiguration extends StObject {
  
  /**
    * Indicates whether this bucket has an Object Lock configuration enabled. Valid value is `Enabled`.
    */
  var objectLockEnabled: Input[String]
  
  /**
    * The Object Lock rule in place for this bucket.
    */
  var rule: js.UndefOr[Input[BucketObjectLockConfigurationRule]] = js.undefined
}
object BucketObjectLockConfiguration {
  
  @scala.inline
  def apply(objectLockEnabled: Input[String]): BucketObjectLockConfiguration = {
    val __obj = js.Dynamic.literal(objectLockEnabled = objectLockEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketObjectLockConfiguration]
  }
  
  @scala.inline
  implicit class BucketObjectLockConfigurationMutableBuilder[Self <: BucketObjectLockConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectLockEnabled(value: Input[String]): Self = StObject.set(x, "objectLockEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRule(value: Input[BucketObjectLockConfigurationRule]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
