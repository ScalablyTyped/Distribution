package typings.atPulumiPulumi

import typings.atPulumiPulumi.resourceMod.Resource
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  @js.native
  class ResourceError protected () extends Error {
    def this(message: String) = this()
    def this(message: String, resource: Resource) = this()
    def this(message: String, resource: js.UndefOr[scala.Nothing], hideStack: Boolean) = this()
    def this(message: String, resource: Resource, hideStack: Boolean) = this()
    var hideStack: js.UndefOr[Boolean] = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    var resource: js.UndefOr[Resource] = js.native
  }
  
  @js.native
  class RunError protected () extends Error {
    def this(message: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  /* static members */
  @js.native
  object ResourceError extends js.Object {
    /**
      * Returns true if the given object is an instance of a ResourceError.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/errors.ResourceError */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object RunError extends js.Object {
    /**
      * Returns true if the given object is an instance of a RunError.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/errors.RunError */ Boolean = js.native
  }
  
}

