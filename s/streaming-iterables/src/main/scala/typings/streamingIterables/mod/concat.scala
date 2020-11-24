package typings.streamingIterables.mod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("streaming-iterables", "concat")
@js.native
object concat extends js.Object {
  
  def apply[I /* <: js.Array[Iterable[_]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param iterables because its type I is not an array type */ iterables: I
  ): Iterable[UnArrayAnyIterable[I]] = js.native
}
