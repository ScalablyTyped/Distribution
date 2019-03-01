package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertDeleteOperation extends UpdateOperation {
  var delete: js.UndefOr[js.Array[Quads]] = js.undefined
  var graph: js.UndefOr[java.lang.String] = js.undefined
  var insert: js.UndefOr[js.Array[Quads]] = js.undefined
  var updateType: sparqljsLib.sparqljsLibStrings.insert | sparqljsLib.sparqljsLibStrings.delete | sparqljsLib.sparqljsLibStrings.deletewhere | sparqljsLib.sparqljsLibStrings.insertdelete
  var where: js.UndefOr[js.Array[Pattern]] = js.undefined
}

object InsertDeleteOperation {
  @scala.inline
  def apply(
    updateType: sparqljsLib.sparqljsLibStrings.insert | sparqljsLib.sparqljsLibStrings.delete | sparqljsLib.sparqljsLibStrings.deletewhere | sparqljsLib.sparqljsLibStrings.insertdelete,
    delete: js.Array[Quads] = null,
    graph: java.lang.String = null,
    insert: js.Array[Quads] = null,
    where: js.Array[Pattern] = null
  ): InsertDeleteOperation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("updateType")(updateType.asInstanceOf[js.Any])
    if (delete != null) __obj.updateDynamic("delete")(delete)
    if (graph != null) __obj.updateDynamic("graph")(graph)
    if (insert != null) __obj.updateDynamic("insert")(insert)
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[InsertDeleteOperation]
  }
}

