package typings
package atPulumiAwsLib.iamServerCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerCertificateState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the server certificate.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The contents of the public key certificate in
    * PEM-encoded format.
    */
  val certificateBody: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The contents of the certificate chain.
    * This is typically a concatenation of the PEM-encoded public key certificates
    * of the chain.
    */
  val certificateChain: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the Server Certificate. Do not include the
    * path in this value. If omitted, Terraform will assign a random, unique name.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The IAM path for the server certificate.  If it is not
    * included, it defaults to a slash (/). If this certificate is for use with
    * AWS CloudFront, the path must be in format `/cloudfront/your_path_here`.
    * See [IAM Identifiers][1] for more details on IAM Paths.
    */
  val path: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The contents of the private key in PEM-encoded format.
    */
  val privateKey: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

