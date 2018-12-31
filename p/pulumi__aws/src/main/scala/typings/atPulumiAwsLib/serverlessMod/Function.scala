package typings
package atPulumiAwsLib.serverlessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/serverless", "Function")
@js.native
class Function protected ()
  extends atPulumiAwsLib.serverlessFunctionMod.Function {
  /**
    * @param func Deprecated.  Pass the function as [options.func] or [options.factoryFunc] instead.
    */
  def this(name: java.lang.String, options: atPulumiAwsLib.serverlessFunctionMod.FunctionOptions) = this()
  def this(name: java.lang.String, options: atPulumiAwsLib.serverlessFunctionMod.FunctionOptions, func: atPulumiAwsLib.serverlessFunctionMod.Handler) = this()
  def this(name: java.lang.String, options: atPulumiAwsLib.serverlessFunctionMod.FunctionOptions, func: atPulumiAwsLib.serverlessFunctionMod.Handler, opts: atPulumiPulumiLib.resourceMod.ResourceOptions) = this()
}

