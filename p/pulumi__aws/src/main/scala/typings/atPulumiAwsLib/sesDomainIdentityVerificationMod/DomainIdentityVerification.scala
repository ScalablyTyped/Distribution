package typings
package atPulumiAwsLib.sesDomainIdentityVerificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ses/domainIdentityVerification", "DomainIdentityVerification")
@js.native
class DomainIdentityVerification protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a DomainIdentityVerification resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: DomainIdentityVerificationArgs) = this()
  def this(name: java.lang.String, args: DomainIdentityVerificationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of the domain identity.
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The domain name of the SES domain identity to verify.
    */
  val domain: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.sesDomainIdentityVerificationMod.DomainIdentityVerification = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.sesDomainIdentityVerificationMod.DomainIdentityVerificationState
  ): atPulumiAwsLib.sesDomainIdentityVerificationMod.DomainIdentityVerification = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.sesDomainIdentityVerificationMod.DomainIdentityVerificationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.sesDomainIdentityVerificationMod.DomainIdentityVerification = js.native
}

