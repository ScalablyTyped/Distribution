package typings.pulumiAws.dmsCertificateMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/dms/certificate", "Certificate")
@js.native
class Certificate protected () extends CustomResource {
  /**
    * Create a Certificate resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: CertificateArgs) = this()
  def this(name: String, args: CertificateArgs, opts: CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) for the certificate.
    */
  val certificateArn: Output_[String] = js.native
  /**
    * The certificate identifier.
    */
  val certificateId: Output_[String] = js.native
  /**
    * The contents of the .pem X.509 certificate file for the certificate. Either `certificatePem` or `certificateWallet` must be set.
    */
  val certificatePem: Output_[js.UndefOr[String]] = js.native
  /**
    * The contents of the Oracle Wallet certificate for use with SSL. Either `certificatePem` or `certificateWallet` must be set.
    */
  val certificateWallet: Output_[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/dms/certificate", "Certificate")
@js.native
object Certificate extends js.Object {
  /**
    * Get an existing Certificate resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Certificate = js.native
  def get(name: String, id: Input[ID], state: CertificateState): Certificate = js.native
  def get(name: String, id: Input[ID], state: CertificateState, opts: CustomResourceOptions): Certificate = js.native
  /**
    * Returns true if the given object is an instance of Certificate.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/certificate.Certificate */ Boolean = js.native
}

