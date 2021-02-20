package typings.pulumiPulumi

import typings.pulumiPulumi.resourceMod.Resource
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("@pulumi/pulumi/errors", "ResourceError")
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
  object ResourceError {
    
    /**
      * Returns true if the given object is an instance of a ResourceError.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/pulumi/errors", "ResourceError.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/errors.ResourceError */ Boolean = js.native
  }
  
  @JSImport("@pulumi/pulumi/errors", "RunError")
  @js.native
  class RunError protected () extends Error {
    def this(message: String) = this()
  }
  /* static members */
  object RunError {
    
    /**
      * Returns true if the given object is an instance of a RunError.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/pulumi/errors", "RunError.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/errors.RunError */ Boolean = js.native
  }
  
  @JSImport("@pulumi/pulumi/errors", "isGrpcError")
  @js.native
  def isGrpcError(err: Error): Boolean = js.native
}
