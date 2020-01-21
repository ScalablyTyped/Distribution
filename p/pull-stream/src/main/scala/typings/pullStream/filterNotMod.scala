package typings.pullStream

import typings.pullStream.mod.Through_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/throughs/filter-not", JSImport.Namespace)
@js.native
object filterNotMod extends js.Object {
  /**
    * Like `filter`, but remove items where the filter returns true.
    */
  def apply[InOut](test: js.Function1[/* data */ InOut, Boolean]): Through_[InOut, InOut] = js.native
}

