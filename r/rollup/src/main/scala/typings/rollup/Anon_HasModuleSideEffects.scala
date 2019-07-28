package typings.rollup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HasModuleSideEffects extends js.Object {
  var hasModuleSideEffects: Boolean
  var id: String
  var importedIds: js.Array[String]
  var isEntry: Boolean
  var isExternal: Boolean
}

object Anon_HasModuleSideEffects {
  @scala.inline
  def apply(
    hasModuleSideEffects: Boolean,
    id: String,
    importedIds: js.Array[String],
    isEntry: Boolean,
    isExternal: Boolean
  ): Anon_HasModuleSideEffects = {
    val __obj = js.Dynamic.literal(hasModuleSideEffects = hasModuleSideEffects, id = id, importedIds = importedIds, isEntry = isEntry, isExternal = isExternal)
  
    __obj.asInstanceOf[Anon_HasModuleSideEffects]
  }
}

