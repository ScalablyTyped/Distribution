package typings.pulumiAws.lambdaMod

import typings.pulumiAws.lambdaGetAliasMod.GetAliasArgs
import typings.pulumiAws.lambdaGetAliasMod.GetAliasResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda", "getAlias")
@js.native
object getAlias extends js.Object {
  def apply(args: GetAliasArgs): js.Promise[GetAliasResult] with GetAliasResult = js.native
  def apply(args: GetAliasArgs, opts: InvokeOptions): js.Promise[GetAliasResult] with GetAliasResult = js.native
}

