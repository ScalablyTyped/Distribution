package typings
package seamlessLib.SeamlessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Static extends js.Object {
  var options: ConnectOptions
  def connect(options: ConnectOptions): Connection
}

object Static {
  @scala.inline
  def apply(connect: js.Function1[ConnectOptions, Connection], options: ConnectOptions): Static = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connect")(connect)
    __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Static]
  }
}

