package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects extends StObject {
  
  /**
    * Boolean which indicates if this criteria is enabled.
    */
  var enabled: Input[Boolean] = js.native
}
object BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects {
  
  @scala.inline
  def apply(enabled: Input[Boolean]): BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects]
  }
  
  @scala.inline
  implicit class BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsMutableBuilder[Self <: BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
