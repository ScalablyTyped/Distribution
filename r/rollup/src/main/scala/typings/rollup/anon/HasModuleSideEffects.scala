package typings.rollup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasModuleSideEffects extends js.Object {
  var hasModuleSideEffects: Boolean
  var id: String
  var importedIds: js.Array[String]
  var isEntry: Boolean
  var isExternal: Boolean
}

object HasModuleSideEffects {
  @scala.inline
  def apply(
    hasModuleSideEffects: Boolean,
    id: String,
    importedIds: js.Array[String],
    isEntry: Boolean,
    isExternal: Boolean
  ): HasModuleSideEffects = {
    val __obj = js.Dynamic.literal(hasModuleSideEffects = hasModuleSideEffects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], importedIds = importedIds.asInstanceOf[js.Any], isEntry = isEntry.asInstanceOf[js.Any], isExternal = isExternal.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasModuleSideEffects]
  }
}

