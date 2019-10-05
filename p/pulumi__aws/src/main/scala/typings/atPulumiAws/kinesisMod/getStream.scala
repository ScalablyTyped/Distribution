package typings.atPulumiAws.kinesisMod

import typings.atPulumiAws.kinesisGetStreamMod.GetStreamArgs
import typings.atPulumiAws.kinesisGetStreamMod.GetStreamResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/kinesis", "getStream")
@js.native
object getStream extends js.Object {
  def apply(args: GetStreamArgs): js.Promise[GetStreamResult] with GetStreamResult = js.native
  def apply(args: GetStreamArgs, opts: InvokeOptions): js.Promise[GetStreamResult] with GetStreamResult = js.native
}

