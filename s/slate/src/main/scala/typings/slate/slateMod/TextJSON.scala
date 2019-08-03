package typings.slate.slateMod

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
    if (key != null) __obj.updateDynamic("key")(key)
    if (marks != null) __obj.updateDynamic("marks")(marks)
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TextJSON]
  }
}

