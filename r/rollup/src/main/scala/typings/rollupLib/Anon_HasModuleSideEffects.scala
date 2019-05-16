package typings
package rollupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HasModuleSideEffects extends js.Object {
  var hasModuleSideEffects: scala.Boolean
  var id: java.lang.String
  var importedIds: js.Array[java.lang.String]
  var isEntry: scala.Boolean
  var isExternal: scala.Boolean
}

object Anon_HasModuleSideEffects {
  @scala.inline
  def apply(
    hasModuleSideEffects: scala.Boolean,
    id: java.lang.String,
    importedIds: js.Array[java.lang.String],
    isEntry: scala.Boolean,
    isExternal: scala.Boolean
  ): Anon_HasModuleSideEffects = {
    val __obj = js.Dynamic.literal(hasModuleSideEffects = hasModuleSideEffects, id = id, importedIds = importedIds, isEntry = isEntry, isExternal = isExternal)
  
    __obj.asInstanceOf[Anon_HasModuleSideEffects]
  }
}

