package typings
package atPulumiPulumiLib.runtimeClosureSerializeClosureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime/closure/serializeClosure", JSImport.Namespace)
@js.native
object runtimeClosureSerializeClosureModMembers extends js.Object {
  def serializeFunction(func: js.Function): stdLib.Promise[SerializedFunction] = js.native
  def serializeFunction(func: js.Function, args: SerializeFunctionArgs): stdLib.Promise[SerializedFunction] = js.native
  def serializeFunctionAsync(func: js.Function): stdLib.Promise[java.lang.String] = js.native
  def serializeFunctionAsync(func: js.Function, serialize: js.Function1[/* o */ js.Any, scala.Boolean]): stdLib.Promise[java.lang.String] = js.native
}

