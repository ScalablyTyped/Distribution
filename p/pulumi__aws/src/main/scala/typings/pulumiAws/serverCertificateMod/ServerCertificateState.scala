package typings.pulumiAws.serverCertificateMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerCertificateState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the server certificate.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The contents of the public key certificate in
    * PEM-encoded format.
    */
  val certificateBody: js.UndefOr[Input[String]] = js.native
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
  val privateKey: js.UndefOr[Input[String]] = js.native
}

object ServerCertificateState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    certificateBody: Input[String] = null,
    certificateChain: Input[String] = null,
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    path: Input[String] = null,
    privateKey: Input[String] = null
  ): ServerCertificateState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (certificateBody != null) __obj.updateDynamic("certificateBody")(certificateBody.asInstanceOf[js.Any])
    if (certificateChain != null) __obj.updateDynamic("certificateChain")(certificateChain.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerCertificateState]
  }
}

