package typings
package atPulumiPulumiLib.pulumiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "ComponentResource")
@js.native
class ComponentResource protected ()
  extends atPulumiPulumiLib.resourceMod.ComponentResource {
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
  def this(t: java.lang.String, name: java.lang.String, props: atPulumiPulumiLib.resourceMod.Inputs) = this()
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
  def this(t: java.lang.String, name: java.lang.String, props: atPulumiPulumiLib.resourceMod.Inputs, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
}

