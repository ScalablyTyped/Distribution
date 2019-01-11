package typings
package atPulumiAwsLib.serverlessFunctionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/serverless/function", "Function")
@js.native
class Function protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.ComponentResource {
  /**
    * @param func Deprecated.  Pass the function as [options.func] or [options.factoryFunc] instead.
    */
  def this(name: java.lang.String, options: FunctionOptions) = this()
  def this(name: java.lang.String, options: FunctionOptions, func: Handler) = this()
  def this(name: java.lang.String, options: FunctionOptions, func: Handler, opts: atPulumiPulumiLib.resourceMod.ResourceOptions) = this()
  val lambda: atPulumiAwsLib.lambdaMod.Function = js.native
  val options: FunctionOptions = js.native
  val role: atPulumiAwsLib.iamMod.Role = js.native
}

