package typings.pulumiAws

import typings.pulumiAws.pulumiAwsStrings.`authenticated-read`
import typings.pulumiAws.pulumiAwsStrings.`aws-exec-read`
import typings.pulumiAws.pulumiAwsStrings.`bucket-owner-full-control`
import typings.pulumiAws.pulumiAwsStrings.`bucket-owner-read`
import typings.pulumiAws.pulumiAwsStrings.`log-delivery-write`
import typings.pulumiAws.pulumiAwsStrings.`private`
import typings.pulumiAws.pulumiAwsStrings.`public-read-write`
import typings.pulumiAws.pulumiAwsStrings.`public-read`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enumsS3Mod {
  
  /* Inlined { readonly Private :'private',  readonly PublicRead :'public-read',  readonly PublicReadWrite :'public-read-write',  readonly AwsExecRead :'aws-exec-read',  readonly AuthenticatedRead :'authenticated-read',  readonly BucketOwnerRead :'bucket-owner-read',  readonly BucketOwnerFullControl :'bucket-owner-full-control',  readonly LogDeliveryWrite :'log-delivery-write'}[keyof { readonly Private :'private',  readonly PublicRead :'public-read',  readonly PublicReadWrite :'public-read-write',  readonly AwsExecRead :'aws-exec-read',  readonly AuthenticatedRead :'authenticated-read',  readonly BucketOwnerRead :'bucket-owner-read',  readonly BucketOwnerFullControl :'bucket-owner-full-control',  readonly LogDeliveryWrite :'log-delivery-write'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.pulumiAws.pulumiAwsStrings.`bucket-owner-full-control`
    - typings.pulumiAws.pulumiAwsStrings.`public-read-write`
    - typings.pulumiAws.pulumiAwsStrings.`log-delivery-write`
    - typings.pulumiAws.pulumiAwsStrings.`private`
    - typings.pulumiAws.pulumiAwsStrings.`authenticated-read`
    - typings.pulumiAws.pulumiAwsStrings.`aws-exec-read`
    - typings.pulumiAws.pulumiAwsStrings.`bucket-owner-read`
    - typings.pulumiAws.pulumiAwsStrings.`public-read`
  */
  trait CannedAcl extends StObject
  object CannedAcl {
    
    @JSImport("@pulumi/aws/types/enums/s3", "CannedAcl.AuthenticatedRead")
    @js.native
    val AuthenticatedRead: `authenticated-read` = js.native
    
    @JSImport("@pulumi/aws/types/enums/s3", "CannedAcl.AwsExecRead")
    @js.native
    val AwsExecRead: `aws-exec-read` = js.native
    
    @JSImport("@pulumi/aws/types/enums/s3", "CannedAcl.BucketOwnerFullControl")
    @js.native
    val BucketOwnerFullControl: `bucket-owner-full-control` = js.native
    
    @JSImport("@pulumi/aws/types/enums/s3", "CannedAcl.BucketOwnerRead")
    @js.native
    val BucketOwnerRead: `bucket-owner-read` = js.native
    
    @JSImport("@pulumi/aws/types/enums/s3", "CannedAcl.LogDeliveryWrite")
    @js.native
    val LogDeliveryWrite: `log-delivery-write` = js.native
    
    @JSImport("@pulumi/aws/types/enums/s3", "CannedAcl.Private")
    @js.native
    val Private: `private` = js.native
    
    @JSImport("@pulumi/aws/types/enums/s3", "CannedAcl.PublicRead")
    @js.native
    val PublicRead: `public-read` = js.native
    
    @JSImport("@pulumi/aws/types/enums/s3", "CannedAcl.PublicReadWrite")
    @js.native
    val PublicReadWrite: `public-read-write` = js.native
  }
}
