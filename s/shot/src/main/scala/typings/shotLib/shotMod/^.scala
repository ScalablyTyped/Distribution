package typings
package shotLib.shotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shot", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def inject(dispatchFunc: shotLib.shotMod.Listener, options: shotLib.shotMod.RequestOptions): js.Promise[shotLib.shotMod.ResponseObject] = js.native
  def isInjection(obj: js.Any): scala.Boolean = js.native
}

