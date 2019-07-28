package typings.atPulumiAws.cloudformationMod

import typings.atPulumiAws.cloudformationGetExportMod.GetExportArgs
import typings.atPulumiAws.cloudformationGetExportMod.GetExportResult
import typings.atPulumiAws.cloudformationGetStackMod.GetStackArgs
import typings.atPulumiAws.cloudformationGetStackMod.GetStackResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudformation", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getExport(args: GetExportArgs): js.Promise[GetExportResult] with GetExportResult = js.native
  def getExport(args: GetExportArgs, opts: InvokeOptions): js.Promise[GetExportResult] with GetExportResult = js.native
  def getStack(args: GetStackArgs): js.Promise[GetStackResult] with GetStackResult = js.native
  def getStack(args: GetStackArgs, opts: InvokeOptions): js.Promise[GetStackResult] with GetStackResult = js.native
}

