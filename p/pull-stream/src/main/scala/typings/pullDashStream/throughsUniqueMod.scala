package typings.pullDashStream

import typings.pullDashStream.pullDashStreamMod.Through
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/throughs/unique", JSImport.Namespace)
@js.native
object throughsUniqueMod extends js.Object {
  /**
    * Filter items that have a repeated value for `prop()`, by default, `prop = function (it) {return it }`, if `prop` is a string, it will filter nodes which have repeated values for that property.
    */
  def apply[InOut](): Through[InOut, InOut] = js.native
  def apply[InOut](prop: String): Through[InOut, InOut] = js.native
  def apply[InOut](prop: js.Function1[/* data */ InOut, _]): Through[InOut, InOut] = js.native
}

