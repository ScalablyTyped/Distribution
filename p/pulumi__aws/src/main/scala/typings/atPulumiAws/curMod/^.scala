package typings.atPulumiAws.curMod

import typings.atPulumiAws.curGetReportDefinitionMod.GetReportDefinitionArgs
import typings.atPulumiAws.curGetReportDefinitionMod.GetReportDefinitionResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cur", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getReportDefinition(args: GetReportDefinitionArgs): js.Promise[GetReportDefinitionResult] with GetReportDefinitionResult = js.native
  def getReportDefinition(args: GetReportDefinitionArgs, opts: InvokeOptions): js.Promise[GetReportDefinitionResult] with GetReportDefinitionResult = js.native
}

