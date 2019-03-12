package typings
package signalrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: java.lang.String
  def supportsKeepAlive(): scala.Boolean
}

object Anon_Name {
  @scala.inline
  def apply(name: java.lang.String, supportsKeepAlive: () => scala.Boolean): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name, supportsKeepAlive = js.Any.fromFunction0(supportsKeepAlive))
  
    __obj.asInstanceOf[Anon_Name]
  }
}

