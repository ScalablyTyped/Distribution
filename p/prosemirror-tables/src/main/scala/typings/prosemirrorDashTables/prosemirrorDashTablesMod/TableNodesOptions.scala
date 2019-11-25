package typings.prosemirrorDashTables.prosemirrorDashTablesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableNodesOptions extends js.Object {
  var cellAttributes: StringDictionary[CellAttributes]
  var cellContent: String
  var tableGroup: js.UndefOr[String] = js.undefined
}

object TableNodesOptions {
  @scala.inline
  def apply(cellAttributes: StringDictionary[CellAttributes], cellContent: String, tableGroup: String = null): TableNodesOptions = {
    val __obj = js.Dynamic.literal(cellAttributes = cellAttributes.asInstanceOf[js.Any], cellContent = cellContent.asInstanceOf[js.Any])
    if (tableGroup != null) __obj.updateDynamic("tableGroup")(tableGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableNodesOptions]
  }
}

