package typings.atPulumiAws.servicequotasMod

import typings.atPulumiAws.servicequotasGetServiceMod.GetServiceArgs
import typings.atPulumiAws.servicequotasGetServiceMod.GetServiceResult
import typings.atPulumiAws.servicequotasGetServiceQuotaMod.GetServiceQuotaArgs
import typings.atPulumiAws.servicequotasGetServiceQuotaMod.GetServiceQuotaResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/servicequotas", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getService(args: GetServiceArgs): js.Promise[GetServiceResult] with GetServiceResult = js.native
  def getService(args: GetServiceArgs, opts: InvokeOptions): js.Promise[GetServiceResult] with GetServiceResult = js.native
  def getServiceQuota(args: GetServiceQuotaArgs): js.Promise[GetServiceQuotaResult] with GetServiceQuotaResult = js.native
  def getServiceQuota(args: GetServiceQuotaArgs, opts: InvokeOptions): js.Promise[GetServiceQuotaResult] with GetServiceQuotaResult = js.native
}

