package typings.pulumiAws.mod.s3

import typings.pulumiAws.getBucketObjectsMod.GetBucketObjectsArgs
import typings.pulumiAws.getBucketObjectsMod.GetBucketObjectsResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "s3.getBucketObjects")
@js.native
object getBucketObjects extends js.Object {
  def apply(args: GetBucketObjectsArgs): js.Promise[GetBucketObjectsResult] = js.native
  def apply(args: GetBucketObjectsArgs, opts: InvokeOptions): js.Promise[GetBucketObjectsResult] = js.native
}

