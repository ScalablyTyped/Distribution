package typings.slate.mod

import typings.slate.slateStrings.leaf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeafJSON extends js.Object {
  var marks: js.UndefOr[js.Array[MarkJSON]] = js.undefined
  var `object`: js.UndefOr[leaf] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object LeafJSON {
  @scala.inline
  def apply(marks: js.Array[MarkJSON] = null, `object`: leaf = null, text: String = null): LeafJSON = {
    val __obj = js.Dynamic.literal()
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeafJSON]
  }
}

