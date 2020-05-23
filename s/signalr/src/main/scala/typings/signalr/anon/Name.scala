package typings.signalr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String
  def supportsKeepAlive(): Boolean
}

object Name {
  @scala.inline
  def apply(name: String, supportsKeepAlive: () => Boolean): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], supportsKeepAlive = js.Any.fromFunction0(supportsKeepAlive))
    __obj.asInstanceOf[Name]
  }
}

