package typings
package atPulumiPulumiLib.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/errors", "RunError")
@js.native
class RunError protected ()
  extends nodeLib.Error {
  def this(message: java.lang.String) = this()
}

@JSImport("@pulumi/pulumi/errors", "RunError")
@js.native
object RunError extends js.Object {
  /**
    * Returns true if the given object is an instance of a RunError.  This is designed to work even when
    * multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/errors.RunError */ scala.Boolean = js.native
}

