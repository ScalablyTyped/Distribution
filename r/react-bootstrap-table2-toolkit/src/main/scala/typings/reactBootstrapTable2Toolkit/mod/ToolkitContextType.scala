package typings.reactBootstrapTable2Toolkit.mod

import typings.reactBootstrapTable2Toolkit.AnonBootstrap4
import typings.reactBootstrapTable2Toolkit.AnonColumns
import typings.reactBootstrapTable2Toolkit.AnonOnExport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolkitContextType extends js.Object {
  var baseProps: AnonBootstrap4
  var columnToggleProps: AnonColumns
  var csvProps: AnonOnExport
  var searchProps: InjectedSearchProps
}

object ToolkitContextType {
  @scala.inline
  def apply(
    baseProps: AnonBootstrap4,
    columnToggleProps: AnonColumns,
    csvProps: AnonOnExport,
    searchProps: InjectedSearchProps
  ): ToolkitContextType = {
    val __obj = js.Dynamic.literal(baseProps = baseProps.asInstanceOf[js.Any], columnToggleProps = columnToggleProps.asInstanceOf[js.Any], csvProps = csvProps.asInstanceOf[js.Any], searchProps = searchProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolkitContextType]
  }
}

