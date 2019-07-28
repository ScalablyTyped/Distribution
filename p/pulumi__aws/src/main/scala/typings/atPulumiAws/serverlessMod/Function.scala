package typings.atPulumiAws.serverlessMod

import typings.atPulumiAws.serverlessFunctionMod.FunctionOptions
import typings.atPulumiAws.serverlessFunctionMod.Handler
import typings.atPulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/serverless", "Function")
@js.native
class Function protected ()
  extends typings.atPulumiAws.serverlessFunctionMod.Function {
  /**
    * @param func Deprecated.  Pass the function as [options.func] or [options.factoryFunc] instead.
    */
  def this(name: String, options: FunctionOptions) = this()
  def this(name: String, options: FunctionOptions, func: Handler) = this()
  def this(name: String, options: FunctionOptions, func: Handler, opts: ResourceOptions) = this()
}

