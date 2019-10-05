package typings.atPulumiPulumi.atPulumiPulumiMod

import typings.atPulumiPulumi.dynamicMod.ResourceProvider
import typings.atPulumiPulumi.outputMod.Inputs
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "dynamic")
@js.native
object dynamic extends js.Object {
  @js.native
  abstract class Resource protected ()
    extends typings.atPulumiPulumi.dynamicMod.Resource {
    /**
      * Creates a new dynamic resource.
      *
      * @param provider The implementation of the resource's CRUD operations.
      * @param name The name of the resource.
      * @param props The arguments to use to populate the new resource. Must not define the reserved
      *              property "__provider".
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(provider: ResourceProvider, name: String, props: Inputs) = this()
    def this(provider: ResourceProvider, name: String, props: Inputs, opts: CustomResourceOptions) = this()
  }
  
}

