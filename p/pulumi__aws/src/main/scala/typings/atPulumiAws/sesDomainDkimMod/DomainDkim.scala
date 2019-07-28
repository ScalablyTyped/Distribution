package typings.atPulumiAws.sesDomainDkimMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ses/domainDkim", "DomainDkim")
@js.native
class DomainDkim protected () extends CustomResource {
  /**
    * Create a DomainDkim resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DomainDkimArgs) = this()
  def this(name: String, args: DomainDkimArgs, opts: CustomResourceOptions) = this()
  val dkimTokens: Output[js.Array[String]] = js.native
  /**
    * Verified domain name to generate DKIM tokens for.
    */
  val domain: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ses/domainDkim", "DomainDkim")
@js.native
object DomainDkim extends js.Object {
  /**
    * Get an existing DomainDkim resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): DomainDkim = js.native
  def get(name: String, id: Input[ID], state: DomainDkimState): DomainDkim = js.native
  def get(name: String, id: Input[ID], state: DomainDkimState, opts: CustomResourceOptions): DomainDkim = js.native
  /**
    * Returns true if the given object is an instance of DomainDkim.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/domainDkim.DomainDkim */ Boolean = js.native
}

