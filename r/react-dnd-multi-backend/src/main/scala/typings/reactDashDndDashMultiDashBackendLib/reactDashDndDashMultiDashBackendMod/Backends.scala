package typings
package reactDashDndDashMultiDashBackendLib.reactDashDndDashMultiDashBackendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Backends extends js.Object {
  /**
    * The array of backends to use. The first backend in the list is used as the default backend.
    * This means that you can start with the html5 backend, and fall-back to a touch backend if
    * the event is not one that is compatible with the html5 backend.
    */
  var backends: js.Array[BackendDeclaration]
}

object Backends {
  @scala.inline
  def apply(backends: js.Array[BackendDeclaration]): Backends = {
    val __obj = js.Dynamic.literal(backends = backends)
  
    __obj.asInstanceOf[Backends]
  }
}

