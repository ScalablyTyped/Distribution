package typings
package rxDashCoreLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisposable extends js.Object {
  def dispose(): scala.Unit
}

object IDisposable {
  @scala.inline
  def apply(dispose: js.Function0[scala.Unit]): IDisposable = {
    val __obj = js.Dynamic.literal(dispose = dispose)
  
    __obj.asInstanceOf[IDisposable]
  }
}

