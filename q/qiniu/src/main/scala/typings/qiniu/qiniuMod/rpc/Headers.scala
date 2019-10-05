package typings.qiniu.qiniuMod.rpc

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
    if (Connection != null) __obj.updateDynamic("Connection")(Connection)
    if (`User-Agent` != null) __obj.updateDynamic("User-Agent")(`User-Agent`)
    __obj.asInstanceOf[Headers]
  }
}

