package typings.reBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RebaseBinding extends js.Object {
  var context: js.Object
  var endpoint: String
  var id: Double
  var method: String
}

object RebaseBinding {
  @scala.inline
  def apply(context: js.Object, endpoint: String, id: Double, method: String): RebaseBinding = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebaseBinding]
  }
}

