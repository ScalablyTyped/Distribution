package typings.atPulumiAws.elasticsearchDomainPolicyMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticsearch/domainPolicy", "DomainPolicy")
@js.native
class DomainPolicy protected () extends CustomResource {
  /**
    * Create a DomainPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DomainPolicyArgs) = this()
  def this(name: String, args: DomainPolicyArgs, opts: CustomResourceOptions) = this()
  /**
    * IAM policy document specifying the access policies for the domain
    */
  val accessPolicies: Output[String] = js.native
  /**
    * Name of the domain.
    */
  val domainName: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/elasticsearch/domainPolicy", "DomainPolicy")
@js.native
object DomainPolicy extends js.Object {
  /**
    * Get an existing DomainPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): DomainPolicy = js.native
  def get(name: String, id: Input[ID], state: DomainPolicyState): DomainPolicy = js.native
  def get(name: String, id: Input[ID], state: DomainPolicyState, opts: CustomResourceOptions): DomainPolicy = js.native
  /**
    * Returns true if the given object is an instance of DomainPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticsearch/domainPolicy.DomainPolicy */ Boolean = js.native
}

