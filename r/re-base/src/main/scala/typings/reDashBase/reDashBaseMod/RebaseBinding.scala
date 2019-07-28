package typings.reDashBase.reDashBaseMod

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
    val __obj = js.Dynamic.literal(context = context, endpoint = endpoint, id = id, method = method)
  
    __obj.asInstanceOf[RebaseBinding]
  }
}

