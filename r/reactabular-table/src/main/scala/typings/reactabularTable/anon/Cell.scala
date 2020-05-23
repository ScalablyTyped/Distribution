package typings.reactabularTable.anon

import typings.react.mod.ReactInstance
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cell extends js.Object {
  var cell: js.UndefOr[
    String | (js.Function2[/* props */ js.Any, /* column */ typings.reactabularTable.mod.Column, Element]) | (js.Function1[/* props */ js.Any, ReactInstance])
  ] = js.undefined
  var row: js.UndefOr[String | (js.Function1[/* props */ js.Any, Element | ReactInstance])] = js.undefined
  var wrapper: js.UndefOr[String | (js.Function1[/* props */ js.Any, Element | ReactInstance])] = js.undefined
}

object Cell {
  @scala.inline
  def apply(
    cell: String | (js.Function2[/* props */ js.Any, /* column */ typings.reactabularTable.mod.Column, Element]) | (js.Function1[/* props */ js.Any, ReactInstance]) = null,
    row: String | (js.Function1[/* props */ js.Any, Element | ReactInstance]) = null,
    wrapper: String | (js.Function1[/* props */ js.Any, Element | ReactInstance]) = null
  ): Cell = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cell]
  }
}

