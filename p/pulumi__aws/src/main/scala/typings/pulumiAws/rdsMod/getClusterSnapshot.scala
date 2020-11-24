package typings.pulumiAws.rdsMod

import typings.pulumiAws.getClusterSnapshotMod.GetClusterSnapshotArgs
import typings.pulumiAws.getClusterSnapshotMod.GetClusterSnapshotResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/rds", "getClusterSnapshot")
@js.native
object getClusterSnapshot extends js.Object {
  
  def apply(): js.Promise[GetClusterSnapshotResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetClusterSnapshotResult] = js.native
  def apply(args: GetClusterSnapshotArgs): js.Promise[GetClusterSnapshotResult] = js.native
  def apply(args: GetClusterSnapshotArgs, opts: InvokeOptions): js.Promise[GetClusterSnapshotResult] = js.native
}
