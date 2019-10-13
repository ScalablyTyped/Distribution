package typings.reactDashTable

import typings.react.reactMod.ComponentType
import typings.reactDashTable.reactDashTableMod.TableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashTableComponents extends reactDashTableProps {
  @scala.inline
  def ReactDashTable[D]: ComponentType[ReactDashTableProps[TableProps[D, D]]] = js.constructorOf[typings.reactDashTable.reactDashTableMod.default[D]].asInstanceOf[typings.react.reactMod.ComponentType[ReactDashTableProps[typings.reactDashTable.reactDashTableMod.TableProps[D, D]]]]
}

