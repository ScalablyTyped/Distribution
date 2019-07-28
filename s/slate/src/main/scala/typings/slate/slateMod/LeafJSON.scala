package typings.slate.slateMod

import typings.slate.slateStrings.leaf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeafJSON extends js.Object {
  var marks: js.UndefOr[js.Array[MarkJSON]] = js.undefined
  var `object`: leaf
  var text: js.UndefOr[String] = js.undefined
}

object LeafJSON {
  @scala.inline
  def apply(`object`: leaf, marks: js.Array[MarkJSON] = null, text: String = null): LeafJSON = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`)
    if (marks != null) __obj.updateDynamic("marks")(marks)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[LeafJSON]
  }
}

