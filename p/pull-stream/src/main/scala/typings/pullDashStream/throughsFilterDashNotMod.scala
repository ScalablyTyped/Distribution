package typings.pullDashStream

import typings.pullDashStream.pullDashStreamMod.Through
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/throughs/filter-not", JSImport.Namespace)
@js.native
object throughsFilterDashNotMod extends js.Object {
  /**
    * Like `filter`, but remove items where the filter returns true.
    */
  def apply[InOut](test: js.Function1[/* data */ InOut, Boolean]): Through[InOut, InOut] = js.native
}

