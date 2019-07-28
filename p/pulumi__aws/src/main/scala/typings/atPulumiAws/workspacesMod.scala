package typings.atPulumiAws

import typings.atPulumiAws.workspacesGetBundleMod.GetBundleArgs
import typings.atPulumiAws.workspacesGetBundleMod.GetBundleResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/workspaces", JSImport.Namespace)
@js.native
object workspacesMod extends js.Object {
  def getBundle(args: GetBundleArgs): js.Promise[GetBundleResult] with GetBundleResult = js.native
  def getBundle(args: GetBundleArgs, opts: InvokeOptions): js.Promise[GetBundleResult] with GetBundleResult = js.native
}

