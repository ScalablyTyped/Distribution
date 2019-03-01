package typings
package resourcejsLib.resourcejsMod.resourcejsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  var error: Error
  var item: js.Any
  var status: scala.Double
}

object Resource {
  @scala.inline
  def apply(error: Error, item: js.Any, status: scala.Double): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("item")(item)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Resource]
  }
}

