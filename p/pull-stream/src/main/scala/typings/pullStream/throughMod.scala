package typings.pullStream

import typings.pullStream.mod.Through_
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/throughs/through", JSImport.Namespace)
@js.native
object throughMod extends js.Object {
  /**
    * Returns a pass through stream that doesn't change the value.
    */
  def apply[InOut](): Through_[InOut, InOut] = js.native
  def apply[InOut](op: js.Function1[/* data */ InOut, _]): Through_[InOut, InOut] = js.native
  def apply[InOut](op: js.Function1[/* data */ InOut, _], onEnd: js.Function1[/* err */ Error | Null, _]): Through_[InOut, InOut] = js.native
}

