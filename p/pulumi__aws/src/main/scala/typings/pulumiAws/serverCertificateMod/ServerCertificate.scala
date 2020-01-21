package typings.pulumiAws.serverCertificateMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam/serverCertificate", "ServerCertificate")
@js.native
class ServerCertificate protected () extends CustomResource {
  /**
    * Create a ServerCertificate resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ServerCertificateArgs) = this()
  def this(name: String, args: ServerCertificateArgs, opts: CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) specifying the server certificate.
    */
  val arn: Output_[String] = js.native
  /**
    * The contents of the public key certificate in
    * PEM-encoded format.
    */
  val certificateBody: Output_[String] = js.native
  /**
    * The contents of the certificate chain.
    * This is typically a concatenation of the PEM-encoded public key certificates
    * of the chain.
    */
  val certificateChain: Output_[js.UndefOr[String]] = js.native
  /**
    * The name of the Server Certificate. Do not include the
    * path in this value. If omitted, this provider will assign a random, unique name.
    */
  val name: Output_[String] = js.native
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: Output_[js.UndefOr[String]] = js.native
  /**
    * The IAM path for the server certificate.  If it is not
    * included, it defaults to a slash (/). If this certificate is for use with
    * AWS CloudFront, the path must be in format `/cloudfront/your_path_here`.
    * See [IAM Identifiers][1] for more details on IAM Paths.
    */
  val path: Output_[js.UndefOr[String]] = js.native
  /**
    * The contents of the private key in PEM-encoded format.
    */
  val privateKey: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/iam/serverCertificate", "ServerCertificate")
@js.native
object ServerCertificate extends js.Object {
  /**
    * Get an existing ServerCertificate resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): ServerCertificate = js.native
  def get(name: String, id: Input[ID], state: ServerCertificateState): ServerCertificate = js.native
  def get(name: String, id: Input[ID], state: ServerCertificateState, opts: CustomResourceOptions): ServerCertificate = js.native
  /**
    * Returns true if the given object is an instance of ServerCertificate.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/serverCertificate.ServerCertificate */ Boolean = js.native
}

