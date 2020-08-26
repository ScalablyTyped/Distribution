package typings.pulumiAws.certificateValidationMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/acm/certificateValidation", "CertificateValidation")
@js.native
class CertificateValidation protected () extends CustomResource {
  /**
    * Create a CertificateValidation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: CertificateValidationArgs) = this()
  def this(name: String, args: CertificateValidationArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the certificate that is being validated.
    */
  val certificateArn: Output_[String] = js.native
  /**
    * List of FQDNs that implement the validation. Only valid for DNS validation method ACM certificates. If this is set, the resource can implement additional sanity checks and has an explicit dependency on the resource that is implementing the validation
    */
  val validationRecordFqdns: Output_[js.UndefOr[js.Array[String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/acm/certificateValidation", "CertificateValidation")
@js.native
object CertificateValidation extends js.Object {
  /**
    * Get an existing CertificateValidation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): CertificateValidation = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): CertificateValidation = js.native
  def get(name: String, id: Input[ID], state: CertificateValidationState): CertificateValidation = js.native
  def get(name: String, id: Input[ID], state: CertificateValidationState, opts: CustomResourceOptions): CertificateValidation = js.native
  /**
    * Returns true if the given object is an instance of CertificateValidation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/acm/certificateValidation.CertificateValidation */ Boolean = js.native
}

