package typings
package atPulumiAwsLib.sesDomainIdentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ses/domainIdentity", "DomainIdentity")
@js.native
class DomainIdentity protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a DomainIdentity resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: DomainIdentityArgs) = this()
  def this(name: java.lang.String, args: DomainIdentityArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of the domain identity.
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The domain name to assign to SES
    */
  val domain: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * A code which when added to the domain as a TXT record
    * will signal to SES that the owner of the domain has authorised SES to act on
    * their behalf. The domain identity will be in state "verification pending"
    * until this is done. See below for an example of how this might be achieved
    * when the domain is hosted in Route 53 and managed by Terraform.  Find out
    * more about verifying domains in Amazon SES in the [AWS SES
    * docs](http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-domains.html).
    */
  val verificationToken: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

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
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.sesDomainIdentityMod.DomainIdentity = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.sesDomainIdentityMod.DomainIdentityState
  ): atPulumiAwsLib.sesDomainIdentityMod.DomainIdentity = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.sesDomainIdentityMod.DomainIdentityState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.sesDomainIdentityMod.DomainIdentity = js.native
}

