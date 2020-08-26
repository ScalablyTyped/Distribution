package typings.pulumiAws.iamMod

import typings.pulumiAws.getServerCertificateMod.GetServerCertificateArgs
import typings.pulumiAws.getServerCertificateMod.GetServerCertificateResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam", "getServerCertificate")
@js.native
object getServerCertificate extends js.Object {
  def apply(): js.Promise[GetServerCertificateResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetServerCertificateResult] = js.native
  def apply(args: GetServerCertificateArgs): js.Promise[GetServerCertificateResult] = js.native
  def apply(args: GetServerCertificateArgs, opts: InvokeOptions): js.Promise[GetServerCertificateResult] = js.native
}

