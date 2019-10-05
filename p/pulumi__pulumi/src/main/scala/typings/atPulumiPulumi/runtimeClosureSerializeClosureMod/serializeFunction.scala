package typings.atPulumiPulumi.runtimeClosureSerializeClosureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime/closure/serializeClosure", "serializeFunction")
@js.native
object serializeFunction extends js.Object {
  def apply(func: js.Function): js.Promise[SerializedFunction] = js.native
  def apply(func: js.Function, args: SerializeFunctionArgs): js.Promise[SerializedFunction] = js.native
}

