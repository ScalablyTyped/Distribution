package typings.reactBootstrapTable2Toolkit.mod

import typings.reactBootstrapTable2Toolkit.anon.Bootstrap4
import typings.reactBootstrapTable2Toolkit.anon.Columns
import typings.reactBootstrapTable2Toolkit.anon.OnExport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolkitContextType extends js.Object {
  var baseProps: Bootstrap4
  var columnToggleProps: Columns
  var csvProps: OnExport
  var searchProps: InjectedSearchProps
}

object ToolkitContextType {
  @scala.inline
  def apply(
    baseProps: Bootstrap4,
    columnToggleProps: Columns,
    csvProps: OnExport,
    searchProps: InjectedSearchProps
  ): ToolkitContextType = {
    val __obj = js.Dynamic.literal(baseProps = baseProps.asInstanceOf[js.Any], columnToggleProps = columnToggleProps.asInstanceOf[js.Any], csvProps = csvProps.asInstanceOf[js.Any], searchProps = searchProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolkitContextType]
  }
}

