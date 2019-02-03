package typings
package atPulumiPulumiLib.atPulumiPulumiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "Output")
@js.native
class Output[T] ()
  extends atPulumiPulumiLib.resourceMod.Output[T]

/* static members */
@JSImport("@pulumi/pulumi", "Output")
@js.native
object Output extends js.Object {
  def create[T](): atPulumiPulumiLib.resourceMod.Output[atPulumiPulumiLib.resourceMod.Unwrap[js.UndefOr[T]]] = js.native
  /**
    * create takes any Input value and converts it into an Output, deeply unwrapping nested Input
    * values as necessary.
    */
  def create[T](`val`: atPulumiPulumiLib.resourceMod.Input[T]): atPulumiPulumiLib.resourceMod.Output[atPulumiPulumiLib.resourceMod.Unwrap[T]] = js.native
  /**
    * Returns true if the given object is an instance of Output<T>.  This is designed to work even when
    * multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance[T](obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/resource.Output<T> */ scala.Boolean = js.native
}

