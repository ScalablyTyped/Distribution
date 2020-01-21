package typings.reactabularTable.mod

import typings.react.mod._Global_.JSX.Element
import typings.reactabularTable.AnonCell
import typings.reactabularTable.AnonCellProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Renderers extends js.Object {
  var body: js.UndefOr[AnonCellProps] = js.undefined
  var header: js.UndefOr[AnonCell] = js.undefined
  var table: js.UndefOr[String | js.Function0[Element]] = js.undefined
}

object Renderers {
  @scala.inline
  def apply(body: AnonCellProps = null, header: AnonCell = null, table: String | js.Function0[Element] = null): Renderers = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[Renderers]
  }
}

