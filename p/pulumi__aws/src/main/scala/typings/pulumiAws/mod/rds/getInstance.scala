package typings.pulumiAws.mod.rds

import typings.pulumiAws.rdsGetInstanceMod.GetInstanceArgs
import typings.pulumiAws.rdsGetInstanceMod.GetInstanceResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "rds.getInstance")
@js.native
object getInstance extends js.Object {
  
  def apply(args: GetInstanceArgs): js.Promise[GetInstanceResult] = js.native
  def apply(args: GetInstanceArgs, opts: InvokeOptions): js.Promise[GetInstanceResult] = js.native
}
