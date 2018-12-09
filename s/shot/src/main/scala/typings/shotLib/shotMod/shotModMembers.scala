package typings
package shotLib.shotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shot", JSImport.Namespace)
@js.native
object shotModMembers extends js.Object {
  def inject(dispatchFunc: Listener, options: RequestOptions): js.Promise[ResponseObject] = js.native
  def isInjection(obj: js.Any): scala.Boolean = js.native
}

