package typings.restify.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestFileInterface extends js.Object {
  var path: String
  var `type`: String
}

object RequestFileInterface {
  @scala.inline
  def apply(path: String, `type`: String): RequestFileInterface = {
    val __obj = js.Dynamic.literal(path = path)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RequestFileInterface]
  }
}

