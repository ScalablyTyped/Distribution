package typings
package atPulumiPulumiLib.resourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/resource", "ComponentResource")
@js.native
class ComponentResource protected () extends Resource {
  /**
       * Creates and registers a new component resource.  t is the fully qualified type token and name
       * is the "name" part to use in creating a stable and globally unique URN for the object. parent
       * is the optional parent for this component, and dependsOn is an optional list of other
       * resources that this resource depends on, controlling the order in which we perform resource
       * operations.
       *
       * @param t The type of the resource.
       * @param name The _unique_ name of the resource.
       * @param props The arguments to use to populate the new resource.
       * @param opts A bag of options that control this resource's behavior.
       */
  def this(t: java.lang.String, name: java.lang.String) = this()
  /**
       * Creates and registers a new component resource.  t is the fully qualified type token and name
       * is the "name" part to use in creating a stable and globally unique URN for the object. parent
       * is the optional parent for this component, and dependsOn is an optional list of other
       * resources that this resource depends on, controlling the order in which we perform resource
       * operations.
       *
       * @param t The type of the resource.
       * @param name The _unique_ name of the resource.
       * @param props The arguments to use to populate the new resource.
       * @param opts A bag of options that control this resource's behavior.
       */
  def this(t: java.lang.String, name: java.lang.String, props: Inputs) = this()
  /**
       * Creates and registers a new component resource.  t is the fully qualified type token and name
       * is the "name" part to use in creating a stable and globally unique URN for the object. parent
       * is the optional parent for this component, and dependsOn is an optional list of other
       * resources that this resource depends on, controlling the order in which we perform resource
       * operations.
       *
       * @param t The type of the resource.
       * @param name The _unique_ name of the resource.
       * @param props The arguments to use to populate the new resource.
       * @param opts A bag of options that control this resource's behavior.
       */
  def this(t: java.lang.String, name: java.lang.String, props: Inputs, opts: ComponentResourceOptions) = this()
  /* protected */ def registerOutputs(): scala.Unit = js.native
  /* protected */ def registerOutputs(outputs: Inputs): scala.Unit = js.native
  /* protected */ def registerOutputs(outputs: Output[Inputs]): scala.Unit = js.native
  /* protected */ def registerOutputs(outputs: js.Promise[Inputs]): scala.Unit = js.native
}

