package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects extends js.Object {
  
  /**
    * Boolean which indicates if this criteria is enabled.
    */
  var enabled: Boolean = js.native
}
object BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects {
  
  @scala.inline
  def apply(enabled: Boolean): BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects]
  }
  
  @scala.inline
  implicit class BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsOps[Self <: BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
  }
}
