package typings.atPulumiAws

import typings.atPulumiAws.s3CannedAclMod.CannedAcl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/s3/cannedAcl", JSImport.Namespace)
@js.native
object s3CannedAclMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atPulumiAws.atPulumiAwsStrings.`private`
    - typings.atPulumiAws.atPulumiAwsStrings.`public-read`
    - typings.atPulumiAws.atPulumiAwsStrings.`public-read-write`
    - typings.atPulumiAws.atPulumiAwsStrings.`aws-exec-read`
    - typings.atPulumiAws.atPulumiAwsStrings.`authenticated-read`
    - typings.atPulumiAws.atPulumiAwsStrings.`bucket-owner-read`
    - typings.atPulumiAws.atPulumiAwsStrings.`bucket-owner-full-control`
    - typings.atPulumiAws.atPulumiAwsStrings.`log-delivery-write`
  */
  trait CannedAcl extends js.Object
  
  var AuthenticatedReadAcl: CannedAcl = js.native
  var AwsExecReadAcl: CannedAcl = js.native
  var BucketOwnerFullControlAcl: CannedAcl = js.native
  var BucketOwnerReadAcl: CannedAcl = js.native
  var LogDeliveryWriteAcl: CannedAcl = js.native
  var PrivateAcl: CannedAcl = js.native
  var PublicReadAcl: CannedAcl = js.native
  var PublicReadWriteAcl: CannedAcl = js.native
}

