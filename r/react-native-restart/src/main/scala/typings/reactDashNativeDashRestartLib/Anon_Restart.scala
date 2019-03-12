package typings
package reactDashNativeDashRestartLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Restart extends js.Object {
  def Restart(): scala.Unit
}

object Anon_Restart {
  @scala.inline
  def apply(Restart: () => scala.Unit): Anon_Restart = {
    val __obj = js.Dynamic.literal(Restart = js.Any.fromFunction0(Restart))
  
    __obj.asInstanceOf[Anon_Restart]
  }
}

