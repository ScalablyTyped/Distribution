package typings.atPulumiAws.cloudtrailMod

import typings.atPulumiAws.cloudtrailGetServiceAccountMod.GetServiceAccountArgs
import typings.atPulumiAws.cloudtrailGetServiceAccountMod.GetServiceAccountResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudtrail", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getServiceAccount(): js.Promise[GetServiceAccountResult] with GetServiceAccountResult = js.native
  def getServiceAccount(args: GetServiceAccountArgs): js.Promise[GetServiceAccountResult] with GetServiceAccountResult = js.native
  def getServiceAccount(args: GetServiceAccountArgs, opts: InvokeOptions): js.Promise[GetServiceAccountResult] with GetServiceAccountResult = js.native
}

