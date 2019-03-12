package typings
package atPulumiPulumiLib.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/errors", "ResourceError")
@js.native
class ResourceError protected ()
  extends stdLib.Error {
  def this(message: java.lang.String) = this()
  def this(message: java.lang.String, resource: atPulumiPulumiLib.resourceMod.Resource) = this()
  def this(message: java.lang.String, resource: atPulumiPulumiLib.resourceMod.Resource, hideStack: scala.Boolean) = this()
  def this(message: java.lang.String, resource: js.UndefOr[scala.Nothing], hideStack: scala.Boolean) = this()
  var hideStack: js.UndefOr[scala.Boolean] = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  var resource: js.UndefOr[atPulumiPulumiLib.resourceMod.Resource] = js.native
}

/* static members */
@JSImport("@pulumi/pulumi/errors", "ResourceError")
@js.native
object ResourceError extends js.Object {
  /**
    * Returns true if the given object is an instance of a ResourceError.  This is designed to work even when
    * multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/errors.ResourceError */ scala.Boolean = js.native
}

