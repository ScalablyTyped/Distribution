package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.getArnMod.GetArnArgs
import typings.atPulumiAws.getArnMod.GetArnResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "getArn")
@js.native
object getArn extends js.Object {
  def apply(args: GetArnArgs): js.Promise[GetArnResult] with GetArnResult = js.native
  def apply(args: GetArnArgs, opts: InvokeOptions): js.Promise[GetArnResult] with GetArnResult = js.native
}

