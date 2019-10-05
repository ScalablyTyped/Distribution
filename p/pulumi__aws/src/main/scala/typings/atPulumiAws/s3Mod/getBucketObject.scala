package typings.atPulumiAws.s3Mod

import typings.atPulumiAws.s3GetBucketObjectMod.GetBucketObjectArgs
import typings.atPulumiAws.s3GetBucketObjectMod.GetBucketObjectResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/s3", "getBucketObject")
@js.native
object getBucketObject extends js.Object {
  def apply(args: GetBucketObjectArgs): js.Promise[GetBucketObjectResult] with GetBucketObjectResult = js.native
  def apply(args: GetBucketObjectArgs, opts: InvokeOptions): js.Promise[GetBucketObjectResult] with GetBucketObjectResult = js.native
}

