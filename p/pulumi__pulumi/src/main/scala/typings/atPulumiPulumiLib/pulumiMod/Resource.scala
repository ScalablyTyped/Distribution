package typings
package atPulumiPulumiLib.pulumiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "Resource")
@js.native
abstract class Resource protected ()
  extends atPulumiPulumiLib.resourceMod.Resource {
  /**
       * Creates and registers a new resource object.  [t] is the fully qualified type token and
       * [name] is the "name" part to use in creating a stable and globally unique URN for the object.
       * dependsOn is an optional list of other resources that this resource depends on, controlling
       * the order in which we perform resource operations.
       *
       * @param t The type of the resource.
       * @param name The _unique_ name of the resource.
       * @param custom True to indicate that this is a custom resource, managed by a plugin.
       * @param props The arguments to use to populate the new resource.
       * @param opts A bag of options that control this resource's behavior.
       */
  def this(t: java.lang.String, name: java.lang.String, custom: scala.Boolean) = this()
  /**
       * Creates and registers a new resource object.  [t] is the fully qualified type token and
       * [name] is the "name" part to use in creating a stable and globally unique URN for the object.
       * dependsOn is an optional list of other resources that this resource depends on, controlling
       * the order in which we perform resource operations.
       *
       * @param t The type of the resource.
       * @param name The _unique_ name of the resource.
       * @param custom True to indicate that this is a custom resource, managed by a plugin.
       * @param props The arguments to use to populate the new resource.
       * @param opts A bag of options that control this resource's behavior.
       */
  def this(t: java.lang.String, name: java.lang.String, custom: scala.Boolean, props: atPulumiPulumiLib.resourceMod.Inputs) = this()
  /**
       * Creates and registers a new resource object.  [t] is the fully qualified type token and
       * [name] is the "name" part to use in creating a stable and globally unique URN for the object.
       * dependsOn is an optional list of other resources that this resource depends on, controlling
       * the order in which we perform resource operations.
       *
       * @param t The type of the resource.
       * @param name The _unique_ name of the resource.
       * @param custom True to indicate that this is a custom resource, managed by a plugin.
       * @param props The arguments to use to populate the new resource.
       * @param opts A bag of options that control this resource's behavior.
       */
  def this(t: java.lang.String, name: java.lang.String, custom: scala.Boolean, props: atPulumiPulumiLib.resourceMod.Inputs, opts: atPulumiPulumiLib.resourceMod.ResourceOptions) = this()
}

@JSImport("@pulumi/pulumi", "Resource")
@js.native
object Resource extends js.Object {
  def isInstance(obj: js.Any): /* is Resource */scala.Boolean = js.native
}

