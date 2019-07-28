package typings.reactDashTable.reactDashTableMod

import typings.react.reactMod.Component
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance[D]
  extends Component[Partial[TableProps[D, D]], js.Object, js.Any] {
  var onPageChange: PageChangeFunction = js.native
  var onPageSizeChange: PageSizeChangeFunction = js.native
  @JSName("props")
  var props_Instance: Partial[TableProps[D, D]] = js.native
  @JSName("state")
  var state_Instance: FinalState[D] = js.native
  def filterColumn(props: js.Any*): js.Any = js.native
  def filterData(props: js.Any*): js.Any = js.native
  def fireFetchData(props: js.Any*): js.Any = js.native
  def getDataModel(props: js.Any*): js.Any = js.native
  def getMinRows(props: js.Any*): js.Any = js.native
  def getPropOrState(props: js.Any*): js.Any = js.native
  def getResolvedState(props: js.Any*): js.Any = js.native
  def getSortedData(props: js.Any*): js.Any = js.native
  def getStateOrProp(props: js.Any*): js.Any = js.native
  def resizeColumnEnd(props: js.Any*): js.Any = js.native
  def resizeColumnMoving(props: js.Any*): js.Any = js.native
  def resizeColumnStart(props: js.Any*): js.Any = js.native
  def sortColumn(props: js.Any*): js.Any = js.native
  def sortData(props: js.Any*): js.Any = js.native
}

