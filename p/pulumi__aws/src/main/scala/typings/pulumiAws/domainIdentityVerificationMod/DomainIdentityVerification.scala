package typings.pulumiAws.domainIdentityVerificationMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ses/domainIdentityVerification", "DomainIdentityVerification")
@js.native
class DomainIdentityVerification protected () extends CustomResource {
  /**
    * Create a DomainIdentityVerification resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DomainIdentityVerificationArgs) = this()
  def this(name: String, args: DomainIdentityVerificationArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the domain identity.
    */
  val arn: Output_[String] = js.native
  /**
    * The domain name of the SES domain identity to verify.
    */
  val domain: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ses/domainIdentityVerification", "DomainIdentityVerification")
@js.native
object DomainIdentityVerification extends js.Object {
  /**
    * Get an existing DomainIdentityVerification resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): DomainIdentityVerification = js.native
  def get(name: String, id: Input[ID], state: DomainIdentityVerificationState): DomainIdentityVerification = js.native
  def get(name: String, id: Input[ID], state: DomainIdentityVerificationState, opts: CustomResourceOptions): DomainIdentityVerification = js.native
  /**
    * Returns true if the given object is an instance of DomainIdentityVerification.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/domainIdentityVerification.DomainIdentityVerification */ Boolean = js.native
}

