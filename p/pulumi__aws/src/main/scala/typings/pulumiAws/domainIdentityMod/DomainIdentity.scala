package typings.pulumiAws.domainIdentityMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ses/domainIdentity", "DomainIdentity")
@js.native
class DomainIdentity protected () extends CustomResource {
  /**
    * Create a DomainIdentity resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DomainIdentityArgs) = this()
  def this(name: String, args: DomainIdentityArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of the domain identity.
    */
  val arn: Output_[String] = js.native
  
  /**
    * The domain name to assign to SES
    */
  val domain: Output_[String] = js.native
  
  /**
    * A code which when added to the domain as a TXT record
    * will signal to SES that the owner of the domain has authorised SES to act on
    * their behalf. The domain identity will be in state "verification pending"
    * until this is done. See below for an example of how this might be achieved
    * when the domain is hosted in Route 53 and managed by this provider.  Find out
    * more about verifying domains in Amazon SES in the [AWS SES
    * docs](http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-domains.html).
    */
  val verificationToken: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ses/domainIdentity", "DomainIdentity")
@js.native
object DomainIdentity extends js.Object {
  
  /**
    * Get an existing DomainIdentity resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): DomainIdentity = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): DomainIdentity = js.native
  def get(name: String, id: Input[ID], state: DomainIdentityState): DomainIdentity = js.native
  def get(name: String, id: Input[ID], state: DomainIdentityState, opts: CustomResourceOptions): DomainIdentity = js.native
  
  /**
    * Returns true if the given object is an instance of DomainIdentity.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/domainIdentity.DomainIdentity */ Boolean = js.native
}
