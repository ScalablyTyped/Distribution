package typings.atPulumiAws.simpledbMod

import typings.atPulumiAws.simpledbDomainMod.DomainArgs
import typings.atPulumiAws.simpledbDomainMod.DomainState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/simpledb", "Domain")
@js.native
class Domain protected ()
  extends typings.atPulumiAws.simpledbDomainMod.Domain {
  /**
    * Create a Domain resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: DomainArgs) = this()
  def this(name: String, args: DomainArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/simpledb", "Domain")
@js.native
object Domain extends js.Object {
  /**
    * Get an existing Domain resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.simpledbDomainMod.Domain = js.native
  def get(name: String, id: Input[ID], state: DomainState): typings.atPulumiAws.simpledbDomainMod.Domain = js.native
  def get(name: String, id: Input[ID], state: DomainState, opts: CustomResourceOptions): typings.atPulumiAws.simpledbDomainMod.Domain = js.native
  /**
    * Returns true if the given object is an instance of Domain.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/simpledb/domain.Domain */ Boolean = js.native
}

