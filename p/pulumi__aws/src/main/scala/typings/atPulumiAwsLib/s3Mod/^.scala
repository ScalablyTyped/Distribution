package typings
package atPulumiAwsLib.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/s3", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var AuthenticatedReadAcl: atPulumiAwsLib.s3CannedAclMod.CannedAcl = js.native
  var AwsExecReadAcl: atPulumiAwsLib.s3CannedAclMod.CannedAcl = js.native
  var BucketOwnerFullControlAcl: atPulumiAwsLib.s3CannedAclMod.CannedAcl = js.native
  var BucketOwnerReadAcl: atPulumiAwsLib.s3CannedAclMod.CannedAcl = js.native
  var LogDeliveryWriteAcl: atPulumiAwsLib.s3CannedAclMod.CannedAcl = js.native
  var PrivateAcl: atPulumiAwsLib.s3CannedAclMod.CannedAcl = js.native
  var PublicReadAcl: atPulumiAwsLib.s3CannedAclMod.CannedAcl = js.native
  var PublicReadWriteAcl: atPulumiAwsLib.s3CannedAclMod.CannedAcl = js.native
  def getBucket(args: atPulumiAwsLib.s3GetBucketMod.GetBucketArgs): js.Promise[atPulumiAwsLib.s3GetBucketMod.GetBucketResult] with atPulumiAwsLib.s3GetBucketMod.GetBucketResult = js.native
  def getBucket(args: atPulumiAwsLib.s3GetBucketMod.GetBucketArgs, opts: atPulumiPulumiLib.invokeMod.InvokeOptions): js.Promise[atPulumiAwsLib.s3GetBucketMod.GetBucketResult] with atPulumiAwsLib.s3GetBucketMod.GetBucketResult = js.native
  def getBucketObject(args: atPulumiAwsLib.s3GetBucketObjectMod.GetBucketObjectArgs): js.Promise[atPulumiAwsLib.s3GetBucketObjectMod.GetBucketObjectResult] with atPulumiAwsLib.s3GetBucketObjectMod.GetBucketObjectResult = js.native
  def getBucketObject(
    args: atPulumiAwsLib.s3GetBucketObjectMod.GetBucketObjectArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.s3GetBucketObjectMod.GetBucketObjectResult] with atPulumiAwsLib.s3GetBucketObjectMod.GetBucketObjectResult = js.native
}

