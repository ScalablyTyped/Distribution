package typings.atPulumiAws.acmMod

import typings.atPulumiAws.acmCertificateValidationMod.CertificateValidationArgs
import typings.atPulumiAws.acmCertificateValidationMod.CertificateValidationState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/acm", "CertificateValidation")
@js.native
class CertificateValidation protected ()
  extends typings.atPulumiAws.acmCertificateValidationMod.CertificateValidation {
  /**
    * Create a CertificateValidation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: CertificateValidationArgs) = this()
  def this(name: String, args: CertificateValidationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/acm", "CertificateValidation")
@js.native
object CertificateValidation extends js.Object {
  /**
    * Get an existing CertificateValidation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.acmCertificateValidationMod.CertificateValidation = js.native
  def get(name: String, id: Input[ID], state: CertificateValidationState): typings.atPulumiAws.acmCertificateValidationMod.CertificateValidation = js.native
  def get(name: String, id: Input[ID], state: CertificateValidationState, opts: CustomResourceOptions): typings.atPulumiAws.acmCertificateValidationMod.CertificateValidation = js.native
  /**
    * Returns true if the given object is an instance of CertificateValidation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/acm/certificateValidation.CertificateValidation */ Boolean = js.native
}

