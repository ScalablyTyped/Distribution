package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeafProperties extends js.Object {
  var marks: js.UndefOr[immutableLib.immutableMod.Set[Mark]] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object LeafProperties {
  @scala.inline
  def apply(marks: immutableLib.immutableMod.Set[Mark] = null, text: java.lang.String = null): LeafProperties = {
    val __obj = js.Dynamic.literal()
    if (marks != null) __obj.updateDynamic("marks")(marks)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[LeafProperties]
  }
}

