package typings.signalr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  def supportsKeepAlive(): Boolean
}

object AnonName {
  @scala.inline
  def apply(name: String, supportsKeepAlive: () => Boolean): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], supportsKeepAlive = js.Any.fromFunction0(supportsKeepAlive))
    __obj.asInstanceOf[AnonName]
  }
}

