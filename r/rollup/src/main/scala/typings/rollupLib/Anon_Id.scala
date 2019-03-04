package typings
package rollupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: java.lang.String
  var importedIds: js.Array[java.lang.String]
  var isExternal: scala.Boolean
}

object Anon_Id {
  @scala.inline
  def apply(id: java.lang.String, importedIds: js.Array[java.lang.String], isExternal: scala.Boolean): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id, importedIds = importedIds, isExternal = isExternal)
  
    __obj.asInstanceOf[Anon_Id]
  }
}

