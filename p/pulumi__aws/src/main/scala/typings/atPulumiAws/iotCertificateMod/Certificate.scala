package typings.atPulumiAws.iotCertificateMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iot/certificate", "Certificate")
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
    * Boolean flag to indicate if the certificate should be active
    */
  val active: Output[Boolean] = js.native
  /**
    * The ARN of the created AWS IoT certificate
    */
  val arn: Output[String] = js.native
  /**
    * The certificate signing request. Review the
    * [IoT API Reference Guide] (http://docs.aws.amazon.com/iot/latest/apireference/API_CreateCertificateFromCsr.html)
    * for more information on creating a certificate from a certificate signing request (CSR).
    */
  val csr: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/iot/certificate", "Certificate")
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
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/certificate.Certificate */ Boolean = js.native
}

