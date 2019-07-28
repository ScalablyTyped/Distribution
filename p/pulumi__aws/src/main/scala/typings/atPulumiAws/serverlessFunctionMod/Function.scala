package typings.atPulumiAws.serverlessFunctionMod

import typings.atPulumiAws.iamMod.Role
import typings.atPulumiPulumi.atPulumiPulumiMod.ComponentResource
import typings.atPulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/serverless/function", "Function")
@js.native
class Function protected () extends ComponentResource {
  /**
    * @param func Deprecated.  Pass the function as [options.func] or [options.factoryFunc] instead.
    */
  def this(name: String, options: FunctionOptions) = this()
  def this(name: String, options: FunctionOptions, func: Handler) = this()
  def this(name: String, options: FunctionOptions, func: Handler, opts: ResourceOptions) = this()
  val lambda: typings.atPulumiAws.lambdaMod.Function = js.native
  val options: FunctionOptions = js.native
  val role: js.UndefOr[Role] = js.native
}

