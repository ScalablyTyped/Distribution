package typings
package restifyLib.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestFileInterface extends js.Object {
  var path: java.lang.String
  var `type`: java.lang.String
}

object RequestFileInterface {
  @scala.inline
  def apply(path: java.lang.String, `type`: java.lang.String): RequestFileInterface = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[RequestFileInterface]
  }
}

