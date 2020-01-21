package typings.qiniu.mod.rpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headers extends js.Object {
  var Connection: js.UndefOr[String] = js.undefined
  var `User-Agent`: js.UndefOr[String] = js.undefined
}

object Headers {
  @scala.inline
  def apply(Connection: String = null, `User-Agent`: String = null): Headers = {
    val __obj = js.Dynamic.literal()
    if (Connection != null) __obj.updateDynamic("Connection")(Connection.asInstanceOf[js.Any])
    if (`User-Agent` != null) __obj.updateDynamic("User-Agent")(`User-Agent`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
}

