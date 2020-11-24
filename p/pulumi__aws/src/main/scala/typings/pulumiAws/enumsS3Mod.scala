package typings.pulumiAws

import typings.pulumiAws.pulumiAwsStrings.`authenticated-read`
import typings.pulumiAws.pulumiAwsStrings.`aws-exec-read`
import typings.pulumiAws.pulumiAwsStrings.`bucket-owner-full-control`
import typings.pulumiAws.pulumiAwsStrings.`bucket-owner-read`
import typings.pulumiAws.pulumiAwsStrings.`log-delivery-write`
import typings.pulumiAws.pulumiAwsStrings.`private`
import typings.pulumiAws.pulumiAwsStrings.`public-read-write`
import typings.pulumiAws.pulumiAwsStrings.`public-read`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/types/enums/s3", JSImport.Namespace)
@js.native
object enumsS3Mod extends js.Object {
  
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
  trait CannedAcl extends js.Object
  @js.native
  object CannedAcl extends js.Object {
    
    val AuthenticatedRead: `authenticated-read` = js.native
    
    val AwsExecRead: `aws-exec-read` = js.native
    
    val BucketOwnerFullControl: `bucket-owner-full-control` = js.native
    
    val BucketOwnerRead: `bucket-owner-read` = js.native
    
    val LogDeliveryWrite: `log-delivery-write` = js.native
    
    val Private: `private` = js.native
    
    val PublicRead: `public-read` = js.native
    
    val PublicReadWrite: `public-read-write` = js.native
  }
}
