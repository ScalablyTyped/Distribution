package typings
package atPulumiPulumiLib.pulumiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "Output")
@js.native
class Output[T] ()
  extends atPulumiPulumiLib.resourceMod.Output[T]

@JSImport("@pulumi/pulumi", "Output")
@js.native
object Output extends js.Object {
  /**
       * Returns true if the given object is an instance of Output<T>.  This is designed to work even when
       * multiple copies of the Pulumi SDK have been loaded into the same process.
       */
  def isInstance[T](obj: js.Any): /* is Output */scala.Boolean = js.native
}

