package typings.reactHotkeys.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyMapDisplayOptions extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var group: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var sequences: js.Array[KeyMapOptions]
}

object KeyMapDisplayOptions {
  @scala.inline
  def apply(
    sequences: js.Array[KeyMapOptions],
    description: String = null,
    group: String = null,
    name: String = null
  ): KeyMapDisplayOptions = {
    val __obj = js.Dynamic.literal(sequences = sequences.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyMapDisplayOptions]
  }
}

