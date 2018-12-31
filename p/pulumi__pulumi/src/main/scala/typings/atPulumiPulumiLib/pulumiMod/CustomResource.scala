package typings
package atPulumiPulumiLib.pulumiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "CustomResource")
@js.native
abstract class CustomResource protected ()
  extends atPulumiPulumiLib.resourceMod.CustomResource {
  /**
    * Creates and registers a new managed resource.  t is the fully qualified type token and name
    * is the "name" part to use in creating a stable and globally unique URN for the object.
    * dependsOn is an optional list of other resources that this resource depends on, controlling
    * the order in which we perform resource operations. Creating an instance does not necessarily
    * perform a create on the physical entity which it represents, and instead, this is dependent
    * upon the diffing of the new goal state compared to the current known resource state.
    *
    * @param t The type of the resource.
    * @param name The _unique_ name of the resource.
    * @param props The arguments to use to populate the new resource.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(t: java.lang.String, name: java.lang.String) = this()
  def this(t: java.lang.String, name: java.lang.String, props: atPulumiPulumiLib.resourceMod.Inputs) = this()
  def this(t: java.lang.String, name: java.lang.String, props: atPulumiPulumiLib.resourceMod.Inputs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

@JSImport("@pulumi/pulumi", "CustomResource")
@js.native
object CustomResource extends js.Object {
  /**
    * Returns true if the given object is an instance of CustomResource.  This is designed to work even when
    * multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/resource.CustomResource */ scala.Boolean = js.native
}

