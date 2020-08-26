package typings.pulumiAws.inputMod.backup

import typings.pulumiPulumi.outputMod.Input
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
  @scala.inline
  implicit class SelectionSelectionTagOps[Self <: SelectionSelectionTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: Input[String]): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Input[String]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

