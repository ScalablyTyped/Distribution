package typings.pulumiAws.ssmMod

import typings.pulumiAws.getParameterMod.GetParameterArgs
import typings.pulumiAws.getParameterMod.GetParameterResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ssm", "getParameter")
@js.native
object getParameter extends js.Object {
  
  def apply(args: GetParameterArgs): js.Promise[GetParameterResult] = js.native
  def apply(args: GetParameterArgs, opts: InvokeOptions): js.Promise[GetParameterResult] = js.native
}
