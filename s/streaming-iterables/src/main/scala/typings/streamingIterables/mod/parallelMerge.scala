package typings.streamingIterables.mod

import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("streaming-iterables", "parallelMerge")
@js.native
object parallelMerge extends js.Object {
  
  def apply[I /* <: js.Array[AnyIterable[_]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param iterables because its type I is not an array type */ iterables: I
  ): AsyncIterable[UnArrayAnyIterable[I]] = js.native
}
