package typings.signalr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: String
  def supportsKeepAlive(): Boolean
}

object Anon_Name {
  @scala.inline
  def apply(name: String, supportsKeepAlive: () => Boolean): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name, supportsKeepAlive = js.Any.fromFunction0(supportsKeepAlive))
  
    __obj.asInstanceOf[Anon_Name]
  }
}

