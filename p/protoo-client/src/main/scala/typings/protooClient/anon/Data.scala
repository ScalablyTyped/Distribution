package typings.protooClient.anon

import typings.protooClient.mod.ProtooResponse
import typings.protooClient.protooClientBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends ProtooResponse {
  var data: js.Any
  var id: Double
  var ok: `true`
  var response: `true`
}

object Data {
  @scala.inline
  def apply(data: js.Any, id: Double, ok: `true`, response: `true`): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

