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
  def apply(getDisposable: js.Function0[rxDashCoreLib.RxNs.IDisposable]): Anon_GetDisposable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDisposable")(getDisposable)
    __obj.asInstanceOf[Anon_GetDisposable]
  }
}

