package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects extends StObject {
  
  /**
    * Boolean which indicates if this criteria is enabled.
    */
  var enabled: Boolean
}
object BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects {
  
  inline def apply(enabled: Boolean): BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects]
  }
  
  extension [Self <: BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
