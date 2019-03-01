package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Proxy[T /* <: js.Object */] extends js.Object {
  var proxy: T
  def revoke(): scala.Unit
}

object Anon_Proxy {
  @scala.inline
  def apply[T /* <: js.Object */](proxy: T, revoke: js.Function0[scala.Unit]): Anon_Proxy[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    __obj.updateDynamic("revoke")(revoke)
    __obj.asInstanceOf[Anon_Proxy[T]]
  }
}

