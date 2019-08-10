package typings.atPulumiAws.s3Mod

import typings.atPulumiAws.s3CannedAclMod.CannedAcl
import typings.atPulumiAws.s3GetBucketMod.GetBucketArgs
import typings.atPulumiAws.s3GetBucketMod.GetBucketResult
import typings.atPulumiAws.s3GetBucketObjectMod.GetBucketObjectArgs
import typings.atPulumiAws.s3GetBucketObjectMod.GetBucketObjectResult
import typings.atPulumiAws.s3GetBucketObjectsMod.GetBucketObjectsArgs
import typings.atPulumiAws.s3GetBucketObjectsMod.GetBucketObjectsResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/s3", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var AuthenticatedReadAcl: CannedAcl = js.native
  var AwsExecReadAcl: CannedAcl = js.native
  var BucketOwnerFullControlAcl: CannedAcl = js.native
  var BucketOwnerReadAcl: CannedAcl = js.native
  var LogDeliveryWriteAcl: CannedAcl = js.native
  var PrivateAcl: CannedAcl = js.native
  var PublicReadAcl: CannedAcl = js.native
  var PublicReadWriteAcl: CannedAcl = js.native
  def getBucket(args: GetBucketArgs): js.Promise[GetBucketResult] with GetBucketResult = js.native
  def getBucket(args: GetBucketArgs, opts: InvokeOptions): js.Promise[GetBucketResult] with GetBucketResult = js.native
  def getBucketObject(args: GetBucketObjectArgs): js.Promise[GetBucketObjectResult] with GetBucketObjectResult = js.native
  def getBucketObject(args: GetBucketObjectArgs, opts: InvokeOptions): js.Promise[GetBucketObjectResult] with GetBucketObjectResult = js.native
  def getBucketObjects(args: GetBucketObjectsArgs): js.Promise[GetBucketObjectsResult] with GetBucketObjectsResult = js.native
  def getBucketObjects(args: GetBucketObjectsArgs, opts: InvokeOptions): js.Promise[GetBucketObjectsResult] with GetBucketObjectsResult = js.native
}

