package typings.reactHotkeys.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactHotkeys.mod._KeySequence because Already inherited */ trait ExtendedKeyMapOptions extends KeyMapOptions {
  var description: js.UndefOr[String] = js.undefined
  var group: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var sequences: js.Array[KeyMapOptions | MouseTrapKeySequence]
}

object ExtendedKeyMapOptions {
  @scala.inline
  def apply(
    action: KeyEventName,
    sequence: MouseTrapKeySequence,
    sequences: js.Array[KeyMapOptions | MouseTrapKeySequence],
    description: String = null,
    group: String = null,
    name: String = null
  ): ExtendedKeyMapOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], sequences = sequences.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedKeyMapOptions]
  }
}

