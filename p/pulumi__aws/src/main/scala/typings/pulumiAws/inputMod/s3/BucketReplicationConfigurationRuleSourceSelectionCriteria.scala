package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketReplicationConfigurationRuleSourceSelectionCriteria extends StObject {
  
  /**
    * Match SSE-KMS encrypted objects (documented below). If specified, `replicaKmsKeyId`
    * in `destination` must be specified as well.
    */
  var sseKmsEncryptedObjects: js.UndefOr[
    Input[BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects]
  ] = js.native
}
object BucketReplicationConfigurationRuleSourceSelectionCriteria {
  
  @scala.inline
  def apply(): BucketReplicationConfigurationRuleSourceSelectionCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketReplicationConfigurationRuleSourceSelectionCriteria]
  }
  
  @scala.inline
  implicit class BucketReplicationConfigurationRuleSourceSelectionCriteriaMutableBuilder[Self <: BucketReplicationConfigurationRuleSourceSelectionCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSseKmsEncryptedObjects(value: Input[BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects]): Self = StObject.set(x, "sseKmsEncryptedObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSseKmsEncryptedObjectsUndefined: Self = StObject.set(x, "sseKmsEncryptedObjects", js.undefined)
  }
}
