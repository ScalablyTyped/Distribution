package typings.slate.slateMod

import typings.immutable.Immutable.Set
import typings.slate.slateStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextProperties extends NodeProperties {
  var key: js.UndefOr[String] = js.undefined
  var marks: js.UndefOr[Set[Mark] | js.Array[Mark]] = js.undefined
  var `object`: js.UndefOr[text] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object TextProperties {
  @scala.inline
  def apply(
    key: String = null,
    marks: Set[Mark] | js.Array[Mark] = null,
    `object`: text = null,
    text: String = null
  ): TextProperties = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextProperties]
  }
}

