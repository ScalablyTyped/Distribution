package typings.pulumiAws.inputMod.ssm

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociationOutputLocation extends StObject {
  
  /**
    * The S3 bucket name.
    */
  var s3BucketName: Input[String]
  
  /**
    * The S3 bucket prefix. Results stored in the root if not configured.
    */
  var s3KeyPrefix: js.UndefOr[Input[String]] = js.undefined
}
object AssociationOutputLocation {
  
  inline def apply(s3BucketName: Input[String]): AssociationOutputLocation = {
    val __obj = js.Dynamic.literal(s3BucketName = s3BucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationOutputLocation]
  }
  
  extension [Self <: AssociationOutputLocation](x: Self) {
    
    inline def setS3BucketName(value: Input[String]): Self = StObject.set(x, "s3BucketName", value.asInstanceOf[js.Any])
    
    inline def setS3KeyPrefix(value: Input[String]): Self = StObject.set(x, "s3KeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setS3KeyPrefixUndefined: Self = StObject.set(x, "s3KeyPrefix", js.undefined)
  }
}
