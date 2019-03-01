package typings
package retryDashRequestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Abort extends js.Object {
  def abort(): scala.Unit
}

object Anon_Abort {
  @scala.inline
  def apply(abort: js.Function0[scala.Unit]): Anon_Abort = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort)
    __obj.asInstanceOf[Anon_Abort]
  }
}

