package typings
package rxDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetDisposable extends js.Object {
  def getDisposable(): rxDashCoreLib.RxNs.IDisposable
}

object Anon_GetDisposable {
  @scala.inline
  def apply(getDisposable: () => rxDashCoreLib.RxNs.IDisposable): Anon_GetDisposable = {
    val __obj = js.Dynamic.literal(getDisposable = js.Any.fromFunction0(getDisposable))
  
    __obj.asInstanceOf[Anon_GetDisposable]
  }
}

