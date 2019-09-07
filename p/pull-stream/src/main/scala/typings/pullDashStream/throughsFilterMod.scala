package typings.pullDashStream

import typings.pullDashStream.pullDashStreamMod.Through
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/throughs/filter", JSImport.Namespace)
@js.native
object throughsFilterMod extends js.Object {
  def apply[InOut](test: js.Function1[/* data */ InOut, Boolean]): Through[InOut, InOut] = js.native
}

