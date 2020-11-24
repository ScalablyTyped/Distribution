package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketReplicationConfigurationRuleSourceSelectionCriteria extends js.Object {
  
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
  implicit class BucketReplicationConfigurationRuleSourceSelectionCriteriaOps[Self <: BucketReplicationConfigurationRuleSourceSelectionCriteria] (val x: Self) extends AnyVal {
    
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
    def setSseKmsEncryptedObjects(value: Input[BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects]): Self = this.set("sseKmsEncryptedObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSseKmsEncryptedObjects: Self = this.set("sseKmsEncryptedObjects", js.undefined)
  }
}
