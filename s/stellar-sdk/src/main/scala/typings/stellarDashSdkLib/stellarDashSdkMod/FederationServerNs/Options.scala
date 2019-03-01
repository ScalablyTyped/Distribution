package typings
package stellarDashSdkLib.stellarDashSdkMod.FederationServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowHttp: scala.Boolean
}

object Options {
  @scala.inline
  def apply(allowHttp: scala.Boolean): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowHttp")(allowHttp)
    __obj.asInstanceOf[Options]
  }
}

