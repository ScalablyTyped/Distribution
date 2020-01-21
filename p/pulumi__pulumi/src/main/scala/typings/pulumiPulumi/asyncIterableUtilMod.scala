package typings.pulumiPulumi

import typings.pulumiQuery.interfacesMod.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime/asyncIterableUtil", JSImport.Namespace)
@js.native
object asyncIterableUtilMod extends js.Object {
  @js.native
  class PushableAsyncIterable[T] ()
    extends AsyncIterable[js.UndefOr[T]] {
    var bufferedData: js.Any = js.native
    var completed: js.Any = js.native
    var nextQueue: js.Any = js.native
    var shift: js.Any = js.native
    def complete(): Unit = js.native
    def push(payload: T): Unit = js.native
  }
  
}

