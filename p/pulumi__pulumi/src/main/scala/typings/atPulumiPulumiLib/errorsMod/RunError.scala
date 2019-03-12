package typings
package atPulumiPulumiLib.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/errors", "RunError")
@js.native
class RunError protected ()
  extends stdLib.Error {
  def this(message: java.lang.String) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

/* static members */
@JSImport("@pulumi/pulumi/errors", "RunError")
@js.native
object RunError extends js.Object {
  /**
    * Returns true if the given object is an instance of a RunError.  This is designed to work even when
    * multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/errors.RunError */ scala.Boolean = js.native
}

