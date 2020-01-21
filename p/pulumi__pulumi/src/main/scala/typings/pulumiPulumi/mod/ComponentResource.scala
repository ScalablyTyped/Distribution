package typings.pulumiPulumi.mod

import typings.pulumiPulumi.outputMod.Inputs
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "ComponentResource")
@js.native
class ComponentResource[TData] protected ()
  extends typings.pulumiPulumi.resourceMod.ComponentResource[TData] {
  /**
    * Creates and registers a new component resource.  [type] is the fully qualified type token and
    * [name] is the "name" part to use in creating a stable and globally unique URN for the object.
    * [opts.parent] is the optional parent for this component, and [opts.dependsOn] is an optional
    * list of other resources that this resource depends on, controlling the order in which we
    * perform resource operations.
    *
    * @param t The type of the resource.
    * @param name The _unique_ name of the resource.
    * @param args Information passed to [initialize] method.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(`type`: String, name: String) = this()
  def this(`type`: String, name: String, args: Inputs) = this()
  def this(`type`: String, name: String, args: Inputs, opts: ComponentResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/pulumi", "ComponentResource")
@js.native
object ComponentResource extends js.Object {
  /**
    * Returns true if the given object is an instance of CustomResource.  This is designed to work even when
    * multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/resource.ComponentResource<any> */ Boolean = js.native
}

