package typings.securePassword

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMemlimit extends js.Object {
  var memlimit: js.UndefOr[Double] = js.undefined
  var opslimit: js.UndefOr[Double] = js.undefined
}

object AnonMemlimit {
  @scala.inline
  def apply(memlimit: Int | Double = null, opslimit: Int | Double = null): AnonMemlimit = {
    val __obj = js.Dynamic.literal()
    if (memlimit != null) __obj.updateDynamic("memlimit")(memlimit.asInstanceOf[js.Any])
    if (opslimit != null) __obj.updateDynamic("opslimit")(opslimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMemlimit]
  }
}

