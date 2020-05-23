package typings.securePassword.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Memlimit extends js.Object {
  var memlimit: js.UndefOr[Double] = js.undefined
  var opslimit: js.UndefOr[Double] = js.undefined
}

object Memlimit {
  @scala.inline
  def apply(memlimit: js.UndefOr[Double] = js.undefined, opslimit: js.UndefOr[Double] = js.undefined): Memlimit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(memlimit)) __obj.updateDynamic("memlimit")(memlimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opslimit)) __obj.updateDynamic("opslimit")(opslimit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Memlimit]
  }
}

