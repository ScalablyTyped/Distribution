package typings
package atPulumiPulumiLib.atPulumiPulumiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "ResourceError")
@js.native
class ResourceError protected ()
  extends atPulumiPulumiLib.errorsMod.ResourceError {
  def this(message: java.lang.String) = this()
  def this(message: java.lang.String, resource: atPulumiPulumiLib.resourceMod.Resource) = this()
  def this(message: java.lang.String, resource: atPulumiPulumiLib.resourceMod.Resource, hideStack: scala.Boolean) = this()
  def this(message: java.lang.String, resource: js.UndefOr[scala.Nothing], hideStack: scala.Boolean) = this()
}

/* static members */
@JSImport("@pulumi/pulumi", "ResourceError")
@js.native
object ResourceError extends js.Object {
  /**
    * Returns true if the given object is an instance of a ResourceError.  This is designed to work even when
    * multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/errors.ResourceError */ scala.Boolean = js.native
}

