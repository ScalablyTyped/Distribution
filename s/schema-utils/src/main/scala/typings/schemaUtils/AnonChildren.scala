package typings.schemaUtils

import typings.ajv.mod.ErrorObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: js.UndefOr[js.Array[ErrorObject]] = js.undefined
}

object AnonChildren {
  @scala.inline
  def apply(children: js.Array[ErrorObject] = null): AnonChildren = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
}

