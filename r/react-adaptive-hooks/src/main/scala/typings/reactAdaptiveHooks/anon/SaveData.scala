package typings.reactAdaptiveHooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveData extends js.Object {
  var saveData: Boolean | Null
  var unsupported: Boolean
}

object SaveData {
  @scala.inline
  def apply(unsupported: Boolean, saveData: Boolean = null.asInstanceOf[Boolean]): SaveData = {
    val __obj = js.Dynamic.literal(unsupported = unsupported.asInstanceOf[js.Any], saveData = saveData.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveData]
  }
}

