package typings.slate.slateMod

import typings.immutable.Immutable.Set
import typings.slate.slateStrings.leaf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeafProperties extends js.Object {
  var marks: js.UndefOr[Set[Mark] | js.Array[Mark]] = js.undefined
  var `object`: js.UndefOr[leaf] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object LeafProperties {
  @scala.inline
  def apply(marks: Set[Mark] | js.Array[Mark] = null, `object`: leaf = null, text: String = null): LeafProperties = {
    val __obj = js.Dynamic.literal()
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeafProperties]
  }
}

