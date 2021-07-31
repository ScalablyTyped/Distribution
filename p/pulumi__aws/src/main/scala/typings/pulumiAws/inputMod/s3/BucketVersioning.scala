package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketVersioning extends StObject {
  
  /**
    * Enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket.
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Enable MFA delete for either `Change the versioning state of your bucket` or `Permanently delete an object version`. Default is `false`. This cannot be used to toggle this setting but is available to allow managed buckets to reflect the state in AWS
    */
  var mfaDelete: js.UndefOr[Input[Boolean]] = js.undefined
}
object BucketVersioning {
  
  @scala.inline
  def apply(): BucketVersioning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketVersioning]
  }
  
  @scala.inline
  implicit class BucketVersioningMutableBuilder[Self <: BucketVersioning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setMfaDelete(value: Input[Boolean]): Self = StObject.set(x, "mfaDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMfaDeleteUndefined: Self = StObject.set(x, "mfaDelete", js.undefined)
  }
}
