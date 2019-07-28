package typings.secureDashPassword

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Memlimit extends js.Object {
  var memlimit: js.UndefOr[Double] = js.undefined
  var opslimit: js.UndefOr[Double] = js.undefined
}

object Anon_Memlimit {
  @scala.inline
  def apply(memlimit: Int | Double = null, opslimit: Int | Double = null): Anon_Memlimit = {
    val __obj = js.Dynamic.literal()
    if (memlimit != null) __obj.updateDynamic("memlimit")(memlimit.asInstanceOf[js.Any])
    if (opslimit != null) __obj.updateDynamic("opslimit")(opslimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Memlimit]
  }
}

