package typings.pullStream

import typings.pullStream.anon.Last
import typings.pullStream.mod.Through_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object takeMod {
  
  /**
    * `take` has 2 valid signatures:
    * 1. A single positive integer `n`. `take` pulls `n` values from the source and then closes the stream. This is really useful for limiting how much you pull.
    * 2. A `testFn` function and optional `opts`. Read data from the source stream and forward it downstream until `testFn(data)` returns false, then close the stream.
    *
    *    `opts` is an optional Object of form `{ last: Boolean }`, where `opts.last` determines whether the last value tested (before closing the stream) is included or excluded (default).
    */
  @JSImport("pull-stream/throughs/take", JSImport.Namespace)
  @js.native
  def apply[InOut](n: Double): Through_[InOut, InOut] = js.native
  @JSImport("pull-stream/throughs/take", JSImport.Namespace)
  @js.native
  def apply[InOut](testFn: js.Function1[/* data */ InOut, Boolean]): Through_[InOut, InOut] = js.native
  @JSImport("pull-stream/throughs/take", JSImport.Namespace)
  @js.native
  def apply[InOut](testFn: js.Function1[/* data */ InOut, Boolean], opts: Last): Through_[InOut, InOut] = js.native
}
