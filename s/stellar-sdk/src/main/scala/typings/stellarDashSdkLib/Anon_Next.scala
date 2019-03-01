package typings
package stellarDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Next extends js.Object {
  var next: stellarDashSdkLib.stellarDashSdkMod.HorizonNs.ResponseLink
  var prev: stellarDashSdkLib.stellarDashSdkMod.HorizonNs.ResponseLink
  var self: stellarDashSdkLib.stellarDashSdkMod.HorizonNs.ResponseLink
}

object Anon_Next {
  @scala.inline
  def apply(
    next: stellarDashSdkLib.stellarDashSdkMod.HorizonNs.ResponseLink,
    prev: stellarDashSdkLib.stellarDashSdkMod.HorizonNs.ResponseLink,
    self: stellarDashSdkLib.stellarDashSdkMod.HorizonNs.ResponseLink
  ): Anon_Next = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("next")(next)
    __obj.updateDynamic("prev")(prev)
    __obj.updateDynamic("self")(self)
    __obj.asInstanceOf[Anon_Next]
  }
}

