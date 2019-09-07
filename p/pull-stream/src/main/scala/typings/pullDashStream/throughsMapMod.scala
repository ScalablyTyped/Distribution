package typings.pullDashStream

import typings.pullDashStream.pullDashStreamMod.Through
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/throughs/map", JSImport.Namespace)
@js.native
object throughsMapMod extends js.Object {
  /**
    * Returns a through stream that calls the given `fn` for each chunk of incoming data and outputs the return value, in the same order as before.
    */
  def apply[In, Out](fn: js.Function1[/* data */ In, Out]): Through[In, Out] = js.native
}

