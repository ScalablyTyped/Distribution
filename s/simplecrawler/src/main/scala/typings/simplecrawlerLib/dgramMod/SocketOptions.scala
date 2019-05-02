package typings
package simplecrawlerLib.dgramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketOptions extends js.Object {
  var reuseAddr: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: SocketType
}

object SocketOptions {
  @scala.inline
  def apply(`type`: SocketType, reuseAddr: js.UndefOr[scala.Boolean] = js.undefined): SocketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(reuseAddr)) __obj.updateDynamic("reuseAddr")(reuseAddr)
    __obj.asInstanceOf[SocketOptions]
  }
}

