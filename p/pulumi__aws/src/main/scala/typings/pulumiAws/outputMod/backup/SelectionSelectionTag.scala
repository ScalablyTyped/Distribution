package typings.pulumiAws.outputMod.backup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionSelectionTag extends js.Object {
  /**
    * The key in a key-value pair.
    */
  var key: String = js.native
  /**
    * An operation, such as `StringEquals`, that is applied to a key-value pair used to filter resources in a selection.
    */
  var `type`: String = js.native
  /**
    * The value in a key-value pair.
    */
  var value: String = js.native
}

object SelectionSelectionTag {
  @scala.inline
  def apply(key: String, `type`: String, value: String): SelectionSelectionTag = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionSelectionTag]
  }
}

