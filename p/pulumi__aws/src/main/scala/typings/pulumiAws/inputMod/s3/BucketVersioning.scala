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
  
  inline def apply(): BucketVersioning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketVersioning]
  }
  
  extension [Self <: BucketVersioning](x: Self) {
    
    inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMfaDelete(value: Input[Boolean]): Self = StObject.set(x, "mfaDelete", value.asInstanceOf[js.Any])
    
    inline def setMfaDeleteUndefined: Self = StObject.set(x, "mfaDelete", js.undefined)
  }
}
