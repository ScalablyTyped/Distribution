package typings.rcDashTable.esInterfaceMod

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expander[ValueType] extends js.Object {
  var handleExpandChange: js.Any
  var needIndentSpaced: Boolean
  var props: js.Any
  def renderExpandIndentCell(rows: js.Array[js.Array[Cell]], fixed: FixedType): Unit
  def renderRows(
    renderRows: js.Any,
    rows: js.Array[ReactElement],
    record: ValueType,
    index: Double,
    indent: Double,
    fixed: FixedType,
    key: Key,
    ancestorKeys: js.Array[Key]
  ): js.Array[ReactElement]
}

object Expander {
  @scala.inline
  def apply[ValueType](
    handleExpandChange: js.Any,
    needIndentSpaced: Boolean,
    props: js.Any,
    renderExpandIndentCell: (js.Array[js.Array[Cell]], FixedType) => Unit,
    renderRows: (js.Any, js.Array[ReactElement], ValueType, Double, Double, FixedType, Key, js.Array[Key]) => js.Array[ReactElement]
  ): Expander[ValueType] = {
    val __obj = js.Dynamic.literal(handleExpandChange = handleExpandChange, needIndentSpaced = needIndentSpaced, props = props, renderExpandIndentCell = js.Any.fromFunction2(renderExpandIndentCell), renderRows = js.Any.fromFunction8(renderRows))
  
    __obj.asInstanceOf[Expander[ValueType]]
  }
}

