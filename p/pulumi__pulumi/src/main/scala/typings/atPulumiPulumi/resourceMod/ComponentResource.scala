package typings.atPulumiPulumi.resourceMod

import typings.atPulumiPulumi.outputMod.Inputs
import typings.atPulumiPulumi.outputMod.Output
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/resource", "ComponentResource")
@js.native
class ComponentResource protected () extends Resource {
  /**
    * Creates and registers a new component resource.  [type] is the fully qualified type token and
    * [name] is the "name" part to use in creating a stable and globally unique URN for the object.
    * [opts.parent] is the optional parent for this component, and [opts.dependsOn] is an optional
    * list of other resources that this resource depends on, controlling the order in which we
    * perform resource operations.
    *
    * @param t The type of the resource.
    * @param name The _unique_ name of the resource.
    * @param unused [Deprecated].  Component resources do not communicate or store their properties
    *               with the Pulumi engine.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(`type`: String, name: String) = this()
  def this(`type`: String, name: String, unused: Inputs) = this()
  def this(`type`: String, name: String, unused: Inputs, opts: ComponentResourceOptions) = this()
  /* protected */ def registerOutputs(): Unit = js.native
  /* protected */ def registerOutputs(outputs: js.Promise[Inputs]): Unit = js.native
  /* protected */ def registerOutputs(outputs: Inputs): Unit = js.native
  /* protected */ def registerOutputs(outputs: Output[Inputs]): Unit = js.native
}

/* static members */
@JSImport("@pulumi/pulumi/resource", "ComponentResource")
@js.native
object ComponentResource extends js.Object {
  /**
    * Returns true if the given object is an instance of CustomResource.  This is designed to work even when
    * multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/resource.ComponentResource */ Boolean = js.native
}

