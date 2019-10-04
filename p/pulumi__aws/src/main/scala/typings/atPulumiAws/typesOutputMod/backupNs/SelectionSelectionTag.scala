package typings.atPulumiAws.typesOutputMod.backupNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionSelectionTag extends js.Object {
  /**
    * The key in a key-value pair.
    */
  var key: String
  /**
    * An operation, such as `StringEquals`, that is applied to a key-value pair used to filter resources in a selection.
    */
  var `type`: String
  /**
    * The value in a key-value pair.
    */
  var value: String
}

object SelectionSelectionTag {
  @scala.inline
  def apply(key: String, `type`: String, value: String): SelectionSelectionTag = {
    val __obj = js.Dynamic.literal(key = key, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SelectionSelectionTag]
  }
}

