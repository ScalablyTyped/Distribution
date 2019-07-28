package typings.atPulumiAws.glueMod

import typings.atPulumiAws.glueGetScriptMod.GetScriptArgs
import typings.atPulumiAws.glueGetScriptMod.GetScriptResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/glue", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getScript(args: GetScriptArgs): js.Promise[GetScriptResult] with GetScriptResult = js.native
  def getScript(args: GetScriptArgs, opts: InvokeOptions): js.Promise[GetScriptResult] with GetScriptResult = js.native
}

