package typings
package refluxLib.refluxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Listenable extends js.Object {
  @JSName("listen")
  var listen_Original: ListenFn = js.native
  def listen(params: js.Any*): js.Any = js.native
}

