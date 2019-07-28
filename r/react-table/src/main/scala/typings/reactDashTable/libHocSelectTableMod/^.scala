package typings.reactDashTable.libHocSelectTableMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.reactDashTable.reactDashTableMod.TableProps
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-table/lib/hoc/selectTable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[Props /* <: Partial[TableProps[_, _]] */](WrappedComponent: ComponentType[Props]): ComponentClass[Props with SelectTableAdditionalProps, ComponentState] = js.native
  def default[Props /* <: Partial[TableProps[_, _]] */](WrappedComponent: ComponentType[Props], options: SelectTableHOCOptions): ComponentClass[Props with SelectTableAdditionalProps, ComponentState] = js.native
}

