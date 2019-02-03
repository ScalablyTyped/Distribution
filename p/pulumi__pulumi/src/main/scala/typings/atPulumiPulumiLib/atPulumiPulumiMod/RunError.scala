package typings
package atPulumiPulumiLib.atPulumiPulumiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "RunError")
@js.native
class RunError protected ()
  extends atPulumiPulumiLib.errorsMod.RunError {
  def this(message: java.lang.String) = this()
}

/* static members */
@JSImport("@pulumi/pulumi", "RunError")
@js.native
object RunError extends js.Object {
  /**
    * Returns true if the given object is an instance of a RunError.  This is designed to work even when
    * multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/errors.RunError */ scala.Boolean = js.native
}

