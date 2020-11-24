package typings.pulumiAws.enumsMod

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

@JSImport("@pulumi/aws/types/enums", "s3")
@js.native
object s3 extends js.Object {
  
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
