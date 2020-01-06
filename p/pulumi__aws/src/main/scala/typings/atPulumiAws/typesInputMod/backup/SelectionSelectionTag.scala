package typings.atPulumiAws.typesInputMod.backup

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionSelectionTag extends js.Object {
  /**
    * The key in a key-value pair.
    */
  var key: Input[String] = js.native
  /**
    * An operation, such as `StringEquals`, that is applied to a key-value pair used to filter resources in a selection.
    */
  var `type`: Input[String] = js.native
  /**
    * The value in a key-value pair.
    */
  var value: Input[String] = js.native
}

object SelectionSelectionTag {
  @scala.inline
  def apply(key: Input[String], `type`: Input[String], value: Input[String]): SelectionSelectionTag = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionSelectionTag]
  }
}

