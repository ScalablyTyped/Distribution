package typings.resourcejs.resourcejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  var error: Error
  var item: js.Any
  var status: Double
}

object Resource {
  @scala.inline
  def apply(error: Error, item: js.Any, status: Double): Resource = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Resource]
  }
}

