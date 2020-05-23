package typings.reactabularTable.mod

import typings.react.mod.global.JSX.Element
import typings.reactabularTable.anon.Cell
import typings.reactabularTable.anon.Row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Renderers extends js.Object {
  var body: js.UndefOr[Row] = js.undefined
  var header: js.UndefOr[Cell] = js.undefined
  var table: js.UndefOr[String | js.Function0[Element]] = js.undefined
}

object Renderers {
  @scala.inline
  def apply(body: Row = null, header: Cell = null, table: String | js.Function0[Element] = null): Renderers = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[Renderers]
  }
}

