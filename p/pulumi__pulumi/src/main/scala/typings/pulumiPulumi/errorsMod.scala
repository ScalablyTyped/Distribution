package typings.pulumiPulumi

import typings.pulumiPulumi.resourceMod.Resource
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/pulumi/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  
  def isGrpcError(err: Error): Boolean = js.native
  
  @js.native
  class ResourceError protected () extends Error {
    def this(message: String) = this()
    def this(message: String, resource: Resource) = this()
    def this(message: String, resource: js.UndefOr[scala.Nothing], hideStack: Boolean) = this()
    def this(message: String, resource: Resource, hideStack: Boolean) = this()
    
    var hideStack: js.UndefOr[Boolean] = js.native
    
    var resource: js.UndefOr[Resource] = js.native
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
  
  @js.native
  class RunError protected () extends Error {
    def this(message: String) = this()
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
