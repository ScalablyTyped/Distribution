package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Exited extends js.Object {
  var exited: js.Any
  var exiting: js.Any
}

object Anon_Exited {
  @scala.inline
  def apply(exited: js.Any, exiting: js.Any): Anon_Exited = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exited")(exited)
    __obj.updateDynamic("exiting")(exiting)
    __obj.asInstanceOf[Anon_Exited]
  }
}

