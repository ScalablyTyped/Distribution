package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "servicequotas")
@js.native
object servicequotasNs extends js.Object {
  def getService(args: atPulumiAwsLib.servicequotasGetServiceMod.GetServiceArgs): js.Promise[atPulumiAwsLib.servicequotasGetServiceMod.GetServiceResult] = js.native
  def getService(
    args: atPulumiAwsLib.servicequotasGetServiceMod.GetServiceArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.servicequotasGetServiceMod.GetServiceResult] = js.native
  def getServiceQuota(args: atPulumiAwsLib.servicequotasGetServiceQuotaMod.GetServiceQuotaArgs): js.Promise[atPulumiAwsLib.servicequotasGetServiceQuotaMod.GetServiceQuotaResult] = js.native
  def getServiceQuota(
    args: atPulumiAwsLib.servicequotasGetServiceQuotaMod.GetServiceQuotaArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.servicequotasGetServiceQuotaMod.GetServiceQuotaResult] = js.native
}

