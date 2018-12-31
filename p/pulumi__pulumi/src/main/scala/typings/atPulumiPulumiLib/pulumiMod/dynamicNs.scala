package typings
package atPulumiPulumiLib.pulumiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "dynamic")
@js.native
object dynamicNs extends js.Object {
  @js.native
  abstract class Resource protected ()
    extends atPulumiPulumiLib.dynamicMod.Resource {
    /**
      * Creates a new dynamic resource.
      *
      * @param provider The implementation of the resource's CRUD operations.
      * @param name The name of the resource.
      * @param props The arguments to use to populate the new resource. Must not define the reserved
      *              property "__provider".
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(provider: atPulumiPulumiLib.dynamicMod.ResourceProvider, name: java.lang.String, props: atPulumiPulumiLib.resourceMod.Inputs) = this()
    def this(provider: atPulumiPulumiLib.dynamicMod.ResourceProvider, name: java.lang.String, props: atPulumiPulumiLib.resourceMod.Inputs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
}

