package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects extends StObject {
  
  /**
    * Boolean which indicates if this criteria is enabled.
    */
  var enabled: Input[Boolean]
}
object BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects {
  
  inline def apply(enabled: Input[Boolean]): BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects]
  }
  
  extension [Self <: BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects](x: Self) {
    
    inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
