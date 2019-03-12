package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextProperties extends NodeProperties {
  var key: js.UndefOr[java.lang.String] = js.undefined
  var marks: js.UndefOr[js.Array[Mark]] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object TextProperties {
  @scala.inline
  def apply(key: java.lang.String = null, marks: js.Array[Mark] = null, text: java.lang.String = null): TextProperties = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (marks != null) __obj.updateDynamic("marks")(marks)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TextProperties]
  }
}

