package typings.reactVirtualized.mod

import typings.reactVirtualized.AnonSortBy
import typings.reactVirtualized.esTableMod.MultiSortOptions
import typings.reactVirtualized.esTableMod.MultiSortReturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized", "createTableMultiSort")
@js.native
object createTableMultiSort extends js.Object {
  def apply(sortCallback: js.Function1[/* params */ AnonSortBy, Unit]): MultiSortReturn = js.native
  def apply(sortCallback: js.Function1[/* params */ AnonSortBy, Unit], options: MultiSortOptions): MultiSortReturn = js.native
}

