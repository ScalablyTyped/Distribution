package typings.pulumiPulumi.createClosureMod

import typings.pulumiPulumi.resourceMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime/closure/createClosure", "createFunctionInfoAsync")
@js.native
object createFunctionInfoAsync extends js.Object {
  def apply(func: js.Function, serialize: js.Function1[/* o */ js.Any, Boolean]): js.Promise[FunctionInfo] = js.native
  def apply(func: js.Function, serialize: js.Function1[/* o */ js.Any, Boolean], logResource: Resource): js.Promise[FunctionInfo] = js.native
}

