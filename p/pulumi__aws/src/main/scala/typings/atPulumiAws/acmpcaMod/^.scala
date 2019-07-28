package typings.atPulumiAws.acmpcaMod

import typings.atPulumiAws.acmpcaGetCertificateAuthorityMod.GetCertificateAuthorityArgs
import typings.atPulumiAws.acmpcaGetCertificateAuthorityMod.GetCertificateAuthorityResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/acmpca", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getCertificateAuthority(args: GetCertificateAuthorityArgs): js.Promise[GetCertificateAuthorityResult] with GetCertificateAuthorityResult = js.native
  def getCertificateAuthority(args: GetCertificateAuthorityArgs, opts: InvokeOptions): js.Promise[GetCertificateAuthorityResult] with GetCertificateAuthorityResult = js.native
}

