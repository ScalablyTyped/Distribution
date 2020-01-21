package typings.slate.mod

import typings.slate.slateStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextJSON extends NodeJSON {
  var key: js.UndefOr[String] = js.undefined
  var marks: js.UndefOr[js.Array[MarkJSON]] = js.undefined
  var `object`: js.UndefOr[text] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object TextJSON {
  @scala.inline
  def apply(key: String = null, marks: js.Array[MarkJSON] = null, `object`: text = null, text: String = null): TextJSON = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextJSON]
  }
}

