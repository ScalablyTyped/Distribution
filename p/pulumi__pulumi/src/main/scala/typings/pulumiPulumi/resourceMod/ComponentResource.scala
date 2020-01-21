package typings.pulumiPulumi.resourceMod

import typings.pulumiPulumi.outputMod.Inputs
import typings.pulumiPulumi.outputMod.Output_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/resource", "ComponentResource")
@js.native
class ComponentResource[TData] protected () extends Resource {
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
  /**
    * Retrieves the data produces by [initialize].  The data is immediately available in a
    * derived class's constructor after the `super(...)` call to `ComponentResource`.
    */
  /* protected */ def getData(): js.Promise[TData] = js.native
  /**
    * Can be overridden by a subclass to asynchronously initialize data for this Component
    * automatically when constructed.  The data will be available immediately for subclass
    * constructors to use.  To access the data use `.getData`.
    */
  /* protected */ def initialize(args: Inputs): js.Promise[TData] = js.native
  /**
    * registerOutputs registers synthetic outputs that a component has initialized, usually by
    * allocating other child sub-resources and propagating their resulting property values.
    *
    * ComponentResources can call this at the end of their constructor to indicate that they are
    * done creating child resources.  This is not strictly necessary as this will automatically be
    * called after the `initialize` method completes.
    */
  /* protected */ def registerOutputs(): Unit = js.native
  /* protected */ def registerOutputs(outputs: js.Promise[Inputs]): Unit = js.native
  /* protected */ def registerOutputs(outputs: Inputs): Unit = js.native
  /* protected */ def registerOutputs(outputs: Output_[Inputs]): Unit = js.native
}

/* static members */
@JSImport("@pulumi/pulumi/resource", "ComponentResource")
@js.native
object ComponentResource extends js.Object {
  /**
    * Returns true if the given object is an instance of CustomResource.  This is designed to work even when
    * multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/resource.ComponentResource<any> */ Boolean = js.native
}

