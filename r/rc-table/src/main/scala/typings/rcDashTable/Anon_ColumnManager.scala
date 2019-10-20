package typings.rcDashTable

import typings.rcDashTable.esColumnManagerMod.default
import typings.rcDashTable.esTableMod.TableProps
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnManager[ValueType] extends js.Object {
  var columnManager: default
  var components: js.Any
  var props: TableProps[ValueType] with Anon_ChildrenReactNode
  def saveRef(name: String): js.Function1[/* node */ HTMLElement, Unit]
}

object Anon_ColumnManager {
  @scala.inline
  def apply[ValueType](
    columnManager: default,
    components: js.Any,
    props: TableProps[ValueType] with Anon_ChildrenReactNode,
    saveRef: String => js.Function1[/* node */ HTMLElement, Unit]
  ): Anon_ColumnManager[ValueType] = {
    val __obj = js.Dynamic.literal(columnManager = columnManager, components = components, props = props, saveRef = js.Any.fromFunction1(saveRef))
  
    __obj.asInstanceOf[Anon_ColumnManager[ValueType]]
  }
}

