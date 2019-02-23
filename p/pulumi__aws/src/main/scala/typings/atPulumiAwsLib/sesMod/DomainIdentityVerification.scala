package typings
package atPulumiAwsLib.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ses", "DomainIdentityVerification")
@js.native
class DomainIdentityVerification protected ()
  extends atPulumiAwsLib.sesDomainIdentityVerificationMod.DomainIdentityVerification {
  /**
    * Create a DomainIdentityVerification resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.sesDomainIdentityVerificationMod.DomainIdentityVerificationArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.sesDomainIdentityVerificationMod.DomainIdentityVerificationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ses", "DomainIdentityVerification")
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

