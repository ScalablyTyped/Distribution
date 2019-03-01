package typings
package quillLib.quillMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalAttributes extends js.Object {
  var attributes: js.UndefOr[StringMap] = js.undefined
}

object OptionalAttributes {
  @scala.inline
  def apply(attributes: StringMap = null): OptionalAttributes = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    __obj.asInstanceOf[OptionalAttributes]
  }
}

