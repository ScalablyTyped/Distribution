package typings.pulumiAws.serverCertificateMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerCertificateArgs extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the server certificate.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The contents of the public key certificate in
    * PEM-encoded format.
    */
  val certificateBody: Input[String] = js.native
  /**
    * The contents of the certificate chain.
    * This is typically a concatenation of the PEM-encoded public key certificates
    * of the chain.
    */
  val certificateChain: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the Server Certificate. Do not include the
    * path in this value. If omitted, this provider will assign a random, unique name.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  /**
    * The IAM path for the server certificate.  If it is not
    * included, it defaults to a slash (/). If this certificate is for use with
    * AWS CloudFront, the path must be in format `/cloudfront/your_path_here`.
    * See [IAM Identifiers][1] for more details on IAM Paths.
    */
  val path: js.UndefOr[Input[String]] = js.native
  /**
    * The contents of the private key in PEM-encoded format.
    */
  val privateKey: Input[String] = js.native
}

object ServerCertificateArgs {
  @scala.inline
  def apply(
    certificateBody: Input[String],
    privateKey: Input[String],
    arn: Input[String] = null,
    certificateChain: Input[String] = null,
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    path: Input[String] = null
  ): ServerCertificateArgs = {
    val __obj = js.Dynamic.literal(certificateBody = certificateBody.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (certificateChain != null) __obj.updateDynamic("certificateChain")(certificateChain.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerCertificateArgs]
  }
}

