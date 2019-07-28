package typings.slate.slateMod

import typings.immutable.immutableMod.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeafProperties extends js.Object {
  var marks: js.UndefOr[Set[Mark]] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object LeafProperties {
  @scala.inline
  def apply(marks: Set[Mark] = null, text: String = null): LeafProperties = {
    val __obj = js.Dynamic.literal()
    if (marks != null) __obj.updateDynamic("marks")(marks)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[LeafProperties]
  }
}

