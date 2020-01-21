package typings.rcTable

import typings.rcTable.columnManagerMod.default
import typings.rcTable.tableMod.TableProps
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnManager[ValueType] extends js.Object {
  var columnManager: default
  var components: js.Any
  var props: TableProps[ValueType] with AnonChildrenReactNode
  def saveRef(name: String): js.Function1[/* node */ HTMLElement, Unit]
}

object AnonColumnManager {
  @scala.inline
  def apply[ValueType](
    columnManager: default,
    components: js.Any,
    props: TableProps[ValueType] with AnonChildrenReactNode,
    saveRef: String => js.Function1[/* node */ HTMLElement, Unit]
  ): AnonColumnManager[ValueType] = {
    val __obj = js.Dynamic.literal(columnManager = columnManager.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], saveRef = js.Any.fromFunction1(saveRef))
  
    __obj.asInstanceOf[AnonColumnManager[ValueType]]
  }
}

