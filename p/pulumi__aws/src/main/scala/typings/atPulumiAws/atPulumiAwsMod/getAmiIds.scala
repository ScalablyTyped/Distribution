package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.getAmiIdsMod.GetAmiIdsArgs
import typings.atPulumiAws.getAmiIdsMod.GetAmiIdsResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "getAmiIds")
@js.native
object getAmiIds extends js.Object {
  def apply(args: GetAmiIdsArgs): js.Promise[GetAmiIdsResult] with GetAmiIdsResult = js.native
  def apply(args: GetAmiIdsArgs, opts: InvokeOptions): js.Promise[GetAmiIdsResult] with GetAmiIdsResult = js.native
}

