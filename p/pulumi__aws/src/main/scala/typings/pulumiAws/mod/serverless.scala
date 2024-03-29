package typings.pulumiAws.mod

import typings.pulumiAws.serverlessFunctionMod.FunctionOptions
import typings.pulumiAws.serverlessFunctionMod.Handler
import typings.pulumiPulumi.resourceMod.ResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverless {
  
  @JSImport("@pulumi/aws", "serverless.Function")
  @js.native
  class Function protected ()
    extends typings.pulumiAws.serverlessMod.Function {
    /**
      * @param func Deprecated.  Pass the function as [options.func] or [options.factoryFunc] instead.
      */
    def this(name: String, options: FunctionOptions) = this()
    def this(name: String, options: FunctionOptions, func: Handler) = this()
    def this(name: String, options: FunctionOptions, func: Unit, opts: ResourceOptions) = this()
    def this(name: String, options: FunctionOptions, func: Handler, opts: ResourceOptions) = this()
  }
}
