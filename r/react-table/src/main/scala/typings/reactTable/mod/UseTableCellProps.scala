package typings.reactTable.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseTableCellProps[D /* <: js.Object */, V] extends StObject {
  
  var column: ColumnInstance[D] = js.native
  
  def getCellProps(): TableCellProps = js.native
  def getCellProps(propGetter: CellPropGetter[D]): TableCellProps = js.native
  
  def render(`type`: String): ReactNode = js.native
  def render(`type`: String, userProps: js.Object): ReactNode = js.native
  @JSName("render")
  def render_Cell(`type`: typings.reactTable.reactTableStrings.Cell): ReactNode = js.native
  @JSName("render")
  def render_Cell(`type`: typings.reactTable.reactTableStrings.Cell, userProps: js.Object): ReactNode = js.native
  
  var row: Row[D] = js.native
  
  var value: CellValue[V] = js.native
}
