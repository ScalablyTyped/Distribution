package typings.pulumiAws.mod.lambda

import typings.pulumiAws.lambdaGetAliasMod.GetAliasArgs
import typings.pulumiAws.lambdaGetAliasMod.GetAliasResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "lambda.getAlias")
@js.native
object getAlias extends js.Object {
  
  def apply(args: GetAliasArgs): js.Promise[GetAliasResult] = js.native
  def apply(args: GetAliasArgs, opts: InvokeOptions): js.Promise[GetAliasResult] = js.native
}
