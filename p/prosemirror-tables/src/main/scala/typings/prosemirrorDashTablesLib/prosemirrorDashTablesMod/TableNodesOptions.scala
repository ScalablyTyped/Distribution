package typings
package prosemirrorDashTablesLib.prosemirrorDashTablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableNodesOptions extends js.Object {
  var cellAttributes: org.scalablytyped.runtime.StringDictionary[CellAttributes]
  var cellContent: java.lang.String
  var tableGroup: js.UndefOr[java.lang.String] = js.undefined
}

object TableNodesOptions {
  @scala.inline
  def apply(
    cellAttributes: org.scalablytyped.runtime.StringDictionary[CellAttributes],
    cellContent: java.lang.String,
    tableGroup: java.lang.String = null
  ): TableNodesOptions = {
    val __obj = js.Dynamic.literal(cellAttributes = cellAttributes, cellContent = cellContent)
    if (tableGroup != null) __obj.updateDynamic("tableGroup")(tableGroup)
    __obj.asInstanceOf[TableNodesOptions]
  }
}

