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
    val __obj = js.Dynamic.literal(error = error, item = item, status = status)
  
    __obj.asInstanceOf[Resource]
  }
}

