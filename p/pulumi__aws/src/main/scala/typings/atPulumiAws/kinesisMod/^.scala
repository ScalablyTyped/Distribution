package typings.atPulumiAws.kinesisMod

import typings.atPulumiAws.kinesisGetStreamMod.GetStreamArgs
import typings.atPulumiAws.kinesisGetStreamMod.GetStreamResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/kinesis", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getStream(args: GetStreamArgs): js.Promise[GetStreamResult] with GetStreamResult = js.native
  def getStream(args: GetStreamArgs, opts: InvokeOptions): js.Promise[GetStreamResult] with GetStreamResult = js.native
}

