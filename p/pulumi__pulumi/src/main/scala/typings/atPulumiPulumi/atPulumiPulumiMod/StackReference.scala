package typings.atPulumiPulumi.atPulumiPulumiMod

import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.stackReferenceMod.StackReferenceArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "StackReference")
@js.native
class StackReference protected ()
  extends typings.atPulumiPulumi.stackReferenceMod.StackReference {
  /**
    * Create a StackReference resource with the given unique name, arguments, and options.
    *
    * If args is not specified, the name of the referenced stack will be the name of the StackReference resource.
    *
    * @param name The _unique_ name of the stack reference.
    * @param args The arguments to use to populate this resource's properties.
    * @Param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: StackReferenceArgs) = this()
  def this(name: String, args: StackReferenceArgs, opts: CustomResourceOptions) = this()
}

