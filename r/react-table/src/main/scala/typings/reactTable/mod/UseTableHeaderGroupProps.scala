package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseTableHeaderGroupProps[D /* <: js.Object */] extends js.Object {
  var headers: js.Array[ColumnInstance[D]] = js.native
  var totalHeaderCount: Double = js.native
  def getFooterGroupProps(): TableFooterProps = js.native
  def getFooterGroupProps(propGetter: FooterGroupPropGetter[D]): TableFooterProps = js.native
  def getHeaderGroupProps(): TableHeaderProps = js.native
  def getHeaderGroupProps(propGetter: HeaderGroupPropGetter[D]): TableHeaderProps = js.native
}

