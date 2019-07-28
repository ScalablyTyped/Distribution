package typings.atPulumiAws.acmMod

import typings.atPulumiAws.acmGetCertificateMod.GetCertificateArgs
import typings.atPulumiAws.acmGetCertificateMod.GetCertificateResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/acm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getCertificate(args: GetCertificateArgs): js.Promise[GetCertificateResult] with GetCertificateResult = js.native
  def getCertificate(args: GetCertificateArgs, opts: InvokeOptions): js.Promise[GetCertificateResult] with GetCertificateResult = js.native
}

