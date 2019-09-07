package typings.pullDashStream

import typings.pullDashStream.pullDashStreamMod.Through
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/throughs/through", JSImport.Namespace)
@js.native
object throughsThroughMod extends js.Object {
  /**
    * Returns a pass through stream that doesn't change the value.
    */
  def apply[InOut](): Through[InOut, InOut] = js.native
  def apply[InOut](op: js.Function1[/* data */ InOut, _]): Through[InOut, InOut] = js.native
  def apply[InOut](op: js.Function1[/* data */ InOut, _], onEnd: js.Function1[/* err */ Error | Null, _]): Through[InOut, InOut] = js.native
}

